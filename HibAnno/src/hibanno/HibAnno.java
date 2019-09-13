package hibanno;

import com.hib.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibAnno {

    public static void main(String[] args) {
          Configuration config= new Configuration();
          config.configure("hibernate.cfg.xml");
          config.addAnnotatedClass(Employee.class);
          SessionFactory factory= config.buildSessionFactory();
          Session session=factory.openSession();
          Employee emp=(Employee) session.get(Employee.class, 101);
          System.out.println(emp.getEname());
    }
    
}
