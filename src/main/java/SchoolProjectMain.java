import java.awt.*;
import java.awt.event.ActionListener;
@SuppressWarnings("serial")

public class SchoolProjectMain extends Frame{
		
	Button View, Add, Remove, Amend, Quit;
		
	public SchoolProjectMain() {
		
		View = new Button("View the records");
		Add = new Button("Add a record");
		Remove = new Button("Remove a record");
		Amend = new Button("Amend a record");
		Quit = new Button("QUIT");
			
		GridLayout Grid = new GridLayout(5,1);
		setLayout(Grid);
			
		add(View);
		add(Add);
		add(Remove);
		add(Amend);
		add(Quit);
		
		try {
			
			SchoolProjectView ViewRecords = new SchoolProjectView();
			SchoolProjectAdd AddRecords = new SchoolProjectAdd();
			SchoolProjectRemove RemoveRecords = new SchoolProjectRemove();
//			SchoolProjectAmend AmendRecords = new SchoolProjectAmend();
		
			View.addActionListener(ViewRecords);
			Add.addActionListener(AddRecords);
			Remove.addActionListener(RemoveRecords);
		
			setSize(400,400);
			setVisible(true);
		}
		
		catch(Exception E){
			System.out.println(E.toString());
		}
	}
}
