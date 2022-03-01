package test;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class EventDemo1 {
Frame frame=new Frame("这里测试事件处理");
TextField tf=new TextField(30);
Button ok=new Button("确定");
public static void main(String[] args) {
new EventDemo1().init();
}
public void init() {
	//组装视图
	//监听器
	//MyListener  myListener=new MyListener();
	//注册监听
	ok.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("ok按钮被点击了。。");
			tf.setText("Hello World");
		}
	});
	//把tf和ok放入到frame中
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
