import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MathMain {
	
	public static void main(String[] args) {

		Frame F = new Frame();
		Button B1, B2, B3, B4;
		B1 = new Button("Addition");
		B2 = new Button("Subtraction");
		B3 = new Button("Multiplication");
		B4 = new Button("Division");
		
		F.setLayout(new GridLayout(4,1));
		
		F.add(B1);
		F.add(B2);
		F.add(B3);
		F.add(B4);
		
		final Operations opt = new Operations();

		B1.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent X) {
				opt.F.setTitle("Addition");
				opt.B.setLabel("Addition");
				opt.F.setVisible(true);
			}
		});
		
		B2.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent X) {
				opt.F.setTitle("Subtraction");
				opt.B.setLabel("Subtraction");
				opt.F.setVisible(true);
			}
		});
		
		B3.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent X) {
				opt.F.setTitle("Multiplication");
				opt.B.setLabel("Multiplication");
				opt.F.setVisible(true);
			}
		});
		
		B4.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent X) {
				opt.F.setTitle("Division");
				opt.B.setLabel("Division");
				opt.F.setVisible(true);
			}
		});
		
		F.setSize(200,200);
		F.setVisible(true);
	}

}
