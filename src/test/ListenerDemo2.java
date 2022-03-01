package test;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class ListenerDemo2 {

	public static void main(String[] args) {
		Frame frame=new Frame("’‚¿Ô≤‚ ‘WindowListener");
		frame.setBounds(200,200,500,300);
		
		//
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});;
		frame.setVisible(true);
	}
}
