package br.com.hoffmann.pedido.client.usuario;

import br.com.hoffmann.pedido.client.usuario.response.UsuarioResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(url = "${pessoa.client}", name = "PessoaClient")
public interface PessoaClient {

    @RequestMapping(value = "/buscaUsuarios", method = RequestMethod.GET)
    ResponseEntity<List<UsuarioResponse>> buscaUsuarios();

    @RequestMapping(value = "/buscaUsuario/{id}", method = RequestMethod.GET)
    ResponseEntity<UsuarioResponse> buscaUsuario(@PathVariable(value = "id") Long id);
}
