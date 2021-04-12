# O que foi treinado nesse projeto?

O uso da EntityManager, uma interface do JPA responsável pela abstração do mundo relacional para Objetos. Para conseguir uma instância dessa interface, precisamos configurar propriedades no arquivo persistence.xml e obter a instância através da classe Persistence, como pode ser observado na classe TesteCriaTabelas.java:

~~~Java
EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");

EntityManager manager = entityManagerFactory.createEntityManager();

manager.close();
~~~

## Estado Managed e Detached

Foi tambem visto que algumas contas ficam em um estado "Managed", gerenciadas pelo EntityManager e sincronizadas automaticamente com o banco de dados uma vez que ela tenha sido recuperada. Mas se a instancia do Manager for fechada, a entidade passa para uma categoria de "Detached", onde nao eh mais gerenciada pelo Manager. Ainda eh possivel usar o metodo Merge do EntityManager para sincroniza-la com o banco.

## Relacionamentos do Hibernate

Foi testado casos de relacionamentos cardinais e demonstrado como ManyToMany faz a ferramenta criar uma nova tabela no BD para relacionamento dessas entidades.

Tamb�m pode-se ver a observacao de que o relacionamento OneToOne nao faz por padrao a criacao de uma constraint para unique = true, tendo essa que ser feita atraves da anotacao JoinColumn, como pode ser visto na classe Cliente.

## JPQL

� explorado o funcionamento da abstracao do SQL para linguagem orientada a objetos e como chama-la na classe de TesteJPQL

