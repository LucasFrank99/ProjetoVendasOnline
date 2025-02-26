/**
 * 
 */
package br.com.lfrank.dao;

import java.util.List;

import br.com.lfrank.dao.generic.IGenericDAO;
import br.com.lfrank.domain.Cliente;


public interface IClienteDAO extends IGenericDAO<Cliente, Long>{

	List<Cliente> filtrarClientes(String query);

}
