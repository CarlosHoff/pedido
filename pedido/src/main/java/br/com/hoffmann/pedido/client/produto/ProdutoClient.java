package br.com.hoffmann.pedido.client.produto;

import br.com.hoffmann.pedido.client.produto.response.ProdutoResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(url = "${produto.client}", name = "ProdutoClient")
public interface ProdutoClient {

    @RequestMapping(value = "/buscaProdutos", method = RequestMethod.GET)
    List<ProdutoResponse> buscaProdutos();

    @RequestMapping(value = "/buscaProdutoPelaDescricao", method = RequestMethod.GET)
    ProdutoResponse buscaProdutoPelaDescricao(@RequestParam(value = "descricao") String descricao);
}
