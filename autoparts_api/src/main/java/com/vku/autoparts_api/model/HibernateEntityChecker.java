package com.vku.autoparts_api.model;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.metamodel.EntityType;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

import java.util.Set;

@Component
public class HibernateEntityChecker {

    private final EntityManagerFactory entityManagerFactory;

    public HibernateEntityChecker(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }

    @PostConstruct
    public void printEntities() {
        System.out.println("==== Hibernate Entities loaded ====");
        Set<EntityType<?>> entities = entityManagerFactory.getMetamodel().getEntities();
        for (EntityType<?> entity : entities) {
            System.out.println("Entity name: " + entity.getName() + ", Java class: " + entity.getJavaType().getName());
        }
        System.out.println("===================================");
    }
}

