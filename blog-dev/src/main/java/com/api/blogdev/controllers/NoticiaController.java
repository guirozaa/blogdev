package com.api.blogdev.controllers;

import com.api.blogdev.dtos.NoticiaDTO;
import com.api.blogdev.models.Noticia;
import com.api.blogdev.services.NoticiaService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;


@RestController
@RequestMapping("/noticia")
public class NoticiaController {
    @Autowired
    NoticiaService noticiaService;

    @PostMapping
    public Noticia create(@RequestBody Noticia noticia){
        return noticiaService.save(noticia);
    }


    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable(value = "id")Long id){
        noticiaService.delete(id);
    }

    @GetMapping
    public List<Noticia> findAll(){
        return noticiaService.findAll();
    }

    @GetMapping(value = "/{id}")
    public Noticia findById(@PathVariable(value = "id")Long id){
        return noticiaService.findById(id);
    }

    }


