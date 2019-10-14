import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Operations {

		Frame F;
		Button B;
		TextField T1, T2, T3;
		
		public Operations() {
			
			F=new Frame();
			B=new Button();
			T1=new TextField();
			T2=new TextField();
			T3=new TextField();
			
			F.setLayout(new GridLayout(4,2));
			
			F.add(new Label("First No."));
			F.add(T1);
			F.add(new Label("Second No."));
			F.add(T2);
			F.add(new Label());
			F.add(B);
			F.add(new Label("Result"));
			F.add(T3);
			
			B.addActionListener( new ActionListener() {
				public void actionPerformed(ActionEvent X) {
					
					float No1, No2, Result;
					String sign = B.getLabel();
					
					No1 = Float.parseFloat(T1.getText());
					No2 = Float.parseFloat(T2.getText());
					
					if(sign.contentEquals("Addition")) {
						Result=No1+No2;
						T3.setText(Float.toString(Result));
					}
					
					if(sign.contentEquals("Subtraction")) {
						Result=No1-No2;
						T3.setText(Float.toString(Result));
					}
					
					if(sign.contentEquals("Multiplication")) {
						Result=No1*No2;
						T3.setText(Float.toString(Result));
					}
					
					if(sign.contentEquals("Division")) {
						Result=(float)No1/No2;
						T3.setText(Float.toString(Result));
					}
				}
			});
			
			F.setSize(200,200);
		}
}
