package com.api.blogdev.models;

import jakarta.persistence.*;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.UUID;

@Entity
@Table(name = "TB_NOTICIA")

public class Noticia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID idNoticia;
    @Column(nullable = false, unique = false, length = 30)
    private String nomeNoticia;
    @Column(nullable = false, unique = false)
    private String descNoticia;
    @Column(nullable = false, unique = false, length = 30)
    private String autorNoticia;
    @Column(nullable = false, unique = false, length = 10)
    private LocalDateTime dataNoticia;
    @Column(nullable = false)
    private String infoNoticia;


    public UUID getIdNoticia() {
        return idNoticia;
    }

    public void setIdNoticia(UUID idNoticia) {
        this.idNoticia = idNoticia;
    }

    public String getNomeNoticia() {
        return nomeNoticia;
    }

    public void setNomeNoticia(String nomeNoticia) {
        this.nomeNoticia = nomeNoticia;
    }

    public String getDescNoticia() {
        return descNoticia;
    }

    public void setDescNoticia(String descNoticia) {
        this.descNoticia = descNoticia;
    }

    public String getAutorNoticia() {
        return autorNoticia;
    }

    public void setAutorNoticia(String autorNoticia) {
        this.autorNoticia = autorNoticia;
    }

    public LocalDateTime getDataNoticia() {
        return dataNoticia;
    }

    public void setDataNoticia(LocalDateTime dataNoticia) {
        this.dataNoticia = dataNoticia;
    }

    public String getInfoNoticia() {
        return infoNoticia;
    }

    public void setInfoNoticia(String infoNoticia) {
        this.infoNoticia = infoNoticia;
    }
}
