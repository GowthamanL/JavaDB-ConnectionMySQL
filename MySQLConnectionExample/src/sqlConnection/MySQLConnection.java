package sqlConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection=DriverManager.getConnection("jdbc:mysql://root@localhost/login_details");

		Statement statement=connection.createStatement();

		ResultSet result=statement.executeQuery("SELECT * FROM credentials");

		while(result.next())
		{
			System.out.println("Id : "+result.getInt(1));
			System.out.println("UserName : "+result.getString(2));
			System.out.println("Pasword : "+result.getString(3));
		}


	}
}
