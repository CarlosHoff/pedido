package br.com.hoffmann.pedido.client.produto.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode
public class ProdutoResponse implements Serializable {

    @ApiModelProperty(value = "Produto id")
    private Long id;

    @ApiModelProperty(value = "Descricao do produto")
    private String descricao;

    @ApiModelProperty(value = "Quantidade no estoque")
    private Long qtdEstoque;

    @ApiModelProperty(value = "Preco unitario do produto")
    private Double precoUnitario;

    @ApiModelProperty(value = "Cnpj do fabricante do produto")
    private String cnpjFabricante;
}

