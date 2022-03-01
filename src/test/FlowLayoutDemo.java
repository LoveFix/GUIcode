package test;
import java.awt.*;
public class FlowLayoutDemo {
public static void main(String[] args) {
	Frame frame =new Frame("这里演示FlowLayout");
	 //通过setLayout方法设置容器的布局管理器
	//frame.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));
	//frame.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
	frame.setLayout(new FlowLayout(FlowLayout.RIGHT,40,20));
	for(int i=0;i<100;i++) {
		frame.add(new Button("按钮"+i));
	}
	frame.pack();
	frame.setVisible(true);
}
}
