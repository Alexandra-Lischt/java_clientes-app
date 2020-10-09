package io.github.Alexandra.Lischt.model.repository;

import io.github.Alexandra.Lischt.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
