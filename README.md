# O que foi treinado nesse projeto?

O uso da EntityManager, uma interface do JPA responsável pela abstração do mundo relacional para Objetos. Para conseguir uma instância dessa interface, precisamos configurar propriedades no arquivo persistence.xml e obter a instância através da classe Persistence, como pode ser observado na classe TesteCriaTabelas.java:

```{Java}
EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");

EntityManager manager = entityManagerFactory.createEntityManager();

manager.close();
```
