package pl.sdacademy;

import javax.persistence.EntityManager;

/**
 * @author mszyrner
 */
public class Main {
  private static EntityManager em = HibernateUtil.getSessionFactory().createEntityManager();
  public static void main(String[] args) {


    HibernateUtil.shutdown();
  }
}