import java.io.*;
import java.util.Scanner;

class userRegister{
	

	void register() throws IOException{
			String name="",password="",extraName,extraPassword;
	Scanner input = new Scanner(System.in);
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader bfr    = new BufferedReader(isr);
	
	File file = new File("username.txt");
	file.createNewFile();
	
	FileWriter writer = new FileWriter(file);
	System.out.println("");
	System.out.print("user name : ");
	extraName = bfr.readLine();
	name = name+extraName+"\r\n";
	
	writer.write(name);
	writer.flush();
	//writer.close();
	
    File file2 = new File("userpassword.txt");
	file.createNewFile();
	
	FileWriter writer2 = new FileWriter(file2);		
	
	System.out.println("");
	System.out.print("password : ");
	extraPassword = bfr.readLine();
	password = password+extraPassword+"\r\n";
	
	writer2.write(password);
	writer2.flush();
	writer2.close();
	}
}