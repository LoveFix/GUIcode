package test;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
public class SimpleMenu {
private Frame frame=new Frame("������Բ˵�������");


//�����˵���
MenuBar menuBar=new MenuBar();

//�����˵����

Menu fileMenu=new Menu("�ļ�");
Menu editMenu=new Menu("�༭");
Menu   formatMenu=new Menu("��ʽ");

//�˵������

MenuItem auto=new MenuItem("�Զ�����");
MenuItem copy=new MenuItem("����");
MenuItem  paste=new MenuItem("ճ��");
//������ݼ�
MenuItem  comment=new MenuItem("ע�� ",new MenuShortcut(KeyEvent.VK_Q,true));
TextArea ta=new TextArea(6,40);
MenuItem  cancelComment=new MenuItem("ȡ��ע��");
public void init() {
	
	comment.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			
			
			
			ta.append("������˲˵��"+e.getActionCommand()+"\n");
		}
	}
		
	);
	
	
	formatMenu.add(comment);
	formatMenu.add(cancelComment);
	
	editMenu.add(auto);
	editMenu.add(copy);
	editMenu.add(paste);
	editMenu.add(formatMenu);
	menuBar.add(fileMenu);
	menuBar.add(editMenu);
	
	frame.setMenuBar(menuBar);
	
	frame.add(ta);
	
	frame.pack();
	frame.setVisible(true);
	
	
}
	

public static void main(String[] args) {
	new SimpleMenu().init();
	
}
}
