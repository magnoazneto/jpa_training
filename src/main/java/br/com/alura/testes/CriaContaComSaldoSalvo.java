package br.com.alura.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Conta;

public class CriaContaComSaldoSalvo {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
		EntityManager em = emf.createEntityManager();
		
		Conta conta = new Conta();
		conta.setTitular("Marcia");
		conta.setNumero(12345);
		conta.setAgencia(54321);
		conta.setSaldo(100.00);
		
		em.getTransaction().begin();
		em.persist(conta);
		em.getTransaction().commit();
		em.close();
		
		EntityManager em2 = emf.createEntityManager();
		conta.setSaldo(500.0);
		
		em2.getTransaction().begin();
		em2.merge(conta);
		em2.getTransaction().commit();
	}
}
