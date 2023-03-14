package br.com.bruno.appmercado.repo;

import org.springframework.data.repository.CrudRepository;

import br.com.bruno.appmercado.model.ItemLista;

public interface ItemListaRepo extends CrudRepository<ItemLista, Integer> {

}