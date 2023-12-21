package com.api.blogdev.models;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "TB_NOTICIA")
public class Noticia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idNoticia;
    @Column(nullable = false, unique = false, length = 30)
    private String nomeNoticia;
    @Column(nullable = false, unique = false)
    private String descNoticia;
    @Column(nullable = true, unique = false, length = 30)
    private String autorNoticia;
    @Column(nullable = false)
    private String infoNoticia;


    public Long getIdNoticia() {
        return idNoticia;
    }

    public void setIdNoticia(Long idNoticia) {
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

    public String getInfoNoticia() {
        return infoNoticia;
    }

    public void setInfoNoticia(String infoNoticia) {
        this.infoNoticia = infoNoticia;
    }
}
