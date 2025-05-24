package com.exemplo.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

        Produto produto = new Produto("Teclado Mecânico", 299.90, 10);

        em.getTransaction().begin();
        em.persist(produto);
        em.getTransaction().commit();

        Produto encontrado = em.find(Produto.class, produto.getId());
        System.out.println("Produto encontrado: " + encontrado);

        em.close();
        emf.close();
    }
}
