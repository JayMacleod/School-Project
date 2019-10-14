
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BackEventHandler implements ActionListener {
	
	TextField RegNo, Name, Marks;
	ResultSet Records;
	
	public BackEventHandler(TextField A, TextField B, TextField C, ResultSet R) {
		
		RegNo=A;
		Name=B;
		Marks=C;
		Records=R;
	}
	
	public void actionPerformed(ActionEvent X) {
		
		try {
		
			if(Records.previous()) {
				RegNo.setText(Integer.toString(Records.getInt(1)));
				Name.setText(Records.getString(2));
				Marks.setText(Integer.toString(Records.getInt(3)));
			}
		
		}
		
		catch(Exception E) {
			System.out.println("Exception in BackEH: " + E.toString());
		}

	}

}