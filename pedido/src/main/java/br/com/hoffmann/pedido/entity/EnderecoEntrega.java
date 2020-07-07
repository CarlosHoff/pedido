package br.com.hoffmann.pedido.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Table(name = "ENDERECO_ENTREGA")
public class EnderecoEntrega {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ENDERECO_ENTREGA_ID")
    private Long enderecoEntregaID;

    @OneToOne
    @JoinColumn(name="PEDIDO_ID")
    private Pedido pedido;

    @Column(name = "CEP")
    private String cep;

    @Column(name = "ENDERECO")
    private String endereco;

    @Column(name = "NUMERO")
    private Long numero;

    @Column(name = "COMPLEMENTO")
    private String complemento;

    @Column(name = "BAIRRO")
    private String bairro;

    @Column(name = "CIDADE")
    private String cidade;

    @Column(name = "ESTADO")
    private String estado;

    @Column(name = "PAIS")
    private String pais;
}
