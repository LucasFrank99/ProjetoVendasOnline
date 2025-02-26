/**
 * 
 */
package br.com.lfrank.service;

import java.util.List;

import br.com.lfrank.domain.Produto;
import br.com.lfrank.services.generic.IGenericService;


public interface IProdutoService extends IGenericService<Produto, String> {

	List<Produto> filtrarProdutos(String query);

}
