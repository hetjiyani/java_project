import java.util.Scanner;
class User {
    String a[] = new String[10];
    Scanner sc = new Scanner(System.in);
    String role1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String role1 = "";
        User a = new User();
        System.out.println("👋 To start, share a current or previous role:");
        System.out.println();
        System.out.println("1. Student");
        System.out.println("2. Software Developer");
        System.out.println("3. Product Manager");
        System.out.println("4. Parent");
        System.out.println("5. Retail Clerk");
        System.out.println("Enter number :");

        int y = sc.nextInt();

        if (y == 1) {
            student ab = new student();
            ab.Student("Student");
        }
        if (y == 2) {
            role1 = "software developer";
            Software_Developer ab = new Software_Developer();
            ab.industry();
        }
        if (y == 3) {
            role1 = "product manager";
            Product_Manager ab = new Product_Manager();
            ab.industry();
        }
        if (y == 4) {
            role1 = "parent";
            Parent parent = new Parent();
            parent.industry();

        }
        if (y == 5) {
            role1 = "retail clerk";
            Retail_Clerk rc = new Retail_Clerk();
            rc.industry();

        }

    }
}
