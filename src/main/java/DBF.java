import java.sql.*;

public class DBF {
	
	public static void main(String[] arg) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection C=DriverManager.getConnection("jdbc:mysql://localhost/nationwide1", "root", "root");
			Statement S=C.createStatement();
			S.executeUpdate("insert into school values(12,'Ben',65)");
			
			ResultSet Records = S.executeQuery("select * from school");
			
			
			if(Records.next()) {
				String RegNo = (Integer.toString(Records.getInt(1)));
				String Name = (Records.getString(2));
				String Marks = (Integer.toString(Records.getInt(3)));
				
				System.out.println(RegNo + Name + Marks);
			}
		}
		
		catch(Exception e){
			System.out.println(e);
		}
	}

}
