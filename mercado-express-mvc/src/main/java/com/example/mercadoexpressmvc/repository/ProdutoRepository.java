package com.example.mercadoexpressmvc.repository;

import com.example.mercadoexpressmvc.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
