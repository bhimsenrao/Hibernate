package criteriatest;

import com.hib.Employees;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class CriteriaTestMain {

    public static void main(String[] args) {
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();
        Criteria criteria = session.createCriteria(Employees.class);
        criteria.add(Restrictions.eq("salary",Double.parseDouble("10000")));
        criteria.setFirstResult(1);
        criteria.setMaxResults(10);
        criteria.addOrder(Order.asc("firstName"));
        java.util.List list = criteria.list();

        for (int i = 0; i < list.size(); i++) {
            Employees emp = (Employees) list.get(i);
            System.out.println(emp.getFirstName() + "   " + emp.getHireDate());
        }
        session.close();
    }
}
