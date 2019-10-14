import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class SchoolProjectDBF implements ActionListener{
		
		TextField RegIn, NameIn, MarksIn;
		String Reg, Marks, Name;
		Connection C;
		Statement S;
		
		//overload constructor to be able to pass in and out the text fields
		public SchoolProjectDBF(TextField T1, TextField T2, TextField T3) {
			
			RegIn=T1;
			NameIn=T2;
			MarksIn=T3;
			
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
			
			Reg=RegIn.getText();
			Name=NameIn.getText();
			Marks=MarksIn.getText();
			
			try {
				
				S.executeUpdate("insert into school values("+Reg+",'"+Name+"',"+Marks+")");
			}
			
			catch(Exception e){
				System.out.println(e);
			}
		}

}
