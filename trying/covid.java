import java.util.Scanner;

public class covid{
	public static void main (String [] args) throws Exception{
		int option, status = 0,count=4;
		
		Scanner input = new Scanner(System.in);
		userLogin ul = new userLogin();
		userRegister ur = new userRegister();
		patient[] p = new patient[100];
		for (int i = 0; i < 100; i++){
            p[i] = new patient();
		}
		p[0].pname = "MD HAFIZUR RAHMAN";
        p[0].pdob = "05/09/2000";
        p[0].pgender = "MALE";
        p[0].pbg = "B+";
        p[0].pnationality = "BANGLADESH";
        p[0].pcn = "01316458233";
		p[0].pstatus = "YES";
		
		p[1].pname = "MD RABIUL ISLAM RASEL";
        p[1].pdob = "22/09/2000";
        p[1].pgender = "MALE";
        p[1].pbg = "O+";
        p[1].pnationality = "BANGLADESH";
        p[1].pcn = "01537018681";
		p[1].pstatus = "YES";
		
		p[2].pname = "MIR MARUF AHMED    ";
        p[2].pdob = "29/02/2000";
        p[2].pgender = "MALE";
        p[2].pbg = "O+";
        p[2].pnationality = "BANGLADESH";
        p[2].pcn = "01714253676";
		p[2].pstatus = "YES";
		
		p[3].pname = "TAHMID ALAM      ";
        p[3].pdob = "29/11/2000";
        p[3].pgender = "MALE";
        p[3].pbg = "O+";
        p[3].pnationality = "BANGLADESH";
        p[3].pcn = "01791450188";
		p[3].pstatus = "YES";
		while(status == 0){
			System.out.println("");
			System.out.println("");
			System.out.println("---------------------------------------");
			System.out.println("          choose your option : ");
			System.out.println("---------------------------------------");
			System.out.println("1 for login ");
			System.out.println("2 for signup ");
			System.out.println("3 for admin login ");
			System.out.print("Your option : ");
		    option = input.nextInt();
			switch(option){
				
				case 1:{
					ul.login();
					break;
				}
				case 2:{
					ur.register();
					break;
				}
				case 3:{
					
					int ch = 1,g=1;
					while(true) {
						if(ch==1) {
					String Id = "20420671";
					System.out.print("user ID : ");
                    String adminId = input.nextLine();
					input.nextLine();
					
					if(Id.equals(adminId)) {
						String pass = "123";
                    System.out.print("Password : ");
                    String adminPass = input.nextLine();
                    
                    if(pass.equals(adminPass)) {
                    	
                    while(g==1)	{
					
                    System.out.println("Sucessfully loged in !!! ");
                    System.out.println("");
					System.out.println("---------------------------------------");
					System.out.println("      What do you want ot do ?");
					System.out.println("---------------------------------------");
					System.out.println("1. Add");
					System.out.println("2. View");
					System.out.print("Your option : ");
					int c = input.nextInt();
					switch(c){
						
						case 1:{
							p[count].newPatient();count++;
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
							System.out.println("-------------------------------------------------------------------------------------------------");
							System.out.println("Name                    Date of birth   Gender  B.G     nationality     Contact number  Statusess");
							System.out.println("-------------------------------------------------------------------------------------------------");
							for(int j = 0; j<count; j++){
								p[j].showPatient();
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
					}
					break;
				
				
			  }}else {
				  System.out.println("Wrong passwrod");
			  }
				  
			  
			}else {
				System.out.println("Wrong user Id");
			}
		}
						System.out.println("Do you want to continue ?");
						System.out.println("1 for continue");
						System.out.println("2 for exit");
						ch = input.nextInt();
						input.nextLine();
}
}
}
}
}
}


