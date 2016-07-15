package pack1;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class Login extends ActionSupport implements SessionAware{

	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String execute()
	{
		if(username.equals("Admin") && password.equals("Pass"))
		{
			session.put("username","Adi");
			addActionMessage("Login Successfully");
			return "success";
		}
		else 
			return "input";
	}
	
	private SessionMap<String,Object>session;
	
	@Override
	public void setSession(Map<String, Object> arg0) {
		session = (SessionMap)arg0;
		
	}
	
}
