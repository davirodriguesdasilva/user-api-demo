package br.com.user.domain.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "TB_USER")
public class User {
    @Id
    @Column(name = "ID")
    @SequenceGenerator(sequenceName = "SQ_USER", allocationSize = 1, name = "user_seq_gen")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq_gen")
    private Long id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "DOCUMENT", nullable = false, unique = true)
    private String document;
}
