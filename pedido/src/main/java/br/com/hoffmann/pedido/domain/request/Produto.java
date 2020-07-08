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

    public Long getProdutoID() {
        return produtoID;
    }

    public void setProdutoID(Long produtoID) {
        this.produtoID = produtoID;
    }

    public Long getQtdeProduto() {
        return qtdeProduto;
    }

    public void setQtdeProduto(Long qtdeProduto) {
        this.qtdeProduto = qtdeProduto;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public LocalDate getPrevisaoEntrega() {
        return previsaoEntrega;
    }

    public void setPrevisaoEntrega(LocalDate previsaoEntrega) {
        this.previsaoEntrega = previsaoEntrega;
    }
}
