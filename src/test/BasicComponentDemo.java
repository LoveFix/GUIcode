package test;
import java.awt.*;
import javax.swing.*;
public class BasicComponentDemo {

	Frame frame=new Frame("������Ի������");
	TextArea ta=new TextArea(5,20);
	Choice colorChooser=new Choice();
	
	CheckboxGroup cbg=new CheckboxGroup();
	Checkbox male=new Checkbox("��",cbg,true);
	Checkbox female=new Checkbox("Ů",cbg,false);
	
	Checkbox isMarried =new Checkbox("�Ƿ��ѻ�");
	
	TextField tf=new TextField(50);
	
	Button ok=new Button("ȷ��");
	
	List colorList=new List(6,true);
	
public void init() {
	//��װ����

//��װ�ײ�
	Box bBox=Box.createHorizontalBox();
	bBox.add(tf);
	bBox.add(ok);
	frame.add(bBox,BorderLayout.SOUTH);
	
	//��װѡ�񲿷�
	colorChooser.add("��ɫ");
	colorChooser.add("��ɫ");
	colorChooser.add("��ɫ");
	Box cbox=Box.createHorizontalBox();
	cbox.add(colorChooser);
	cbox.add(male);
	cbox.add(female);
	cbox.add(isMarried);
	//��װ�ı����ѡ�񲿷�
	Box topLeft=Box.createVerticalBox();
	topLeft.add(ta);
	topLeft.add(cbox);
	
	//��װ������ߺ��б��
	colorList.add("��ɫ");
	colorList.add("��ɫ");
	colorList.add("��ɫ");
	Box top=Box.createHorizontalBox();
	top.add(topLeft);
	top.add(colorList);
	frame.add(top);
	
	//����frame��Ѵ�С���ҿɼ�
	frame.pack();
	frame.setVisible(true);
}
public static void main(String[] args) {
	new BasicComponentDemo().init();
}
}
