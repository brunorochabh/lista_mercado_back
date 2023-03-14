package br.com.bruno.appmercado.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.bruno.appmercado.model.Produto;

public interface ProdutoRepo extends CrudRepository<Produto, Integer> {
	public List<Produto> findAllByNomeContaining(String palavraChave);
}