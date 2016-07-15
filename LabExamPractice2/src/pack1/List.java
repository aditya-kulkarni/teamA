package pack1;

import java.sql.SQLException;
import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

public class List extends ActionSupport{

	MovieData md=new MovieData();
	Dao d=new Dao();
	ArrayList<MovieData> movies=new ArrayList<MovieData>();

	public ArrayList<MovieData> getMovies() {
		return movies;
	}

	public void setMovies(ArrayList<MovieData> movies) {
		this.movies = movies;
	}
	
	public String execute() throws ClassNotFoundException, SQLException
	{
		d.display(getMovies());
		return "success";
	}
}
