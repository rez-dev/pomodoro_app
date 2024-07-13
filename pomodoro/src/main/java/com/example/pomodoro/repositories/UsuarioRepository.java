package com.example.pomodoro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pomodoro.models.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    // This interface extends JpaRepository, which is a Spring Data interface that provides CRUD operations for the entity User.
}
