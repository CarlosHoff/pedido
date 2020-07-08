package br.com.hoffmann.pedido.service;

import br.com.hoffmann.pedido.client.fornecedor.FornecedorClient;
import br.com.hoffmann.pedido.client.produto.ProdutoClient;
import br.com.hoffmann.pedido.client.usuario.PessoaClient;
import br.com.hoffmann.pedido.domain.enums.FormaPagamento;
import br.com.hoffmann.pedido.domain.request.PedidoRequest;
import br.com.hoffmann.pedido.domain.response.PedidoResponse;
import br.com.hoffmann.pedido.entity.EnderecoEntrega;
import br.com.hoffmann.pedido.entity.Pedido;
import br.com.hoffmann.pedido.entity.Produto;
import br.com.hoffmann.pedido.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional(value = "transactionManager")
public class PedidoService {

    private static final String PEDIDO_OK = "Pedido gerado com sucesso";

    @Autowired
    private PedidoRepository pedidoRepository;

    @Autowired
    private FornecedorClient fornecedorClient;

    @Autowired
    private PessoaClient pessoaClient;

    @Autowired
    private ProdutoClient produtoClient;

    public PedidoResponse createPedido(PedidoRequest request) {

        Pedido pedido = new Pedido();
        pedido.setCliente(request.getCliente());
        pedido.setDataPedido(LocalDate.now());
        pedido.setValorTotalNota(10.00);
        pedido.setFormaPagamento(FormaPagamento.of(request.getFormaPagamento().getCode()));

        Pedido pedidoSave = pedidoRepository.save(pedido);

        List<Produto> list = new ArrayList<>();

        list = request.getProdutoList().stream()
                .map(Produto::new).collect(Collectors.toList()).stream()
                .map(p -> {
                    p.setPedido(pedidoSave);
                    return p;
                }).collect(Collectors.toList());

        //list.stream().forEach(p -> p.setPedido(pedidoSave));

        //produtoClient.criarProduto(list);

        PedidoResponse response = new PedidoResponse();
        response.setPedidoId(pedidoSave.getPedidoId());
        response.setMensagem(PEDIDO_OK);
        return response;
    }

    private EnderecoEntrega preencheEnderecoEntrega(PedidoRequest pedidoRequest) {
        EnderecoEntrega entrega = new EnderecoEntrega();
        entrega.setCep(pedidoRequest.getEntrega().getCep());
        entrega.setEndereco(pedidoRequest.getEntrega().getEndereco());
        entrega.setNumero(pedidoRequest.getEntrega().getNumero());
        entrega.setComplemento(pedidoRequest.getEntrega().getComplemento());
        entrega.setBairro(pedidoRequest.getEntrega().getBairro());
        entrega.setCidade(pedidoRequest.getEntrega().getCidade());
        entrega.setEstado(pedidoRequest.getEntrega().getEstado());
        entrega.setPais(pedidoRequest.getEntrega().getPais());
        return entrega;
    }
}
