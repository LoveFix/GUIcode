package test;
import java.awt.*;
public class GridLayoutDemo {

	public static void main(String[] args) {
	Frame frame=new Frame("������");	
	
   //����һ��panel����������һ��TextFiled���
	Panel p=new Panel();
  //�ѵ�ǰ���panel��ӵ�frame�ı�������
	p.add(new TextField(30));//30����������ɶ����ַ�
  frame.add(p,BorderLayout.NORTH);
  Panel p2=new Panel();//panelĬ�ϵĲ��ֹ�������FlowLayout
  p2.setLayout(new GridLayout(3,5,4,4));
  //frameĬ�ϵĲ��ֹ�������FlowLayout
  //��panel�������
  for(int i=0;i<10;i++) {
	  p2.add(new Button(i+""));
  }
  p2.add(new Button("+"));
  p2.add(new Button("-"));
  p2.add(new Button("*"));
  p2.add(new Button("/"));
  p2.add(new Button("."));
  frame.add(p2);
	frame.pack();
	frame.setVisible(true);
	}
}
