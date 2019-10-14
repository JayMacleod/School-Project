import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SchoolProjectRemove implements ActionListener{
	
	TextField NameEnter;
	Label L1;
	Button BtnSave;
	
	public SchoolProjectRemove() {
	}
		
	public void actionPerformed(ActionEvent e) {
		//set the frame for the buttons etc to appear in
		Frame F = new Frame ("Table Input");
		
		Panel P1 = new Panel();
		
		GridLayout Gl = new GridLayout(2,2);
		P1.setLayout(Gl);
		
		//creating text field objects
		NameEnter = new TextField(30);
		
		//creating label objects with headings
		L1 = new Label("Name to delete");
		
	    //creating the button object with its labels
		BtnSave = new Button("Save");

		//creating the handler object for running the program (add the numbers etc) and passing in the text objects
		//so that the EventHandlerXP object can access what has been typed and put the result to the text object
		SchoolProjectDBFDelete EventDelete = new SchoolProjectDBFDelete(NameEnter);
		
		//pass the event (clicking the button) into the addActionListener method of the inbuilt ActionListener interface class
		BtnSave.addActionListener(EventDelete);
		
		//add the text boxes and buttons to the frame
		P1.add(L1);
		P1.add(NameEnter);
		P1.add(BtnSave);
		
		F.add(P1, BorderLayout.CENTER);
		
		//set the size of the frame and make it visible
		F.setSize(200,150);
		F.setVisible(true);
	}

}


