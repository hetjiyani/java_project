import java.util.Scanner;
class Software_Developer {
    Scanner sc = new Scanner(System.in);

    String role1 = "Software Developer";
    String industry = "";
    String tasks = "";
    String skills = "";

    void industry() {

        System.out.println("Enter the organization or industry you are currently working in:");
        industry = sc.nextLine();
        skillforsoftware_developer a = new skillforsoftware_developer();
        a.taskSelection();
    }

}