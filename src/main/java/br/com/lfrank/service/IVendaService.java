/**
 * 
 */
package br.com.lfrank.service;

import br.com.lfrank.dao.generic.IGenericDAO;
import br.com.lfrank.domain.Venda;
import br.com.lfrank.exceptions.DAOException;
import br.com.lfrank.exceptions.TipoChaveNaoEncontradaException;


public interface IVendaService extends IGenericDAO<Venda, Long>{

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;

	public Venda consultarComCollection(Long id);

}
