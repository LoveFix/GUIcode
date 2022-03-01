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
Frame frame=new Frame("这里测试监听器");

//创建组件（事件源）
TextField tf=new TextField(30);
Choice names =new Choice();
names.add("柳岩");
names.add("舒淇");
names.add("闫妮");

//给文本域添加TextListener，捡起内容的变化
tf.addTextListener(new TextListener() {
	@Override
	public void textValueChanged(TextEvent e) {
        
		String text=tf.getText();
		System.out.println("当前文本框中的内容"+text);
		
	}
});
//给下拉选择框添加 ItemListener

names.addItemListener(new ItemListener() {
@Override	
public void itemStateChanged(ItemEvent e) {
	Object item=e.getItem();
	System.out.println("当前选中的条目为"+item);
}
});;

frame.addContainerListener(new ContainerListener() {


	@Override
	public void componentRemoved(ContainerEvent e) {
		// TODO Auto-generated method stub
		Component child=e.getChild();
		System.out.println("往frame中添加了"+child);
		
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
