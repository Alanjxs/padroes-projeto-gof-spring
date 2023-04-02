package padroes.projeto.spring.gof.service;

import padroes.projeto.spring.gof.model.Cliente;

/*
 * Esta interface é um exemplo do padrão Strategy.
 * Pode-se gerar várias implementações a partir desta interface.
 */

public interface ClienteService {

	Iterable<Cliente> buscarTodos();

	Cliente buscarPorId(Long id);

	void inserir(Cliente cliente);

	void atualizar(Long id, Cliente cliente);

	void deletar(Long id);

}