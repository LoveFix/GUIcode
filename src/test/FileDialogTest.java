package test;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class FileDialogTest {
public static void main(String[] args) {
Frame frame=new Frame("�������FileDialog");
	
//��������FilaDialog����
FileDialog f1=new FileDialog(frame, "ѡ��Ҫ�򿪵��ļ�",FileDialog.LOAD);
FileDialog f2=new FileDialog(frame, "ѡ��Ҫ�򿪵��ļ�",FileDialog.SAVE);

//����������ť
Button b1=new Button("���ļ�");
Button b2=new Button("�����ļ�");

//����������ť���õ�������Ϊ����ȡ�򿪻��߱�����ļ�·����
b1.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent e) {
		
	f1.setVisible(true);//���������������	
	//��ȡѡ���·�����ļ�
	String directory=f1.getDirectory();
	String file=f1.getFile();
	System.out.println("�򿪵��ļ�·��Ϊ��"+directory);
	System.out.println("�򿪵��ļ�����Ϊ��"+file);
	}
});
b2.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent e) {
		f2.setVisible(true);
		
		String directory=f2.getDirectory();
		String file=f2.getFile();
		System.out.println("������ļ�·��Ϊ��"+directory);
		System.out.println("������ļ�����Ϊ��"+file);
	}
});

frame.add(b1,BorderLayout.NORTH);
frame.add(b2);
frame.pack();
frame.setVisible(true);
}
}
