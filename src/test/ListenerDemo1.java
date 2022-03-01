package test;
import java.awt.*;
import java.awt.Event.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

import javax.swing.Box;
public class ListenerDemo1 {
public static void main(String[] args) {
Frame frame=new Frame("������Լ�����");

//����������¼�Դ��
TextField tf=new TextField(30);
Choice names =new Choice();
names.add("����");
names.add("���");
names.add("����");

//���ı������TextListener���������ݵı仯
tf.addTextListener(new TextListener() {
	@Override
	public void textValueChanged(TextEvent e) {
        
		String text=tf.getText();
		System.out.println("��ǰ�ı����е�����"+text);
		
	}
});
//������ѡ������ ItemListener

names.addItemListener(new ItemListener() {
@Override	
public void itemStateChanged(ItemEvent e) {
	Object item=e.getItem();
	System.out.println("��ǰѡ�е���ĿΪ"+item);
}
});;

frame.addContainerListener(new ContainerListener() {


	@Override
	public void componentRemoved(ContainerEvent e) {
		// TODO Auto-generated method stub
		Component child=e.getChild();
		System.out.println("��frame�������"+child);
		
	}

	@Override
	public void componentAdded(ContainerEvent e) {
		// TODO Auto-generated method stub
		
	}


});
Box hbox=Box.createHorizontalBox();
hbox.add(names);
hbox.add(tf);
frame.add(hbox);



frame.pack();
frame.setVisible(true);
}
}
