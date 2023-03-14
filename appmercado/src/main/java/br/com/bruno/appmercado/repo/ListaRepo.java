package br.com.bruno.appmercado.repo;

import org.springframework.data.repository.CrudRepository;

import br.com.bruno.appmercado.model.Lista;

public interface ListaRepo extends CrudRepository<Lista, Integer> {

}