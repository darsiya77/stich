package PP.JPA.CRUD;

//https://youtu.be/-qP1bLKwpw0?si=A9m9BhxF6soEWAFn

import PP.JPA.entity.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

// EntityManager - недолго живущий объект, посредник для переговоров с БД. Всегда закрывать
// если понадобится вновь - достаем EntityManager из EntityManagerFactory

// когда обращаемся в БД надо вручную открывать и закрыватиь транзакцию

public class Find_ex {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence
                .createEntityManagerFactory("jpa-course");

        EntityManager entityManager = factory.createEntityManager();

        Student student = null;

        try {
            student = entityManager.find(Student.class, (long) 3);
        }
        catch (Exception e) {
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

