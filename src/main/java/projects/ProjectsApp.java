package projects;

import java.sql.Connection;

import projects.dao.DbConnection;


public class ProjectsApp{
	public static void main (String[] args) {
	
		
		   Connection conn = DbConnection.getConnection();
	        if (conn != null) {
	            System.out.println("Connected to the database.");
	        } else {
	            System.out.println("Failed to connect to the database.");
	        }
	}
}


