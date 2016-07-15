package pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Dao {

	public void addmovie(MovieData m) throws ClassNotFoundException
	{
		Connection con=null;
		PreparedStatement ps=null;
		
		Class.forName("oracle.jdbc.OracleDriver");
		
		try {
			con=DriverManager.getConnection("jdbc:oracle:thin:@10.212.0.224:1521:xe","DAC16_160240320005","160240320005");
			System.out.println(con.toString());
			String sql="insert into movies values(?,?,?,?,?)";
			ps=con.prepareStatement(sql);
			System.out.println("In Dao"+m.getDirectorname());
			ps.setInt(1,m.getMovieid());
			ps.setString(2,m.getMoviename());
			ps.setString(3,m.getDirectorname());
			ps.setDate(4,m.getReleasedate());
			ps.setString(5,m.getDiskFormat());
			ps.executeUpdate();
			
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		finally{
			if(con != null)
			{
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
		public void delete(int movieid) throws ClassNotFoundException
		{
			Connection con=null;
			PreparedStatement ps=null;
			
			Class.forName("oracle.jdbc.OracleDriver");
			
			try {
				con=DriverManager.getConnection("jdbc:oracle:thin:@10.212.0.224:1521:xe","DAC16_160240320005","160240320005");
				System.out.println(con.toString());
				String sql="delete from movies where movieid=?";
				ps=con.prepareStatement(sql);
				
				ps.setInt(1,movieid);
				
				ps.executeUpdate();
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			finally{
				if(con != null)
				{
					try {
						con.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
		
		}
			
		}
		public void display(ArrayList<MovieData>movies) throws ClassNotFoundException, SQLException
		{
			Connection con=null;
			PreparedStatement ps=null;
			
			Class.forName("oracle.jdbc.OracleDriver");
			
			con=DriverManager.getConnection("jdbc:oracle:thin:@10.212.0.224:1521:xe","DAC16_160240320005","160240320005");
			System.out.println(con.toString());
			String sql="select * from movies";
			ps=con.prepareStatement(sql);
			
			ResultSet res=ps.executeQuery(sql);
			
			while(res.next())
			{
				MovieData md=new MovieData();
				md.setMovieid(res.getInt("MOVIEID"));
				md.setMoviename(res.getString("MOVIENAME"));
				md.setDirectorname(res.getString("DIRECTOR_NAME"));
				md.setReleasedate(res.getDate("RELEASE_DATE"));
				md.setDiskFormat(res.getString("DISK_TYPE"));
				movies.add(md);
				
			}
		}
}

