import java.awt.*;

public class SchoolProject {
	
	public static void main(String[] arg) {
		
		//set the frame for the calc to appear in
		Frame F = new Frame ("Table Input");
		
		Panel P1 = new Panel();
		
		GridLayout Gl = new GridLayout(4,4);
		P1.setLayout(Gl);
		
		TextField RegEnter, NameEnter, MarksEnter, NameToDelete;
		Label L1, L2, L3, L4;
		Label L5, L6, L7, L8, L9, L10;
		Button BtnSave;
		Button BtnDelete;
		
		//creating text field objects
		RegEnter = new TextField(2);
		NameEnter = new TextField(30);
		MarksEnter = new TextField(3);
		
		NameToDelete = new TextField(30);
		
		//creating label objects with headings
		L1 = new Label("RegNo");
		L2 = new Label("Name");
		L3 = new Label("Marks");
		L4 = new Label("");
		
		L5 = new Label("Name to Delete");
		L6 = new Label("");
		L7 = new Label("");
		L8 = new Label("");
		L9 = new Label("");
		L10 = new Label("");
		
	    //creating the button object with its labels
		BtnSave = new Button("Save");
		BtnDelete = new Button("Delete");

		//creating the handler object for running the program (add the numbers etc) and passing in the text objects
		//so that the EventHandlerXP object can access what has been typed and put the result to the text object
		SchoolProjectDBFEnter EventEnter = new SchoolProjectDBFEnter(RegEnter, NameEnter, MarksEnter);
		SchoolProjectDBFDelete EventDelete = new SchoolProjectDBFDelete(NameToDelete);
		
		//pass the event (clicking the button) into the addActionListener method of the inbuilt ActionListener interface class
		BtnSave.addActionListener(EventEnter);
		BtnDelete.addActionListener(EventDelete);
		
		//add the text boxes and buttons to the frame
		P1.add(L1);
		P1.add(RegEnter);
		P1.add(L5);
		P1.add(NameToDelete);
		P1.add(L2);
		P1.add(NameEnter);
		P1.add(L6);
		P1.add(BtnDelete);
		P1.add(L3);
		P1.add(MarksEnter);
		P1.add(L7);
		P1.add(L8);
		P1.add(L4);
		P1.add(BtnSave);
		P1.add(L9);
		P1.add(L10);
		
		F.add(P1, BorderLayout.CENTER);
		
		//set the size of the frame and make it visible
		F.setSize(400,150);
		F.setVisible(true);
	}

}
