package program;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

public class Project {
	public static int n=0;
	/********** Begin **********/
	public void showDirStructure(File file)	throws ArrayIndexOutOfBoundsException{
		FileFilter filter = file2 -> {
		      if (file.isFile()) {
		        String fileName = file.getName().toLowerCase();
		        if (fileName.endsWith(".jpg")||fileName.endsWith(".bmp")||fileName.endsWith(".png")) {
		          return true;
		         
		        }
		        //else   return false;
		      }
		      return false;
		    };
    
    
    
    String[] s=(file.toString()).split("/");
		String s1=s[(s.length)-1];
		for(int i=0;i<n;i++)System.out.print(" ");
		System.out.println("+--"+s1);
		n=n+2;
     File[] files=file.listFiles(filter);
      Arrays.sort(files);
     for(File file1:files) {
    	 if(file1.isDirectory())showDirStructure(file1);
    	 else {
    		
    		  for(int i=0;i<n;i++)System.out.print(" ");
             System.out.println("--"+file1.getName());
    	 }
    	 
     }
n=n-2;


	}
	


	/********** End **********/
}
