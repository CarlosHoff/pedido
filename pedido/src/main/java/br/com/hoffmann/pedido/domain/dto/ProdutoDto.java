package br.com.hoffmann.pedido.domain.dto;

import br.com.hoffmann.pedido.entity.Produto;

import java.time.LocalDate;

public class ProdutoDto {

    private Long produtoID;

    private Long qtdeProduto;

    private Double valorUnitario;

    private Double valorTotalCadaProduto;

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

    public Double getValorTotalCadaProduto() {
        return valorTotalCadaProduto;
    }

    public void setValorTotalCadaProduto(Double valorTotalCadaProduto) {
        this.valorTotalCadaProduto = valorTotalCadaProduto;
    }
}
