package com.api.blogdev.models;


import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "TB_USUARIO")
public class Usuario{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID idUsuario;
    @Column(nullable = false, unique = true, length = 50)
    private String nomeUsuario;
    @Column(nullable = false, unique = true, length = 50)
    private String emailUsuario;
    @Column(nullable = false, unique = true, length = 50)
    private String senhaUsuario;


    public UUID getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(UUID idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }
}
