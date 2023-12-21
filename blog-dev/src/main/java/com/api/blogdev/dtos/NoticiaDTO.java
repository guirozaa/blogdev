package com.api.blogdev.dtos;


import jakarta.validation.constraints.NotBlank;

public class NoticiaDTO {

    private String nomeNoticia;

    private String descNoticia;

    private String infoNoticia;

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

    public String getInfoNoticia() {
        return infoNoticia;
    }

    public void setInfoNoticia(String infoNoticia) {
        this.infoNoticia = infoNoticia;
    }
}
