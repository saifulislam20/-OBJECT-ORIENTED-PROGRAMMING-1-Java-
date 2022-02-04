import java.util.Scanner;
class patient{
	String pname,pdob,pgender,pbg,pnationality,pcn,pstatus;
	int count=4;
	void newPatient(){
		Scanner input = new Scanner(System.in);
		System.out.println("");
        System.out.print("Name : ");
        pname = input.nextLine();
        System.out.print("date of birth : ");
        pdob = input.nextLine();
        System.out.print("gender : ");
        pgender = input.nextLine();
        System.out.print("blood group : ");
        pbg = input.nextLine();
        System.out.print("nationality : ");
        pnationality = input.nextLine();
        System.out.print("contact number : ");
        pcn = input.nextLine();
		System.out.print("Active status : ");
		pstatus = input.nextLine();
		System.out.println("");
        
	} 
	void showPatient(){
		System.out.println(pname + "\t" + pdob + "\t" + pgender + "\t" + pbg + "\t" + pnationality + "\t" + pcn + "\t" + pstatus);
	}
	
}