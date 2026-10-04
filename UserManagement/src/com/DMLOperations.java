package com;

import java.sql.SQLException;
import java.sql.Statement;
import com.constants.DbConstants;
import com.util.DBConnection;





public class DMLOperations {
	
	public static void main(String[] args) {
		
		Statement statement = DBConnection.getStatement();
		
		try {
		statement.executeUpdate(DbConstants.INSERT_QUERY);
		
	}catch(SQLException ex) {
		ex.printStackTrace();
	}

}
}