package test;
import java.awt.*;
//import java.awt.BorderLayout;
public class BorderLayoutDemo{
public static void main(String[] args) {
	Frame frame =new Frame("�������BorLayout");
	 //����BorderLayout���ֹ�����
	frame.setLayout(new BorderLayout());
	//��frame��ָ������������
	frame.add(new Button("���ఴť"),BorderLayout.NORTH);
	frame.add(new Button("�ϲఴť"),BorderLayout.SOUTH);
	frame.add(new Button("�вఴť"),BorderLayout.CENTER);
	
	frame.add(new TextField("�����ı���"));
	Panel p=new Panel();
	p.add(new Button("�м䰴ť"));
	p.add(new TextField("�����ı���"));
	frame.add(p);
	frame.pack();
	frame.setVisible(true);

 }
}

