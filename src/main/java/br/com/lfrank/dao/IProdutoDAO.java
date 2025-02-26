/**
 * 
 */
package br.com.lfrank.dao;

import java.util.List;

import br.com.lfrank.dao.generic.IGenericDAO;
import br.com.lfrank.domain.Produto;


public interface IProdutoDAO extends IGenericDAO<Produto, String>{

	List<Produto> filtrarProdutos(String query);

}
