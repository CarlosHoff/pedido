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
@Table(name = "PEDIDO")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SQ_PEDIDO")
    @SequenceGenerator(sequenceName = "SQ_PEDIDO", allocationSize = 1, name = "SQ_PEDIDO")
    @Column(name = "ID")
    private Long id;

    @Column(name = "DESCRICAO", length = 80, nullable = false)
    private String descricao;
}
