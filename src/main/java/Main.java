import entity.Myclasses;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();

            Myclasses senoirProject = new Myclasses();
            senoirProject.setClassName("Senoir Project");
            senoirProject.setClassCode(495);
            senoirProject.setClassSubject("CIT");
            senoirProject.setClassProfessor("Robertson");
            entityManager.persist(senoirProject);

            transaction.commit();
        } finally {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            entityManager.close();
            entityManagerFactory.close();
        }
    }
}
