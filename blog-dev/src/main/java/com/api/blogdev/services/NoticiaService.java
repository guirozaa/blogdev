package com.api.blogdev.services;


import com.api.blogdev.models.Noticia;
import com.api.blogdev.repositories.NoticiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class NoticiaService {
    @Autowired
    NoticiaRepository noticiaRepository;

    public Noticia save(Noticia noticia){
        return noticiaRepository.save(noticia);
    }

    public void delete(Long id){
        Noticia entity = noticiaRepository.findById(id).orElseThrow();
        noticiaRepository.delete(entity);
    }

    public List<Noticia> findAll(){
        List<Noticia> noticias = noticiaRepository.findAll();
        return noticiaRepository.findAll();
    }

    public Noticia findById(Long id){
        Noticia noticia = noticiaRepository.findById(id).orElseThrow();
        return noticia;
    }

}
