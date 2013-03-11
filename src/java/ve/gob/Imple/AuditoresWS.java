/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ve.gob.Imple;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import ve.gob.domain.Auditor;
import ve.gob.util.HibernateUtil;

/**
 *
 * @author gerardo
 */
@WebService(serviceName = "AuditoresWS")
public class AuditoresWS {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "infoAuditor")
    public List<Auditor> infoAuditor(@WebParam(name = "cedula") String cedula) {
        ArrayList<Auditor> arrayList = new ArrayList<Auditor>();
        Auditor auditor = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            System.out.println("*****************************************Paso1");
            Query q = session.createQuery("from Auditor");
            List resultList = q.list();
            for (Object o : resultList) {
            Auditor auditores = (Auditor) o;
            if( auditores.getCedula().equals(cedula)){
            System.out.println("*****************************************Paso2");
                    auditor = new Auditor(auditores.getId(), 
                            auditores.getApellido(), 
                            auditores.getCedula(),
                            auditores.getCelular(),
                            auditores.getComentario(),
                            auditores.getCorreo(),
                            auditores.getLogin(), 
                            auditores.getNombre(), 
                            auditores.getTelefono());
            System.out.println("*****************************************Paso3");
                }
            }
            System.out.println("***"+auditor);
            arrayList.add(auditor);
            session.getTransaction().commit();
        } catch (HibernateException he) {
            he.printStackTrace();
        }

        return arrayList;
    }
}
