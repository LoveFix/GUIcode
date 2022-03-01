package test;

import java.awt.*;
import java.awt.event.*;

public class CardLayoutDemo {
	public static void main(String[] args) {
Frame frame =new Frame("�������CardLayout");
//����һ��Panel���������洢���ſ�Ƭ
Panel p1=new Panel();
//����CardLayout���󣬲��ҰѸö������ø�֮ǰ����������
CardLayout cardLayout=new CardLayout();
p1.setLayout(cardLayout);
//��panel�д洢������
String[] names={"��һ��","�ڶ���","������","������","������"};
for(int i=0;i<names.length;i++) {
	p1.add(names[i],new Button(names[i]));
}

//��panel�ŵ�frame���м�����

frame.add(p1);
//����һ��panel��p2�����洢�����ť���

Panel p2=new Panel();
//����5����ť���
Button b1=new Button("��һ��");
Button b2=new Button("��һ��");
Button b3=new Button("��һ��");
Button b4=new Button("���һ��");
Button b5=new Button("������");

//����һ���¼���������������ť�ĵ������
ActionListener listener =new ActionListener() { 
	public void actionPerformed(ActionEvent e) {
		String actionCommand =e.getActionCommand();
	//����ַ�����ʵ���ǰ�ť�ϵ�����
		switch(actionCommand) {
		case "��һ��":
			cardLayout.previous(p1); break;
		case "��һ��":
			cardLayout.next(p1);break;
		case "��һ��":
			cardLayout.first(p1);break;
		case "���һ��":
			cardLayout.last(p1);break;
		case "������":
			cardLayout.show(p1,"������");break;
		}
	}

};


//�ѵ�ǰ����¼��������Ͷ����ť�󶨵�һ��
b1.addActionListener(listener);
b2.addActionListener(listener);
b3.addActionListener(listener);
b3.addActionListener(listener);
b4.addActionListener(listener);
b5.addActionListener(listener);
//�Ѱ�ť��ӵ�����p2��
p2.add(b1);
p2.add(b2);
p2.add(b3);
p2.add(b4);
p2.add(b5);
//��p2�ŵ�frame���ϱ�����
frame.add(p2,BorderLayout.SOUTH);
frame.pack();
frame.setVisible(true);
	}
}