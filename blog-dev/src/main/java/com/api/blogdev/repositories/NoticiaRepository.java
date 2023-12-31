package com.api.blogdev.repositories;

import com.api.blogdev.models.Noticia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface NoticiaRepository extends JpaRepository<Noticia, Long> {
}
