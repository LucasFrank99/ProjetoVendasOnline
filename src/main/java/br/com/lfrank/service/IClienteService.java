/**
 * 
 */
package br.com.lfrank.service;

import java.util.List;

import br.com.lfrank.domain.Cliente;
import br.com.lfrank.exceptions.DAOException;
import br.com.lfrank.services.generic.IGenericService;


public interface IClienteService extends IGenericService<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf) throws DAOException;

	List<Cliente> filtrarClientes(String query);

}
