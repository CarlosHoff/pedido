package br.com.hoffmann.pedido.domain.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode
public class PedidoResponse implements Serializable {

    @ApiModelProperty(value = "Numero do Pedido")
    private Long pedidoId;

    @ApiModelProperty(value = "Mensagem de retorno")
    private String mensagem;
}
