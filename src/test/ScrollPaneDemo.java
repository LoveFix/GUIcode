package test;
import java.awt.*;
public class ScrollPaneDemo {
public static void main(String[] args) {
	Frame frame =new Frame("������ʾScrollPane");
	
	//���ﴴ��ScrollPane����
	ScrollPane sp=new ScrollPane();
	//������ʾ������:ScrollPane sp=new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);
	//��ScrollPane��Ӷ���
	sp.add(new TextField("���ǲ����ı�"));
	sp.add(new Button("���ǲ��԰�ť"));
	frame.add(sp);
	frame.setBounds(100, 100, 500, 300);
	frame.setVisible(true);
}
}
