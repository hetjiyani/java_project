import java.util.Scanner;
class student {
    Scanner sc = new Scanner(System.in);
    static String role1;
    static String role2;
    static String role3 = "";
    static String role4 = "";

    void Student(String role1) {
        System.out.println();
        System.out.println();
        this.role1 = role1;
        System.out.println("Select your level");
        System.out.println("1. High school diploma / GED / equivalent");
        System.out.println("2. Associate's degree");
        System.out.println("3. Bachelor's degree");
        System.out.println("4. Master's degree");
        System.out.println("5. Professional certificate");
        System.out.println("6. Vocational or Technical certificate");
        System.out.println("7. Other");
        System.out.println("Enter the number:");

        int y = sc.nextInt();
        sc.nextLine();

        switch (y) {
            case 1:
                role2 = "High school diploma / GED / equivalent";
                level();
                break;
            case 2:
                role2 = "Associate's degree";
                level();
                break;
            case 3:
                role2 = "Bachelor's degree";
                level();
                break;
            case 4:
                role2 = "Master's degree";
                level();
                break;
            case 5:
                role2 = "Professional certificate";
                level();
                break;
            case 6:
                role2 = "Vocational or Technical certificate";
                level();
                break;
            case 7:
                System.out.println("Please specify your level:");
                role2 = sc.nextLine();
                level();
                break;
            default:
                System.out.println("❌ Invalid choice");
                Student(role1);
        }

    }

    void level() {
        System.out.println();
        System.out.println();
        System.out.println("Select your subject area");
        System.out.println("1. Computer Engineering");
        System.out.println("2. Mechanical");
        System.out.println("3. Chemical");
        System.out.println("4. Electronics & Communication");
        System.out.println("Enter number:");

        int y = sc.nextInt();
        skillforstudent a = new skillforstudent();
        if (y == 1) {
            role3 = "Computer Engineering";
            a.Computer_Engineering();
        } else if (y == 2) {
            role3 = "Mechanical";
            a.Mechanical();
        } else if (y == 3) {
            role3 = "Chemical";
            a.Chemical();
        } else if (y == 4) {
            role3 = "Electronics & Communication";
            a.Electronics_Communication();
        } else {
            System.out.println("❌ Invalid choice. Please select a valid number.");
            level();
        }

    }
}
