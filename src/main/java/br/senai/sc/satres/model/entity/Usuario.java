package br.senai.sc.satres.model.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "usuario")
@Data
@Builder
public class Usuario {

    @Id
    @Column(name = "id_usuario")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;

    @Column(name = "login")
    private String login;

    @Column(name = "senha")
    private String senha;

    @Column(name = "email")
    private String email;

}
