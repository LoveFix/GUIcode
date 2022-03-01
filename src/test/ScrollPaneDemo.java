package test;
import java.awt.*;
public class ScrollPaneDemo {
public static void main(String[] args) {
	Frame frame =new Frame("这里演示ScrollPane");
	
	//这里创建ScrollPane对象
	ScrollPane sp=new ScrollPane();
	//总是显示滚动条:ScrollPane sp=new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);
	//往ScrollPane添加对象
	sp.add(new TextField("这是测试文本"));
	sp.add(new Button("这是测试按钮"));
	frame.add(sp);
	frame.setBounds(100, 100, 500, 300);
	frame.setVisible(true);
}
}
