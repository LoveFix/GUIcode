package test;
import java.awt.*;

import javax.swing.BoxLayout;
public class BoxLayoutDemo {
public static void main(String[] args) {
	Frame frame=new Frame("�������BoxLayout");
	
	//����frame����������һ��BoxLayout���󣬲��Ҹö��������ʱ��ֱ���
	BoxLayout boxLayout=new BoxLayout(frame,BoxLayout.X_AXIS);
	
   //��BoxLayout�������ø�Frame
	frame.setLayout(boxLayout);
	//��frame�����������ť���
	frame.add(new Button("��ť1"));
	frame.add(new Button("��ť2"));
	frame.pack();
	frame.setVisible(true);
 }
}
