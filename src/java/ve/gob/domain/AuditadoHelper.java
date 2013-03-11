/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ve.gob.domain;

import ve.gob.util.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author gerardo
 */
public class AuditadoHelper {
    
Session session = null;

 public AuditadoHelper() {
  this.session = HibernateUtil.getSessionFactory().getCurrentSession();
 }

}