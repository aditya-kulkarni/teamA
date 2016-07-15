package pack1;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class AddMovie extends ActionSupport implements ModelDriven<MovieData>{

	MovieData m=new MovieData();
	Dao d=new Dao();
	
	@Override
	public String execute() throws ClassNotFoundException
	{
		d.addmovie(getModel());
		return "success";
	}
	
	
	
	@Override
	public MovieData getModel() {
		
		return m;
	}

	
	
	
}
