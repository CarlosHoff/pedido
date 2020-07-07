package br.com.hoffmann.pedido.domain.request;

import br.com.hoffmann.pedido.domain.enums.FormaPagamento;
import io.swagger.annotations.ApiModelProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
public class PedidoRequest implements Serializable {

    @NotNull
    @ApiModelProperty(value = "Identificação do cliente")
    private Long cliente;

    @NotNull
    @ApiModelProperty(value = "Lista de produtos do pedido")
    private List<Produto> produtoList;

    @NotNull
    @ApiModelProperty(value = "Forma de pagamento")
    private FormaPagamento formaPagamento;

    @ApiModelProperty(value = "Endereço de entrega")
    private Entrega entrega;

}
