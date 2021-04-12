# O que foi treinado nesse projeto?

O uso da EntityManager, uma interface do JPA respons�vel pela abstra��o do mundo relacional para Objetos. Para conseguir uma inst�ncia dessa interface, precisamos configurar propriedades no arquivo persistence.xml e obter a inst�ncia atrav�s da classe Persistence, como pode ser observado na classe TesteCriaTabelas.java:

```Java
EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");

EntityManager manager = entityManagerFactory.createEntityManager();

manager.close();
```

## Estado Managed e Detached

Foi tamb�m visto que algumas contas ficam em um estado "Managed", gerenciadas pelo EntityManager e sincronizadas automaticamente com o banco de dados uma vez que ela tenha sido recuperada. Mas se a inst�ncia do Manager for fechada, a entidade passa para uma categoria de "Detached", onde n�o � mais gerenciada pelo Manager. Ainda � poss�vel usar o m�todo Merge do EntityManager para sincroniz�-la com o banco.