package test;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
public class SimpleMenu {
private Frame frame=new Frame("这里测试菜单相关组件");


//创建菜单条
MenuBar menuBar=new MenuBar();

//创建菜单组件

Menu fileMenu=new Menu("文件");
Menu editMenu=new Menu("编辑");
Menu   formatMenu=new Menu("格式");

//菜单项组件

MenuItem auto=new MenuItem("自动换行");
MenuItem copy=new MenuItem("复制");
MenuItem  paste=new MenuItem("粘贴");
//关联快捷键
MenuItem  comment=new MenuItem("注释 ",new MenuShortcut(KeyEvent.VK_Q,true));
TextArea ta=new TextArea(6,40);
MenuItem  cancelComment=new MenuItem("取消注释");
public void init() {
	
	comment.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			
			
			
			ta.append("您点击了菜单项："+e.getActionCommand()+"\n");
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
