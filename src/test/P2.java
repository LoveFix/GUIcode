package test;
import java.awt.*;
public class P2 {
public static void main(String[] args) {
Frame frame=new Frame();
Panel p=new Panel();
p.add(new TextField("这里是一个测试文本"));
p.add(new Button("这里是一个测试按钮"));
frame.add(p);
frame.setBounds(100,100,500,300);
frame.setVisible(true);
}
}