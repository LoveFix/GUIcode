package test;
import java.awt.*;
import javax.swing.*;
public class BoxLayoutDemo3 {
public static void main(String[] args) {
	Frame frame=new Frame("�������BoxLayout");
	//����ˮƽ���е�Box����hbox
	Box hbox=Box.createHorizontalBox();
	//��hbox��Ӱ�ť������Ҫ�ڶ����ť֮����ӷָ�
	hbox.add(new Button("ˮƽ��ť1"));
	hbox.add(Box.createHorizontalGlue());//�÷ָ������������϶���������
	hbox.add(new Button("ˮƽ��ť2"));
	hbox.add(Box.createHorizontalStrut(30));
	hbox.add(new Button("ˮƽ��ť3"));
	
	//������ֱ���е�Box����vbox
	Box vbox=Box.createVerticalBox();
	//��vbox��������Ӱ�ť,����Ҫ�ڶ����ť֮����ӷָ�
	
	vbox.add(new Button("��ֱ��ť1"));
	vbox.add(Box.createVerticalGlue());//���������򶼿�������
	
	vbox.add(new Button("��ֱ��ť2"));
	vbox.add(Box.createVerticalStrut(30));
	vbox.add(new Button("��ֱ��ť3"));
	//��box������ӵ�frame��
	frame.add(hbox,BorderLayout.NORTH);
	frame.add(vbox);
	frame.pack();
	frame.setVisible(true);
 }
}
