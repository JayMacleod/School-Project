import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class NextEventHandler implements ActionListener {
	
	TextField RegNo, Name, Marks;
	ResultSet Records;
	
	public NextEventHandler(TextField A, TextField B, TextField C, ResultSet R) {
		
		RegNo=A;
		Name=B;
		Marks=C;
		Records=R;
	}
	
	public void actionPerformed(ActionEvent X) {
		
		try {
			
			if(Records.next()) {
				
				RegNo.setText(Integer.toString(Records.getInt(1)));
				Name.setText(Records.getString(2));
				Marks.setText(Integer.toString(Records.getInt(3)));
			}
		
		}
		
		catch(Exception x) {
			System.out.println("Exception in NextEH: " + x.toString());
		}

	}

}
