package test;
import java.awt.*;
public class FlowLayoutDemo {
public static void main(String[] args) {
	Frame frame =new Frame("������ʾFlowLayout");
	 //ͨ��setLayout�������������Ĳ��ֹ�����
	//frame.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));
	//frame.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
	frame.setLayout(new FlowLayout(FlowLayout.RIGHT,40,20));
	for(int i=0;i<100;i++) {
		frame.add(new Button("��ť"+i));
	}
	frame.pack();
	frame.setVisible(true);
}
}
