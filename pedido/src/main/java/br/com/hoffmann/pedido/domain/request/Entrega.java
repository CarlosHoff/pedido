package br.com.hoffmann.pedido.domain.request;

import br.com.hoffmann.pedido.entity.Pedido;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@EqualsAndHashCode
public class Entrega {

    @NotNull
    private Long enderecoEntregaID;

    @NotNull
    private Pedido pedido;

    @NotNull
    private String cep;

    @NotNull
    private String endereco;

    @NotNull
    private Long numero;

    private String complemento;

    @NotNull
    private String bairro;

    @NotNull
    private String cidade;

    @NotNull
    private String estado;

    @NotNull
    private String pais;
}
