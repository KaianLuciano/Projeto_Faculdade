package com.projetofaculdade.lojavirtual.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetofaculdade.lojavirtual.models.ProdutoModel;

public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long>{

}
