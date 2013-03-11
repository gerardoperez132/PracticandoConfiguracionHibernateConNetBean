/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ve.gob.Imple;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import ve.gob.domain.Auditor;
import ve.gob.util.HibernateUtil;


/**
 *
 * @author gerardo
 */
public class Main {

     public static void main(String[] a) throws Exception {
         System.out.println("*****************************************Paso1");
         
         
         try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            System.out.println("*****************************************Paso2");
            Query q = session.createQuery("from Auditor");
            List resultList = q.list();
            for (Object o : resultList) {
            Auditor auditor = (Auditor) o;
            System.out.println("Nombre:"+auditor.getNombre());
            }
            session.getTransaction().commit();
        } catch (HibernateException he) {
            he.printStackTrace();
        }
         System.out.println("*****************************************Paso3");
         

        }


    }

/* 
  List<Actor> actorList = null;
   Query q = session.createQuery("from Auditor");
   audirtorList = (List<Actor>) q.list();
 */