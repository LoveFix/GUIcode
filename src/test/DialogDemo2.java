package test;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
public class DialogDemo2 {

	public static void main(String[] args) {
		Frame frame=new Frame("这里测试Dialog");
		//创建对话框Dialog对象，一个模式的，一个非模式的
		Dialog d1=new Dialog(frame,"模式对话框",true);
		//创建一个垂直的Box容器，把一个文本框和一个按钮添加到Box容器中
		Box vbox=Box.createVerticalBox();
		vbox.add(new TextField(20));
		vbox.add(new Button("确认"));
		
		
		//把Box容器添加到Dialog中
		d1.add(vbox);
		
		
		d1.setBounds(20, 30, 300, 200);

	
		Button b1=new Button("打开模式对话框");
		
		
		b1.addActionListener(new ActionListener() {
		@Override	
			public void actionPerformed(ActionEvent  e) {
			d1.setVisible(true);
		}
		});
		
		frame.add(b1,BorderLayout.NORTH);
				//把按钮添加到frame中
		
	frame.pack();
	frame.setVisible(true);
	}
}
