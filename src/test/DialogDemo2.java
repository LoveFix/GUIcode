package test;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
public class DialogDemo2 {

	public static void main(String[] args) {
		Frame frame=new Frame("�������Dialog");
		//�����Ի���Dialog����һ��ģʽ�ģ�һ����ģʽ��
		Dialog d1=new Dialog(frame,"ģʽ�Ի���",true);
		//����һ����ֱ��Box��������һ���ı����һ����ť��ӵ�Box������
		Box vbox=Box.createVerticalBox();
		vbox.add(new TextField(20));
		vbox.add(new Button("ȷ��"));
		
		
		//��Box������ӵ�Dialog��
		d1.add(vbox);
		
		
		d1.setBounds(20, 30, 300, 200);

	
		Button b1=new Button("��ģʽ�Ի���");
		
		
		b1.addActionListener(new ActionListener() {
		@Override	
			public void actionPerformed(ActionEvent  e) {
			d1.setVisible(true);
		}
		});
		
		frame.add(b1,BorderLayout.NORTH);
				//�Ѱ�ť��ӵ�frame��
		
	frame.pack();
	frame.setVisible(true);
	}
}
