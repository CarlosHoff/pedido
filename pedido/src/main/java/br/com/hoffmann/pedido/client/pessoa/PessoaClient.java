package br.com.hoffmann.pedido.client.pessoa;

import br.com.hoffmann.pedido.client.pessoa.response.FindPessoaResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(url = "${pessoa.client}", name = "PessoaClient")
public interface PessoaClient {

    @RequestMapping(value = "/buscaPessoa/{id}", method = RequestMethod.GET)
    FindPessoaResponse buscaPessoa(@PathVariable(value = "id") Long id);

    @RequestMapping(value = "/buscaPessoas", method = RequestMethod.GET)
    List<FindPessoaResponse> buscaPessoas();

}
