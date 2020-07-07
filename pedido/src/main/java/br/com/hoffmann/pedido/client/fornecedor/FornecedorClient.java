package br.com.hoffmann.pedido.client.fornecedor;

import br.com.hoffmann.pedido.client.fornecedor.response.FornecedorResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(url = "${fornecedor.client}", name = "FornecedorClient")
public interface FornecedorClient {

    @RequestMapping(value = "/buscaFornecedores", method = RequestMethod.GET)
    List<FornecedorResponse> buscaFornecedores();

    @RequestMapping(value = "/buscaFornecedor/{cnpj}", method = RequestMethod.GET)
    FornecedorResponse buscaFornecedorPorCNPJ(@PathVariable(value = "cnpj") String cnpj);
}
