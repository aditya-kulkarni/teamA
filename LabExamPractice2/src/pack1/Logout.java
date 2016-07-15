package pack1;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class Logout extends ActionSupport implements SessionAware{

	
	
	SessionMap<String,Object>session;
	
	@Override
	public void setSession(Map<String, Object> arg0) {
		
		session = (SessionMap)arg0;
	}

	public String execute()
	{
		session.invalidate();
		addActionMessage("Logout Successfully");
		System.out.println("In logout Dao");
		return "success";
	}
	
}
