package com.api.blogdev.services;


import com.api.blogdev.dtos.NoticiaDTO;
import com.api.blogdev.models.Noticia;
import com.api.blogdev.repositories.NoticiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoticiaService {
    @Autowired
    NoticiaRepository noticiaRepository;


    public NoticiaDTO create(NoticiaDTO profession){
        return null;
    }
}
