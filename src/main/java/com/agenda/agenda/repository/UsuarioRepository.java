package com.agenda.agenda.repository;

import com.agenda.agenda.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository  extends JpaRepository<Usuario, Integer> {

    Optional<Usuario> findByNombre(String nombre);
    boolean existsByNombre(String nombre);

}
