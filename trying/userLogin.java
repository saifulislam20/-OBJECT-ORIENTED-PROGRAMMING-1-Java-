import java.util.Scanner;
import java.io.*;

class userLogin extends userRegister{
	
	void login() throws IOException{
	String uname,upass,extraName,extraPassword;
	int a=1;
	Scanner input = new Scanner(System.in);
	
	 FileReader reader  = new FileReader("username.txt");
	 BufferedReader bfl = new BufferedReader(reader);
	 
	 FileReader reader2  = new FileReader("userpassword.txt");
	 BufferedReader bfl2 = new BufferedReader(reader2);
    System.out.println("");
    System.out.print("name : ");
    uname = input.nextLine();
	System.out.println("");
    System.out.print("Password : ");
    upass = input.nextLine();
    
    
	while( (extraName = bfl.readLine()) != null  ){
		while( (extraPassword = bfl2.readLine()) != null ) {
			
	         if(extraName.equals(uname) && extraPassword.equals(upass)){
	          while(a==1){
				  System.out.println("Sucessfully loged in !!! ");
				  System.out.println("");
					System.out.println("---------------------------------------");
					System.out.println("      What do you want ot do ?");
					System.out.println("---------------------------------------");
					System.out.println("1 for check covid 19");
					System.out.println("2 for global update");
					System.out.println("3 for local update");
					System.out.println("4 for prevention");
					System.out.println("5 for Exit");
					System.out.print("Your option : ");
					
					int option1 = input.nextInt();
					switch(option1){
						
						case 1:{
							System.out.println("");
							System.out.println("-----------------------------------------------");
							System.out.println("                Check Covid 19");
							System.out.println("-----------------------------------------------");
							System.out.println("1. Fever");
							System.out.println("2. Cough");
							System.out.println("3. Trouble breathing");
							System.out.println("4. fatigue");
							System.out.println("5. loss of taste");
							System.out.println("6. loss of smell");
							System.out.println("7. sore throat");
							System.out.println("How many syntroms do you have from uper list ?");
							int b = input.nextInt();
							if(b>=6){
								System.out.println("");
								System.out.println("You have more than 80% chance of getting covid 19\nContact our emergecncy number 16263");
								System.out.println("");
							}
							else if(b>=4 && b<=5){
								System.out.println("");
								System.out.println("You have more than 60% chance of getting covid 19\nYou can take 14 days of wuarantine and keep distance from your family util you get better\nin emergency Contact our emergecncy number 16263");
								System.out.println("");
							}
							else if(b<4){
								System.out.println("");
								System.out.println("You have less than a 30%chance of getting COVID-19. Please keep yourselves safe and your family. In emergency contact in this number 16263");
								System.out.println("");
							}
							else{
								System.out.println("");
								System.out.println("Invalid input");
								System.out.println("");
							}
							System.out.println("");
							System.out.println("press 1 for return to main menu");
							System.out.println("press 2 for exit");
							int d = input.nextInt();
							if(d==1){
								continue;
							}
							else if(d==2){
								return;
							}
							
						}
						case 2:{
							System.out.println("");
							System.out.println("-----------------------------------------------");
							System.out.println("                Global update");
							System.out.println("-----------------------------------------------");
							System.out.println("Covid 19 confirm cases 30.9M");
							System.out.println("Recoverd 21.2M");
							System.out.println("Death 960K");
							System.out.println("");
							System.out.println("press 1 for return to main menu");
							System.out.println("press 2 for exit");
							int d = input.nextInt();
							if(d==1){
								continue;
							}
							else if(d==2){
								return;
							}
						}
						case 3:{
							System.out.println("");
							System.out.println("-----------------------------------------------");
							System.out.println("                Local update");
							System.out.println("-----------------------------------------------");
							System.out.println("Covid 19 confirm cases 349K");
							System.out.println("Recoverd 257K");
							System.out.println("Death 4939");
							System.out.println("");
							System.out.println("press 1 for return to main menu");
							System.out.println("press 2 for exit");
							int d = input.nextInt();
							if(d==1){
								continue;
							}
							else if(d==2){
								return;
							}
						}
						case 4:{
							System.out.println("");
							System.out.println("-----------------------------------------------");
							System.out.println("                Prevention");
							System.out.println("-----------------------------------------------");
							System.out.println("1. Regularly and thoroughly clean your hands.");
							System.out.println("2. Maintain at least 1 meter (3 feet) distance between yourself and others.");
							System.out.println("3. Avoid going to crowded places.");
							System.out.println("4. Avoid touching eyes, nose and mouth");
							System.out.println("5. Make sure you, and the people around you, follow good respiratory hygiene");
							System.out.println("6. Keep up to date on the latest information from trusted sources");
							System.out.println("7. Stay home and self-isolate even with minor symptoms such as cough, headache, mild fever, until you recover");
							System.out.println("");
							System.out.println("press 1 for return to main menu");
							System.out.println("press 2 for exit");
							int d = input.nextInt();
							if(d==1){
								continue;
							}
							else if(d==2){
								return;
							}
						}
						
						case 5:{
							return;
						}
					}
				}
	}
	else{
		System.out.println("");
		System.out.println("Invalid Login");
	}
	
}
}

}
}