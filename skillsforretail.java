import java.util.Scanner;
class skillsforretail extends Retail_Clerk {

    void taskSelection() {
        System.out.println();
        System.out.println();
        System.out.println("Select all the tasks you perform as a Retail Clerk:");
        System.out.println("Enter numbers (9 to Exit):");

        System.out.println("1. Assist customers by providing product information and recommendations");
        System.out.println("2. Process customer transactions accurately using a point-of-sale system");
        System.out.println(
                "3. Maintain an organized and visually appealing sales floor by stocking and merchandising products");
        System.out.println("4. Resolve customer inquiries and issues with a positive attitude");
        System.out.println("5. Manage inventory levels by receiving, counting, and organizing stock");
        System.out.println("6. Contribute to a welcoming store environment by ensuring cleanliness and orderliness");
        System.out.println("9. Exit");

        while (true) {
            int t = sc.nextInt();
            sc.nextLine();

            if (t == 9)
                break;
            else if (t == 1)
                tasks += ", Assist customers with product information and recommendations";
            else if (t == 2)
                tasks += ", Process customer transactions accurately";
            else if (t == 3)
                tasks += ", Maintain organized and appealing sales floor";
            else if (t == 4)
                tasks += ", Resolve customer inquiries and issues";
            else if (t == 5)
                tasks += ", Manage inventory levels";
            else if (t == 6)
                tasks += ", Contribute to a welcoming store environment";
            else
                System.out.println("❌ invalid selection \n select again");
        }

        skillSelection();
    }

    void skillSelection() {
        System.out.println();
        System.out.println();
        System.out.println("Select your core skill set as a Retail Clerk:");
        System.out.println("Enter numbers (9 to Exit):");

        System.out.println("1. Customer Service");
        System.out.println("2. Salesmanship");
        System.out.println("3. Inventory Management");
        System.out.println("4. Point of Sale Operations");
        System.out.println("5. Merchandising Display");
        System.out.println("6. Problem Solving");
        System.out.println("7. Team Collaboration");
        System.out.println("8. Time Management");
        System.out.println("9. Exit");

        while (true) {
            int s = sc.nextInt();
            sc.nextLine();

            if (s == 9)
                break;
            else if (s == 1)
                skills += ", Customer Service";
            else if (s == 2)
                skills += ", Salesmanship";
            else if (s == 3)
                skills += ", Inventory Management";
            else if (s == 4)
                skills += ", Point of Sale Operations";
            else if (s == 5)
                skills += ", Merchandising Display";
            else if (s == 6)
                skills += ", Problem Solving";
            else if (s == 7)
                skills += ", Team Collaboration";
            else if (s == 8)
                skills += ", Time Management";
            else
                System.out.println("❌ invalid selection \n select again");
        }

        generatePrompt();
    }

    void generatePrompt() {

        String prompt = "give the 10 list in which field i should go and also do not describe in detail,I am a " + role1
                +
                " currently working in the " + industry + " industry. " +
                "My responsibilities include " + tasks + ". " +
                "My core skills are " + skills + ". " +
                "Guide me on how to improve in my retail career, recommend learning or activities to enhance my skills, "
                +
                "suggest strategies to excel in customer service and sales, and create a daily ideal routine for my work. "
                +
                "Keep explanations concise, practical, and actionable.in short";

        ai assistant = new ai(prompt);
    }
}