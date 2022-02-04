import java.util.Scanner;
class userAdmin{
	String adminId, adminPass;
	void admin(){
		Scanner input = new Scanner(System.in);
        
        System.out.print("user ID : ");
        adminId = input.nextLine();
        System.out.print("Password : ");
        adminPass = input.nextLine();
		if(adminId.equals("20420671") && adminPass.equals("123456789")){
			
		}

		
	}
}