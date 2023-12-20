package com.api.blogdev.controllers;

import com.api.blogdev.dtos.NoticiaDTO;
import com.api.blogdev.services.NoticiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/noticia")
public class NoticiaController {
    @Autowired
    NoticiaService noticiaService;

    public NoticiaDTO create(@RequestBody NoticiaDTO noticia){
        return  noticiaService.create(noticia);
    }

}
