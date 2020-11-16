package com.generation.largeek.lojaLarGeek.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.generation.largeek.lojaLarGeek.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository <Produto, Long>
{
	public List <Produto> findAllByTituloContainingIgnoreCase(String titulo);
}
