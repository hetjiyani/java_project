import java.util.Scanner;
class Retail_Clerk {

    Scanner sc = new Scanner(System.in);

    String role1 = "Retail Clerk";
    String industry = "";
    String tasks = "";
    String skills = "";

    void industry() {
        System.out.println(
                "Enter the organization or industry you are currently working in (or type N/A if not applicable):");
        industry = sc.nextLine();
        skillsforretail a = new skillsforretail();
        a.taskSelection();
    }

}