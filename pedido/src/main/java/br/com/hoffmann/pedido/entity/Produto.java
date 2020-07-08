package br.com.hoffmann.pedido.entity;

import br.com.hoffmann.pedido.domain.dto.ProdutoDto;
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

    @ManyToOne(fetch = FetchType.LAZY)
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

    public Produto(){}

    public  Produto(ProdutoDto p){
        previsaoEntrega = p.getPrevisaoEntrega();
        quantidade = p.getQtdeProduto();
        valorUnitario = p.getValorUnitario();
        valorTotalCadaProduto = p.getValorTotalCadaProduto();
    }

    public Long getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(Long produtoId) {
        this.produtoId = produtoId;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Long getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Long quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Double getValorTotalCadaProduto() {
        return valorTotalCadaProduto;
    }

    public void setValorTotalCadaProduto(Double valorTotalCadaProduto) {
        this.valorTotalCadaProduto = valorTotalCadaProduto;
    }

    public LocalDate getPrevisaoEntrega() {
        return previsaoEntrega;
    }

    public void setPrevisaoEntrega(LocalDate previsaoEntrega) {
        this.previsaoEntrega = previsaoEntrega;
    }
}
