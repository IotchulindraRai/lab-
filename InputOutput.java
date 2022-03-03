package hello;
import java.io.*;
public class InputOutput {
	 
	 
		public static void main(String[] args) throws FileNotFoundException, IOException{ 
		File f=new File("input.txt"); 
		f.createNewFile(); 
		FileInputStream in=null;
		FileOutputStream out= null; 
		try { 
			in = new FileInputStream("input.txt"); 
			out = new FileOutputStream("output.txt"); 
		int c;
		while((c=in.read())!=-1) { 
			out.write(c);
		} 
		} 
		finally { if(in!=null) { 
			in.close(); } 
	if(out!=null) {
		out.close();
	} 
	} 
	} 
	}
