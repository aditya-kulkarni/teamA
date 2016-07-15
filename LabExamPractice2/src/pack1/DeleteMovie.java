package pack1;

import com.opensymphony.xwork2.ActionSupport;

public class DeleteMovie extends ActionSupport {

	private int movieid;

	public int getMovieid() {
		return movieid;
	}

	public void setMovieid(int movieid) {
		this.movieid = movieid;
	}
	
	Dao d=new Dao();
	
	@Override
	public String execute() throws ClassNotFoundException
	{
		d.delete(movieid);
		return "success";
	}
	
	
}
