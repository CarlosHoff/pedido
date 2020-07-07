package br.com.hoffmann.pedido.domain.request;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@EqualsAndHashCode
public class Produto {

    private Long produtoID;

    private Long qtdeProduto;

    private Double valorUnitario;

    private LocalDate previsaoEntrega;

}
