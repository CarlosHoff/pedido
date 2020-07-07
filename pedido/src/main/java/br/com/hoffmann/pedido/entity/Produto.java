package br.com.hoffmann.pedido.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Table(name = "PRODUTO")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SQ_PRODUTO")
    @SequenceGenerator(sequenceName = "SQ_PRODUTO", allocationSize = 1, name = "SQ_PRODUTO")
    @Column(name = "PRODUTO_ID")
    private Long produtoId;

    @ManyToOne
    @JoinColumn(name="PEDIDO_ID")
    private Pedido pedido;

    @Column(name = "QTDE_PRODUTO", nullable = false)
    private Long quantidade;

    @Column(name = "VALOR_UNITARIO", nullable = false)
    private Double valorUnitario;

    @Column(name = "VALOR_PRODUTOS", nullable = false)
    private Double valorTotalCadaProduto;

    @Column(name = "PREVISAO_ENTREGA", nullable = false)
    private LocalDate previsaoEntrega;

}
