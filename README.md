# O que foi treinado nesse projeto?

O uso da EntityManager, uma interface do JPA respons�vel pela abstra��o do mundo relacional para Objetos. Para conseguir uma inst�ncia dessa interface, precisamos configurar propriedades no arquivo persistence.xml e obter a inst�ncia atrav�s da classe Persistence, como pode ser observado na classe TesteCriaTabelas.java:

```{Java}
EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");

EntityManager manager = entityManagerFactory.createEntityManager();

manager.close();
```
