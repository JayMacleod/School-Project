
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class SchoolProjectDBFDelete implements ActionListener{
		
		TextField NameIn;
		String Name;
		Connection C;
		Statement S;
		
		//overload constructor to be able to pass in and out the text fields
		public SchoolProjectDBFDelete(TextField T1) {
			
			NameIn=T1;
			
			try {
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				C=DriverManager.getConnection("jdbc:mysql://localhost/nationwide1", "root", "root");
				S=C.createStatement();
			}
			
			catch(Exception e){
				System.out.println(e);
			}
		}
		
		public void actionPerformed(ActionEvent AE) {
			
			Name=NameIn.getText();
			
			try {
				
				S.executeUpdate("delete from school where Name = '"+Name+"'");
			}
			
			catch(Exception e){
				System.out.println(e);
			}
		}

}
