package test;
import java.awt.*;
import javax.swing.*;
public class BoxLayoutDemo2 {
public static void main(String[] args) {
	Frame frame=new Frame("�������BoxLayout");
	
	
	//����һ��ˮƽ���е�Box����
	Box hbox=Box.createHorizontalBox();
	//����ǰ���������������ť
	hbox.add(new Button("ˮƽ��ť1"));
	hbox.add(new Button("ˮƽ��ť2"));
	//����һ����ֱ���������Box����
	Box vbox=Box.createVerticalBox();
	//����ǰ���������������ť
	vbox.add(new Button("��ֱ��ť1"));
	vbox.add(new Button("��ֱ��ť2"));
	//������Box������ӵ�Frame��չʾ
	frame.add(hbox,BorderLayout.NORTH);
	frame.add(vbox);
	frame.pack();
	frame.setVisible(true);
 }
}
