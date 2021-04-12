# O que foi treinado nesse projeto?

O uso da EntityManager, uma interface do JPA responsável pela abstração do mundo relacional para Objetos. Para conseguir uma instância dessa interface, precisamos configurar propriedades no arquivo persistence.xml e obter a instância através da classe Persistence, como pode ser observado na classe TesteCriaTabelas.java:

~~~Java
EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");

EntityManager manager = entityManagerFactory.createEntityManager();

manager.close();
~~~

## Estado Managed e Detached

Foi também visto que algumas contas ficam em um estado "Managed", gerenciadas pelo EntityManager e sincronizadas automaticamente com o banco de dados uma vez que ela tenha sido recuperada. Mas se a instancia do Manager for fechada, a entidade passa para uma categoria de "Detached", onde nao eh mais gerenciada pelo Manager. Ainda eh possivel usar o metodo Merge do EntityManager para sincroniza-la com o banco.

