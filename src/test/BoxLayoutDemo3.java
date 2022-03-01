package test;
import java.awt.*;
import javax.swing.*;
public class BoxLayoutDemo3 {
public static void main(String[] args) {
	Frame frame=new Frame("这里测试BoxLayout");
	//创建水平排列的Box容器hbox
	Box hbox=Box.createHorizontalBox();
	//往hbox添加按钮，还需要在多个按钮之间添加分割
	hbox.add(new Button("水平按钮1"));
	hbox.add(Box.createHorizontalGlue());//该分割在两个方向上都可以拉伸
	hbox.add(new Button("水平按钮2"));
	hbox.add(Box.createHorizontalStrut(30));
	hbox.add(new Button("水平按钮3"));
	
	//创建垂直排列的Box容器vbox
	Box vbox=Box.createVerticalBox();
	//往vbox容器中添加按钮,还需要在多个按钮之间添加分割
	
	vbox.add(new Button("垂直按钮1"));
	vbox.add(Box.createVerticalGlue());//在两个方向都可以拉伸
	
	vbox.add(new Button("垂直按钮2"));
	vbox.add(Box.createVerticalStrut(30));
	vbox.add(new Button("垂直按钮3"));
	//把box容器添加到frame中
	frame.add(hbox,BorderLayout.NORTH);
	frame.add(vbox);
	frame.pack();
	frame.setVisible(true);
 }
}
