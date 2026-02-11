import java.util.Scanner;
class Parent {

    Scanner sc = new Scanner(System.in);

    String role1 = "Parent";
    String industry = "";
    String tasks = "";
    String skills = "";

    void industry() {
        System.out.println(
                "Enter the organization or industry you are currently associated with (or type N/A if not applicable):");
        industry = sc.nextLine();
        skillsforparent a = new skillsforparent();
        a.taskSelection();
    }

}