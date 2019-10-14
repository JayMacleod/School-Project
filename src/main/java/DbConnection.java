import java.sql.*;

public class DbConnection {
	
	static Connection C;
	static Statement S;
	
	static {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			C=DriverManager.getConnection("jdbc:mysql://localhost/nationwide1", "root", "root");
			S=C.createStatement();
		}
		
		catch(Exception E) {
			
			System.out.println("Exception in DbConnection: " + E.toString());
		}
	}

}
