package test;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class DialogDemo1 {

	public static void main(String[] args) {
		Frame frame=new Frame("�������Dialog");
		//�����Ի���Dialog����һ��ģʽ�ģ�һ����ģʽ��
		Dialog d1=new Dialog(frame,"ģʽ�Ի���",true);
		Dialog d2=new Dialog(frame,"��ģʽ�Ի���",false);
		//ͨ��setBounds��������Dialog��λ���Լ���С
		
		
		d1.setBounds(20, 30, 300, 200);
		d2.setBounds(20, 30, 300, 200);
		//����������ť
		Button b1=new Button("��ģʽ�Ի���");
		Button b2=new Button("�򿪷�ģʽ�Ի���");
		//����������ť�ӵ�������Ϊ
		b1.addActionListener(new ActionListener() {
		@Override	
			public void actionPerformed(ActionEvent  e) {
			d1.setVisible(true);
		}
		});
		b2.addActionListener(new ActionListener() {
			@Override	
				public void actionPerformed(ActionEvent  e) {
				d2.setVisible(true);
			}
			});
		frame.add(b1,BorderLayout.NORTH);
		frame.add(b2);
;		//�Ѱ�ť��ӵ�frame��
		
	frame.pack();
	frame.setVisible(true);
	}
}
