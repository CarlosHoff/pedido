package br.com.hoffmann.pedido.client.fabricante;

import br.com.hoffmann.pedido.client.fabricante.response.FindFabricanteResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(url = "${fabricante.client}", name = "FabricanteClient")
public interface FabricanteClient {

    @RequestMapping(value = "/buscaFabricantes", method = RequestMethod.GET)
    List<FindFabricanteResponse> buscaFabricantes();

    @RequestMapping(value = "/buscaFabricantes/{cnpj}", method = RequestMethod.GET)
    FindFabricanteResponse buscaFabricantePorCnpj(@PathVariable(value = "cnpj") String cnpj);
}
