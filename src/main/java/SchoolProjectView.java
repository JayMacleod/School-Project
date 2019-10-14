import java.awt.*;
import java.sql.ResultSet;
@SuppressWarnings("serial")

public class SchoolProjectView extends Frame{
	
	TextField RegNo, Name, Marks;
	Label L1, L2, L3;
	Button Back, Next;
	ResultSet Records;
	
	public SchoolProjectView() {
		
		RegNo = new TextField();
		Name = new TextField();
		Marks = new TextField();
		L1 = new Label ("Reg Number");
		L2 = new Label ("Name");
		L3 = new Label ("Mark");
		Back = new Button("Back");
		Next = new Button("Next");
		
		GridLayout Grid = new GridLayout(4,4);
		setLayout(Grid);
		
		add(new Label());
		add(L1);
		add(RegNo);
		add(new Label());
		add(new Label());
		add(L2);
		add(Name);
		add(new Label());
		add(new Label());
		add(L3);
		add(Marks);
		add(new Label());
		add(Back);
		add(new Label());
		add(new Label());
		add(Next);
		
		try {
			
			Records = DbConnection.S.executeQuery("select * from school");
			
			NextEventHandler NEvent = new NextEventHandler(RegNo, Name, Marks, Records);
			BackEventHandler BEvent = new BackEventHandler(RegNo, Name, Marks, Records);
		
			Next.addActionListener(NEvent);
			Back.addActionListener(BEvent);
			
			showRecord();
		
			setSize(350,200);
			setVisible(true);
		}
		
		catch(Exception E){
			System.out.println("exception in SPView: " + E.toString());
		}
	}
	
	public void showRecord() {
		
		try {
			
			if(Records.next()) {
				RegNo.setText(Integer.toString(Records.getInt(1)));
				Name.setText(Records.getString(2));
				Marks.setText(Integer.toString(Records.getInt(3)));
			}
		}
		
		catch(Exception x) {
			System.out.println("exception in SPView/showRecord: " + x.toString());
		}
	}

}
