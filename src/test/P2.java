package test;
import java.awt.*;
public class P2 {
public static void main(String[] args) {
Frame frame=new Frame();
Panel p=new Panel();
p.add(new TextField("������һ�������ı�"));
p.add(new Button("������һ�����԰�ť"));
frame.add(p);
frame.setBounds(100,100,500,300);
frame.setVisible(true);
}
}