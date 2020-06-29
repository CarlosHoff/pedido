package br.com.hoffmann.pedido.controller;

import io.swagger.annotations.Api;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "Geração de pedido - endPoints API", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@RestController
@Validated
@RequestMapping(path = "/v1/pedido")
public class PedidoController {


    @RequestMapping(value = "/geraPedido", method = RequestMethod.POST)
    public String getString(){
        return "Hello";
    }
}
