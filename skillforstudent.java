import java.util.Scanner;
class skillforstudent extends student {
    Scanner sc = new Scanner(System.in);

    void generateAI() {
        String prompt = "give the 10 list in which field i should go and also do not describe in detail,i am " + role1
                + ". my level is " + role2 + " .my subject area is " + role3
                + " .i want to focus on skill like " + role4
                + " tell me the important subject that i should focus and create a daily ideal routine schedule with time and do not use the and discribe about subject very short ";
        ai ab = new ai(prompt);
    }

    void Computer_Engineering() {
        System.out.println();
        System.out.println();
        System.out.println("Computer Engineering Skills");
        System.out.println("1. Programming Proficiency");
        System.out.println("2. Data Structure");
        System.out.println("3. Problem Solving");
        System.out.println("4. Algorithmic Design");
        System.out.println("5. Software Development");
        System.out.println("6. Debugging Abilities");
        System.out.println("7 for Exit");

        while (true) {
            int s = sc.nextInt();

            if (s == 7)
                break;
            else if (s == 1)
                role4 += ", Programming Proficiency";
            else if (s == 2)
                role4 += ", Data Structure";
            else if (s == 3)
                role4 += ", Problem Solving";
            else if (s == 4)
                role4 += ", Algorithmic Design";
            else if (s == 5)
                role4 += ", Software Development";
            else if (s == 6)
                role4 += ", Debugging Abilities";
            else
                System.out.println("❌ invalid selection \n select again");
        }

        generateAI();
    }

    void Mechanical() {
        System.out.println();
        System.out.println();
        System.out.println("Mechanical Engineering Skills");
        System.out.println("1. Thermodynamics");
        System.out.println("2. Fluid Mechanics");
        System.out.println("3. Machine Design");
        System.out.println("4. Manufacturing");
        System.out.println("5. CAD/CAM");
        System.out.println("6. Material Science");
        System.out.println("7 for Exit");

        while (true) {
            int s = sc.nextInt();

            if (s == 7)
                break;
            else if (s == 1)
                role4 += ", Thermodynamics";
            else if (s == 2)
                role4 += ", Fluid Mechanics";
            else if (s == 3)
                role4 += ", Machine Design";
            else if (s == 4)
                role4 += ", Manufacturing";
            else if (s == 5)
                role4 += ", CAD/CAM";
            else if (s == 6)
                role4 += ", Material Science";
            else
                System.out.println("❌ invalid selection \n select again");
        }

        generateAI();
    }

    void Chemical() {
        System.out.println();
        System.out.println();
        System.out.println("Chemical Engineering Skills");
        System.out.println("1. Reaction Engineering");
        System.out.println("2. Mass Transfer");
        System.out.println("3. Heat Transfer");
        System.out.println("4. Process Control");
        System.out.println("5. Process Design");
        System.out.println("6. Industrial Safety");
        System.out.println("7 for Exit");

        while (true) {
            int s = sc.nextInt();

            if (s == 7)
                break;
            else if (s == 1)
                role4 += ", Reaction Engineering";
            else if (s == 2)
                role4 += ", Mass Transfer";
            else if (s == 3)
                role4 += ", Heat Transfer";
            else if (s == 4)
                role4 += ", Process Control";
            else if (s == 5)
                role4 += ", Process Design";
            else if (s == 6)
                role4 += ", Industrial Safety";
            else
                System.out.println("❌ invalid selection \n select again");
        }

        generateAI();
    }

    void Electronics_Communication() {
        System.out.println();
        System.out.println();
        System.out.println("ECE Skills");
        System.out.println("1. Digital Electronics");
        System.out.println("2. Analog Circuits");
        System.out.println("3. Communication Systems");
        System.out.println("4. Embedded Systems");
        System.out.println("5. VLSI");
        System.out.println("6. Signal Processing");
        System.out.println("7 for Exit");

        while (true) {
            int s = sc.nextInt();

            if (s == 7)
                break;
            else if (s == 1)
                role4 += ", Digital Electronics";
            else if (s == 2)
                role4 += ", Analog Circuits";
            else if (s == 3)
                role4 += ", Communication Systems";
            else if (s == 4)
                role4 += ", Embedded Systems";
            else if (s == 5)
                role4 += ", VLSI";
            else if (s == 6)
                role4 += ", Signal Processing";
            else
                System.out.println("❌ invalid selection \n select again");
        }

        generateAI();
    }

}
