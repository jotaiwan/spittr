package com.spittr.tryout;

import com.spittr.dto.SpitterEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by jotaiwan on 20/06/2017.
 */
public class TryOut {

    public static void main(String[] args) {

        /**
         * Java JDBC connect to PostgreSQL
         * */
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Where is your PostgreSQL JDBC Driver? "
                    + "Include in your library path!");
            e.printStackTrace();
            return;
        }

        System.out.println("PostgreSQL JDBC Driver Registered!");
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/demo", "postgres",
                    "postgres");
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
            return;
        }

        /**
         * Persistance
         * */
        // obtain factory
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo");
        // obtain EntityManager
        EntityManager em = emf.createEntityManager();

        // start transaction
        em.getTransaction().begin();
        SpitterEntity u = new SpitterEntity();
        em.persist(u);
        em.getTransaction().commit();

    }
}
