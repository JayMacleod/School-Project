
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SchoolProjectAdd implements ActionListener{
	
	TextField RegEnter, NameEnter, MarksEnter;
	Label L1, L2, L3, L4;
	Button BtnSave;
	
	public SchoolProjectAdd() {
	}
		
	public void actionPerformed(ActionEvent e) {
		//set the frame for the buttons etc to appear in
		Frame F = new Frame ("Table Input");
		
		Panel P1 = new Panel();
		
		GridLayout Gl = new GridLayout(4,2);
		P1.setLayout(Gl);
		
		//creating text field objects
		RegEnter = new TextField(2);
		NameEnter = new TextField(30);
		MarksEnter = new TextField(3);
		
		//creating label objects with headings
		L1 = new Label("RegNo");
		L2 = new Label("Name");
		L3 = new Label("Marks");
		L4 = new Label("");
		
	    //creating the button object with its labels
		BtnSave = new Button("Save");

		//creating the handler object for running the program (add the numbers etc) and passing in the text objects
		//so that the EventHandlerXP object can access what has been typed and put the result to the text object
		SchoolProjectDBFEnter EventEnter = new SchoolProjectDBFEnter(RegEnter, NameEnter, MarksEnter);
		
		//pass the event (clicking the button) into the addActionListener method of the inbuilt ActionListener interface class
		BtnSave.addActionListener(EventEnter);
		
		//add the text boxes and buttons to the frame
		P1.add(L1);
		P1.add(RegEnter);
		P1.add(L2);
		P1.add(NameEnter);
		P1.add(L3);
		P1.add(MarksEnter);
		P1.add(L4);
		P1.add(BtnSave);
		
		F.add(P1, BorderLayout.CENTER);
		
		//set the size of the frame and make it visible
		F.setSize(400,150);
		F.setVisible(true);
	}

}

