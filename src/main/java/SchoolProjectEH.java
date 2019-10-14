
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class SchoolProjectEH implements ActionListener{
	
	//set the main variables so they can be used in the other methods
	TextField TX1, TX2, TX3;
	String word;
	String returnWord;
	
	//overload constructor to be able to pass in and out the text fields
	public SchoolProjectEH(TextField T1, TextField T2, TextField T3) {
		
		//set the local variables to the main variables - otherwise they won't be able to be used in the other methods
		TX1=T1;
		TX2=T2;
		TX3=T3;
	}
	
	//Passing in the reference variable for the ActionEvent object
	public void actionPerformed(ActionEvent AE) {
		
		//set the local variables
		int RegInt = 0, MarksInt = 0;
		String NameStr = "";
	
		//use try to catch any exceptions raised
		try {

			//parse the text coming in
			RegInt = Integer.parseInt(TX1.getText());
			MarksInt = Integer.parseInt(TX3.getText());
			NameStr = TX2.getText();
			
			System.out.println(RegInt + " " + NameStr + " " + MarksInt);
		
			SchoolProjectDBF Ref= new SchoolProjectDBF();
			Ref.EnterDetails(RegInt, NameStr, MarksInt);
			
			//if statements to decide where the value placements are
//			if (IntIn>=0 & IntIn<=9999) {
				
//					DigitsToWord2 Ref = new DigitsToWord2();
//					returnWord=Ref.Convert(IntIn);
					
//					TX2.setText(returnWord);
//			}
			
//			else {
//				TX2.setForeground(Color.red);
//				TX2.setText("Number between 0 and 9999 please");
//			}
			
		}
		
		catch (NumberFormatException X) {
			TX2.setForeground(Color.red);
			TX2.setText("Digits only please");
		}
}
}
