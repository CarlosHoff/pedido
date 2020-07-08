package br.com.hoffmann.pedido.domain.request;

import br.com.hoffmann.pedido.domain.dto.ProdutoDto;
import br.com.hoffmann.pedido.domain.enums.FormaPagamento;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;


public class PedidoRequest implements Serializable {

    @NotNull
    @ApiModelProperty(value = "Identificação do cliente")
    @Column(name = "CLIENTE", nullable = false)
    private Long cliente;

    @NotNull
    @ApiModelProperty(value = "Lista de produtos do pedido")
    private List<ProdutoDto> produtoList;

    @NotNull
    @ApiModelProperty(value = "Forma de pagamento")
    private FormaPagamento formaPagamento;

    @ApiModelProperty(value = "Endereço de entrega")
    private Entrega entrega;

    public Long getCliente() {
        return cliente;
    }

    public void setCliente(Long cliente) {
        this.cliente = cliente;
    }

    public List<ProdutoDto> getProdutoList() {
        return produtoList;
    }

    public void setProdutoList(List<ProdutoDto> produtoList) {
        this.produtoList = produtoList;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Entrega getEntrega() {
        return entrega;
    }

    public void setEntrega(Entrega entrega) {
        this.entrega = entrega;
    }
}
