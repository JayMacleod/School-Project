import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowExample{
	
	private float No1, No2;
	private float endResult;
	
	private TextField First = new TextField();
	private TextField Second = new TextField();
	private TextField Result = new TextField();
	
	public static void main (String[] arg) {
		
		WindowExample example = new WindowExample();
		example.run();
	}
	
	public void run() {

		Frame F = new Frame();
		
		Button B1 = new Button("+");
		Button B2 = new Button("-");
		Button B3 = new Button("x");
		Button B4 = new Button("/");
		
		F.setLayout(new GridLayout(3,4));
			
		F.add(new Label("First No"));
		F.add(First);
		F.add(new Label("First No"));
		F.add(Second);
		F.add(B1);
		F.add(B2);
		F.add(B3);
		F.add(B4);
		F.add(new Label());
		F.add(new Label());
		F.add(new Label("First No"));
		F.add(Result);
		
		B1.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent X) {
						
						No1 = Float.parseFloat(First.getText());
						No2 = Float.parseFloat(Second.getText());
						endResult = No1 + No2;
						
						Result.setText(Float.toString(endResult));
					}
				}
		);
		
		B2.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent X) {
						No1 = Float.parseFloat(First.getText());
						No2 = Float.parseFloat(Second.getText());
						endResult = No1 - No2;
						Result.setText(Float.toString(endResult));
					}
				}
		);
		
		B3.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent X) {
						No1 = Float.parseFloat(First.getText());
						No2 = Float.parseFloat(Second.getText());
						endResult = No1 * No2;
						Result.setText(Float.toString(endResult));
					}
				}
		);
		
		B4.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent X) {
						No1 = Float.parseFloat(First.getText());
						No2 = Float.parseFloat(Second.getText());
						endResult = (float) No1 / No2;
						Result.setText(Float.toString(endResult));
					}
				}
		);
		
		F.setSize(200,200);
		F.setVisible(true);	
	}
}
