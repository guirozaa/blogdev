package com.api.blogdev.dtos;


import jakarta.validation.constraints.NotBlank;

public class NoticiaDTO {

    @NotBlank
    private String nomeNoticia;
    @NotBlank
    private String descNoticia;
    @NotBlank
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
