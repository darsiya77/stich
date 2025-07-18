package JPA.CRUD;

import JPA.entity.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

// EntityManager - недолго живущий объект, посредник для переговоров с БД. Всегда закрывать
// если понадобится вновь - достаем EntityManager из EntityManagerFactory

// когда обращаемся в БД надо вручную открывать и закрыватиь транзакцию

public class Persist_ex {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence
                .createEntityManagerFactory("jpa-course");

        EntityManager entityManager = factory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();

        Student student = null;

        try {
            transaction.begin();
            student = new Student("Андрей", "Троян", 4.8);
            entityManager.persist(student);  // Сохраняет объект в БД
            transaction.commit(); // закрываем транзакцию
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            if (entityManager != null) {
                entityManager.close();
                factory.close(); // закрываем только тогда когда больше не будем обращаться к БД
            }
            System.out.println(student);
        }

    }
}

