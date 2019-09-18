package com.revature;

import java.sql.Connection;
import java.sql.SQLException;
import org.apache.log4j.Logger;

import com.revature.util.ConnectionDB;


public class App {
	private static Logger log = Logger.getRootLogger();
	
	public static void main(String[] args) {
		
		try {
			Connection c = ConnectionDB.getConnection();
			String driver = c.getMetaData().getDriverName();
			System.out.println(driver);
			log.info("succesful");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
}
