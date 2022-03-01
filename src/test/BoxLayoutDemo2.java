package test;
import java.awt.*;
import javax.swing.*;
public class BoxLayoutDemo2 {
public static void main(String[] args) {
	Frame frame=new Frame("这里测试BoxLayout");
	
	
	//创建一个水平排列的Box容器
	Box hbox=Box.createHorizontalBox();
	//往当前容器中添加两个按钮
	hbox.add(new Button("水平按钮1"));
	hbox.add(new Button("水平按钮2"));
	//创建一个垂直排列组件的Box容器
	Box vbox=Box.createVerticalBox();
	//往当前容器中添加两个按钮
	vbox.add(new Button("垂直按钮1"));
	vbox.add(new Button("垂直按钮2"));
	//把两个Box容器添加到Frame中展示
	frame.add(hbox,BorderLayout.NORTH);
	frame.add(vbox);
	frame.pack();
	frame.setVisible(true);
 }
}
