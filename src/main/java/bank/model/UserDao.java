package bank.model;

import bank.utils.AccountTransaction;
import bank.utils.Auth;
import bank.utils.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDao {
  @Autowired private SessionFactory sessionFactory;

  public List<User> getUsers() {
    Session session = sessionFactory.openSession();
    Query query = session.createQuery("from User");
    List<User> list = query.list();
    System.out.println(list);
    session.close();
    return list;
  }

  public int saveUser(User user) {
    try {
      Session session = sessionFactory.openSession();
      session.save(user);
      session.close();
      return 1;
    } catch (Exception e) {
      return 0;
    }
  }

  public List<User> findUser(Auth auth) {
    Session session = sessionFactory.openSession();
    String hql = "FROM User u WHERE u.email=:email and u.password=:password";
    Query query = session.createQuery(hql);
    query.setParameter("email", auth.getEmail());
    query.setParameter("password", auth.getPassword());
    List<User> list = query.list();
    System.out.println(list);
    return list;
  }

  public int makeTransaction(AccountTransaction transaction) {
    Session session = sessionFactory.openSession();
    Transaction tx = session.beginTransaction();

    String hql = "FROM User u where u.email = :email and u.password=:password";
    Query query = session.createQuery(hql);
    query.setParameter("email", transaction.getEmail());
    query.setParameter("password", transaction.getPassword());
    List<User> list = query.list();
    if (list.size() == 1) {
      User u = list.get(0);
      switch (transaction.getType()) {
        case "credit":
          u.setAccount_balance((long) (u.getAccount_balance() - transaction.getAmount()));
          break;
        case "debit":
          u.setAccount_balance((long) (u.getAccount_balance() + transaction.getAmount()));
          break;
      }

      System.out.println(u);
      session.update(u);
      tx.commit();
      session.close();
      return 1;
    }
    return 0;
  }
}
