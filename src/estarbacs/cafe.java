package estarbacs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class cafe {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
 File f = new File("C:\\Users\\juan__000\\Desktop\\fi.txt");
FileReader fr = new FileReader(f);
 
 int i;
 while ((i=fr.read())!=-1){
	 System.out.print((char)i);
 }
 fr.close();
		
	}

}
