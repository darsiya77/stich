package JPA.CRUD;

import JPA.entity.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

// EntityManager - ������� ������� ������, ��������� ��� ����������� � ��. ������ ���������
// ���� ����������� ����� - ������� EntityManager �� EntityManagerFactory

// ����� ���������� � �� ���� ������� ��������� � ���������� ����������

public class Persist_ex {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence
                .createEntityManagerFactory("jpa-course");

        EntityManager entityManager = factory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();

        Student student = null;

        try {
            transaction.begin();
            student = new Student("������", "�����", 4.8);
            entityManager.persist(student);  // ��������� ������ � ��
            transaction.commit(); // ��������� ����������
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            if (entityManager != null) {
                entityManager.close();
                factory.close(); // ��������� ������ ����� ����� ������ �� ����� ���������� � ��
            }
            System.out.println(student);
        }

    }
}

