package test;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

//1.������ΪLogin���࣬�ڸ����д���һ����ΪInitUI�ķ�����ͼ�ν�����ڴ˷�����ʵ��
public class P1 {

	public static void main(String[] args) {
		P1 log=new P1();
		log.InitUI();
	}
public void InitUI()
{
//1.1����һ������������Ҳ���ǿհ״��ڣ���Ϊ�˴����������ԣ��������ƣ���С����ʾλ�ã��ر����ã�

// ��JFrame����һ����Ϊframe�Ķ�����������Ҫ��ӵİ���Ϊjavax.swing.JFrame
JFrame frame=new JFrame();
//���ô�������
frame.setTitle("Login");
//���ô��ڴ�С
frame.setSize(540,427);
//���ô���λ����Ļ����
frame.setLocationRelativeTo(null);
//����Ϊ3ʱ����ʾ�رմ���������˳�
frame.setDefaultCloseOperation(3);

//1.2���ô���������Ĳ��֣��˴�ʹ����ʽ����FlowLayout����ʽ����������word�Ĳ���
//��FlowLayout����һ����Ϊf1�Ķ���,��Ҫ��ӵİ���Ϊjava.awt.FlowLayout������LEFT��ʾ����룬CENTER��ʾ���ж��룬RIGHT��ʾ�Ҷ���
FlowLayout f1=new FlowLayout(FlowLayout.LEFT);
//frame��������Ϊf1����ʽ�����
frame.setLayout(f1);

//1.3�ڴ��������ͼƬ������

//�����ͼƬ֮ǰ���Ȱ�ͼƬ�Ӵ����м��ص��ڴ�������ʹ��ImageIcon����Ҫ��ӵİ���Ϊjavax.swing.ImageIcon,������ΪͼƬ·����·����Ҫʹ�á�/��,����ʹ�á�\��
ImageIcon imag1=new ImageIcon("H:/1.png");
//JLabel���ڶ������������ͼƬ���֣���Ҫ��ӵİ���javax.swing.JLabel,�˴���������ص�ͼƬ����Ϊһ��JLabel����
JLabel pic1=new JLabel(imag1);
//��������ͼƬ������ӵ� ������
frame.add(pic1);


//����һ���յ�JLabel�����ĳ��ȿ��Ϊ110,30����Ϊ��������ʽ����룬Ϊ�˽����˺š�һ����������м䣬��������ɿյ�JLabel���
JLabel name1=new JLabel();
//���ÿ�JLabel���ȴ�С���˴�����ʹ��setSize���ô�С��setSizeֻ�����ö���������С���˴���setPreferredSize��Dimension������С����Ҫ��ӵİ���Ϊjava.awt.Dimension.
name1.setPreferredSize(new Dimension(110,30));
//����JLabel����봰��
frame.add(name1);

//ͬ�ϣ��˴���ӵĲ��ǿ�JLabel����������Ϊ���˺š���JLabel
JLabel name=new JLabel("�˺ţ�");
frame.add(name);

//JTextField�ڴ��������һ��������ɼ��ı����ı�����Ҫ��ӵİ���Ϊjavax.swing.JTextField.
JTextField nametext=new JTextField();
//�����ı����С
nametext.setPreferredSize(new Dimension(220, 30));
//��ӵ�������
frame.add(nametext);

//ͬname1
JLabel name2=new JLabel();
name2.setPreferredSize(new Dimension(110,30));
frame.add(name2);

//ͬname1
JLabel name3=new JLabel();
name3.setPreferredSize(new Dimension(110,30));
frame.add(name3);

//ͬname
JLabel password=new JLabel("���룺");
frame.add(password);

//JPasswordField����һ�������ı�������������ı��ǲ��ɼ��ģ�����ͬnametext
JPasswordField passwordtext=new JPasswordField();
passwordtext.setPreferredSize(new Dimension(220, 30));
frame.add(passwordtext);

//ͬname1
JLabel name4=new JLabel();
name4.setPreferredSize(new Dimension(110,30));
frame.add(name4);

//ͬname1
JLabel name5=new JLabel();
name5.setPreferredSize(new Dimension(220,30));
frame.add(name5);

//JButton����һ���ɵ���İ�ť����ť�Ͽ���ʾ�ı�ͼƬ
JButton bu=new JButton("��¼");
bu.setPreferredSize(new Dimension(80,30));
frame.add(bu);

//���ô��ڿɼ����˾�һ��Ҫ�ڴ����������ú���֮�������ӣ���Ȼ�޷�������ʾ
frame.setVisible(true);
}
}