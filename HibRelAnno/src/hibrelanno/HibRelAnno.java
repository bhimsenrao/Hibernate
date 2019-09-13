/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibrelanno;

import com.hib.Answers;
import com.hib.Questionbank;
import java.util.HashSet;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Bhimsen
 */
public class HibRelAnno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Configuration config= new Configuration();
          config.addAnnotatedClass(Questionbank.class);
          config.addAnnotatedClass(Answers.class);
        config.configure("hibernate.cfg.xml");
        SessionFactory sf= config.buildSessionFactory();
        Session  session=sf.openSession();
         try{        
        Transaction tx=session.beginTransaction();
        
        Questionbank question= new Questionbank();
        question.setQuestid(1002);
        question.setQuestion("What is an Object");
        
        Answers ans = new Answers();
        ans.setSlno(2);
        ans.setAnswer("Object is an Instance of the class");
        ans.setQuestionbank(question);
        Set<Answers> set= new HashSet<>();
        set.add(ans);
        question.setAnswerses(set);
        session.save(question);
        session.save(ans);
        tx.commit();
        session.close();
 
        System.out.println("Done");
         }
         catch(Exception ex){
             System.out.println(ex);
         }
         }
    
}
