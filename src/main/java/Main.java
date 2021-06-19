import entity.Myclasses;

import javax.persistence.*;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();

            Query countOfClasses = entityManager.createNativeQuery("SELECT count(*) AS Amount_of_CIT_classes " +
                    "FROM myclasses " +
                    "WHERE classCode <> 'CIT'");
            System.out.println("I have "+countOfClasses.getSingleResult()+" CIT classes.");

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
