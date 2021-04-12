package br.com.alura.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Cliente;
import br.com.alura.jpa.modelo.Conta;

public class TestaRelacionamentoClienteConta {
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.setId(1L);
		
		Cliente cliente = new Cliente();
		cliente.setNome("Maria");
		cliente.setEndereco("Rua do ouvidor, 80");
		cliente.setProfissao("Professor");
		cliente.setConta(conta);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
		EntityManager em = emf.createEntityManager();
		
		// Sabemos que isso pode ser facilmente feito com uma anotacao, mas como
		// esse projeto tem fins de recuperação de aprendizado, vai ficar aqui a 
		// sintaxe mais verbosa mesmo :)
		em.getTransaction().begin();
		em.persist(cliente);
		em.getTransaction().commit();
		
		
	}

}
