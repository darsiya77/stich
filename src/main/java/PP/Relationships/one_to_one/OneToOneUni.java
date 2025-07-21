package PP.Relationships.one_to_one;

import PP.Relationships.one_to_one.entity.Passport;
import PP.Relationships.one_to_one.entity.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class OneToOneUni {
    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence
                .createEntityManagerFactory("jpa-course");

        EntityManager entityManager = factory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();


        try {
            transaction.begin();

            Student student1 = new Student("Sasha", "Whyte", 9.1);
            Passport passport1 = new Passport("sashs.whyte@gmail.com", 174
                    , "blue");
            entityManager.persist(passport1);
            entityManager.persist(student1);

            transaction.commit(); // закрываем транзакцию
        }
        catch (Exception e) {

            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();

        } finally {

            if (entityManager != null) {
                entityManager.close();
                factory.close(); // закрываем только тогда когда больше не будем обращаться к БД
            }
        }

    }
}
