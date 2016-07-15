package pack1;

import java.sql.Date;

public class MovieData {

	private int movieid;
	private String moviename;
	private String directorname;
	private Date releasedate;
	private String DiskFormat;
	
	
	public int getMovieid() {
		return movieid;
	}
	public void setMovieid(int movieid) {
		this.movieid = movieid;
	}
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	public String getDirectorname() {
		return directorname;
	}
	public void setDirectorname(String directorname) {
		this.directorname = directorname;
	}
	public Date getReleasedate() {
		return releasedate;
	}
	public void setReleasedate(Date releasedate) {
		this.releasedate = releasedate;
	}
	public String getDiskFormat() {
		return DiskFormat;
	}
	public void setDiskFormat(String diskFormat) {
		DiskFormat = diskFormat;
	}
	
	
	
}
