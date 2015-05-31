package Application;
import java.util.List;

import dao.UsersDAO;
import object.Users;

public class researClass {
	UsersDAO userdao = new UsersDAO();
	Users user;
	public List findHome(String home){
		List list = userdao.findByNativeplace(home);
		return list;
	}
	public List findUniversity(List l,String uni){
		List list = null;
		for(int i = 0;i<l.size();i++)
		{
			user = (Users)l.get(i);
			if(user.getUniversity().equals(uni))
				list.add(l.get(i));
		}
		return list;
	}
	public List findMajor(List l,String major){
		List list = null;
		for(int i = 0;i<l.size();i++)
		{
			user = (Users)l.get(i);
			if(user.getMajor().equals(major))
				list.add(l.get(i));
		}
		return list;
	}
	public List findSex(List l,String sex){
		List list = null;
		for(int i = 0;i<l.size();i++)
		{
			user = (Users)l.get(i);
			if(user.getSex().equals(sex))
				list.add(l.get(i));
		}
		return list;
	}
	public Users show(List l){
		Users u = (Users)l.get(0);
		return u;
	}
}
