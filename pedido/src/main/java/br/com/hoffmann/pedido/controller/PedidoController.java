package br.com.hoffmann.pedido.controller;

import br.com.hoffmann.pedido.domain.request.PedidoRequest;
import br.com.hoffmann.pedido.domain.response.PedidoResponse;
import br.com.hoffmann.pedido.service.PedidoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Api(value = "Geração de pedido - endPoints API", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@RestController
@Validated
@RequestMapping(path = "/v1/pedido")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @ApiOperation(value = "EndPoint para gerar pedido")
    @RequestMapping(value = "/geraPedido", method = RequestMethod.POST)
    public ResponseEntity<PedidoResponse> geraPedido(
            @RequestBody @Valid PedidoRequest request) {
        PedidoResponse response = pedidoService.createPedido(request);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

}
