package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root")) {
			Statement st = conn.createStatement();
			PreparedStatement ps = conn.prepareStatement("select * from animal;");
		
			
		
//			st.executeUpdate("UPDATE animal SET name='newName' where id=1;");
//			System.out.println(res);
//			ResultSet set = st.executeQuery("Select * from animal;");
//			st.addBatch("insert into animal(name,description) values ('name1','desc1');");
//			st.addBatch("insert into animal(name,description) values ('name2','desc2');");
//			st.addBatch("insert into animal(name,description) values ('name3','desc3');");
//			
//			st.executeBatch();
		st.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
