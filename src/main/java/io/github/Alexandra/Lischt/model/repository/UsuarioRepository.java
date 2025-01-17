package io.github.Alexandra.Lischt.model.repository;

import io.github.Alexandra.Lischt.model.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Optional<Usuario> findByUsername(String username);

    // select count(*) > 0 from usuario where username = :login
    boolean existsByUsername(String username);
}
