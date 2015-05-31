package Application;

import java.util.Date;

import dao.UsersDAO;
import javax.persistence.Entity;
import object.Users;
import hiberanate.HibernateSessionFactory;

import javax.transaction.Transaction;

import org.hibernate.Session;

@Entity
public class registerClass {
	public void addToDB(String name,String id,Date birth,String sex,String university,String major,String home,String qq){
		Session session;
		UsersDAO userdao = new UsersDAO();
		Users user = new Users();
		session = HibernateSessionFactory.getSession();
		org.hibernate.Transaction tx = session.beginTransaction();
		user.setName(name);
		user.setId(id);
		user.setBirthday(birth);
		user.setSex(sex);
		user.setUniversity(university);
		user.setMajor(major);
		user.setNativeplace(home);
		user.setQq(qq);
		session.merge((Object)user);
		tx.commit();
		session.close();
	}
}
