package test;
import java.awt.*;

import javax.swing.BoxLayout;
public class BoxLayoutDemo {
public static void main(String[] args) {
	Frame frame=new Frame("这里测试BoxLayout");
	
	//基于frame容器，创建一个BoxLayout对象，并且该对象存放组件时垂直存放
	BoxLayout boxLayout=new BoxLayout(frame,BoxLayout.X_AXIS);
	
   //把BoxLayout对象设置给Frame
	frame.setLayout(boxLayout);
	//往frame中添加两个按钮组件
	frame.add(new Button("按钮1"));
	frame.add(new Button("按钮2"));
	frame.pack();
	frame.setVisible(true);
 }
}
