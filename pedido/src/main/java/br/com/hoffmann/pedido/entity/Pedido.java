package br.com.hoffmann.pedido.entity;

import br.com.hoffmann.pedido.domain.enums.FormaPagamento;
import br.com.hoffmann.pedido.domain.request.PedidoRequest;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Table(name = "PEDIDO")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SQ_PEDIDO")
    @SequenceGenerator(sequenceName = "SQ_PEDIDO", allocationSize = 1, name = "SQ_PEDIDO")
    @Column(name = "PEDIDO_ID")
    private Long pedidoId;

    @Column(name = "CLIENTE", nullable = false)
    private Long cliente;


    @Column(name = "DATA_PEDIDO", nullable = false)
    private LocalDate dataPedido;

    @Column(name = "VALOR_UNITARIO", nullable = false)
    private Double valorUnitarioProduto;

    @Column(name = "VALOR_TOTAL", nullable = false)
    private Double valorTotalPorProduto;

    @Column(name = "VALOR_TOTAL_NOTA", nullable = false)
    private Double valorTotalNota;

    @Column(name = "QTDE_TOTAL_NOTA", nullable = false)
    private Long qtdeTotalNotal;

    @Column(name = "FORMA_PAGAMENTO", nullable = false)
    private FormaPagamento formaPagamento;

    public Long getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(Long pedidoId) {
        this.pedidoId = pedidoId;
    }

    public Long getCliente() {
        return cliente;
    }

    public void setCliente(Long cliente) {
        this.cliente = cliente;
    }

    public LocalDate getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDate dataPedido) {
        this.dataPedido = dataPedido;
    }

    public Double getValorUnitarioProduto() {
        return valorUnitarioProduto;
    }

    public void setValorUnitarioProduto(Double valorUnitarioProduto) {
        this.valorUnitarioProduto = valorUnitarioProduto;
    }

    public Double getValorTotalPorProduto() {
        return valorTotalPorProduto;
    }

    public void setValorTotalPorProduto(Double valorTotalPorProduto) {
        this.valorTotalPorProduto = valorTotalPorProduto;
    }

    public Double getValorTotalNota() {
        return valorTotalNota;
    }

    public void setValorTotalNota(Double valorTotalNota) {
        this.valorTotalNota = valorTotalNota;
    }

    public Long getQtdeTotalNotal() {
        return qtdeTotalNotal;
    }

    public void setQtdeTotalNotal(Long qtdeTotalNotal) {
        this.qtdeTotalNotal = qtdeTotalNotal;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
}
