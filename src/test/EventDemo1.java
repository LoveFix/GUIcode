package test;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class EventDemo1 {
Frame frame=new Frame("��������¼�����");
TextField tf=new TextField(30);
Button ok=new Button("ȷ��");
public static void main(String[] args) {
new EventDemo1().init();
}
public void init() {
	//��װ��ͼ
	//������
	//MyListener  myListener=new MyListener();
	//ע�����
	ok.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("ok��ť������ˡ���");
			tf.setText("Hello World");
		}
	});
	//��tf��ok���뵽frame��
	frame.add(tf,BorderLayout.NORTH);
	frame.add(ok);
	
	frame.pack();
	frame.setVisible(true);
}
/*private  class MyListener implements ActionListener{
@Override

public void actionPerformed(ActionEvent e) {
  tf.setText("Hello World");
	
}
 }*/
}
