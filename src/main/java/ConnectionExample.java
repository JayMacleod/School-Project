import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionExample {

	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection C=DriverManager.getConnection("jdbc:mysql://localhost/nationwide1", "root", "root");
			Statement S=C.createStatement();
			
			ResultSet RS = S.executeQuery("select * from school");
			
			while (RS.next()) {
				System.out.println("RegNo: " + RS.getInt(1));
				System.out.println("Name: " + RS.getString(2));
				System.out.println("Mark: " + RS.getInt(3));
				System.out.println("mm");
			}
		}
		
		catch (Exception E) {
			System.out.println(E.toString());
		}

	}

}
