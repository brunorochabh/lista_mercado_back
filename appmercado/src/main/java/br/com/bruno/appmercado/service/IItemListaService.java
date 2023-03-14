package br.com.bruno.appmercado.service;

import br.com.bruno.appmercado.model.ItemLista;

public interface IItemListaService {
	public ItemLista inserirItem(ItemLista novo);

	public ItemLista alterarItem(ItemLista item);

	public void removerItem(Integer numSeq);
}