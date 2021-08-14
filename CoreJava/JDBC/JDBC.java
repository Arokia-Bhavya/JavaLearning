package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {

	public static void main(String[] args) {
		new JDBC().testConnection();

	}

	private void testConnection() {
		Connection connection=null;
		Statement statement;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_app","root","password");
			statement=connection.createStatement();
			statement.execute("insert into employee_info values(11,'ravi')");
			
			ResultSet rs=statement.executeQuery("select * from employee_info");
			while(rs.next())
			{
				System.out.println("Employee Id"+rs.getInt(1));
				System.out.println("Employee Name"+rs.getString(2));
				
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally
		{
			if(connection!=null)
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}

}
