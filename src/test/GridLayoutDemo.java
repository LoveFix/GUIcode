package test;
import java.awt.*;
public class GridLayoutDemo {

	public static void main(String[] args) {
	Frame frame=new Frame("计算器");	
	
   //创建一个panel对象，里面存放一个TextFiled组件
	Panel p=new Panel();
  //把当前这个panel添加到frame的北边区域
	p.add(new TextField(30));//30代表可以容纳多少字符
  frame.add(p,BorderLayout.NORTH);
  Panel p2=new Panel();//panel默认的布局管理器是FlowLayout
  p2.setLayout(new GridLayout(3,5,4,4));
  //frame默认的布局管理器是FlowLayout
  //往panel添加内容
  for(int i=0;i<10;i++) {
	  p2.add(new Button(i+""));
  }
  p2.add(new Button("+"));
  p2.add(new Button("-"));
  p2.add(new Button("*"));
  p2.add(new Button("/"));
  p2.add(new Button("."));
  frame.add(p2);
	frame.pack();
	frame.setVisible(true);
	}
}
