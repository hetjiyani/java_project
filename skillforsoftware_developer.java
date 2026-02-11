import java.util.Scanner;
class skillforsoftware_developer extends Software_Developer {
    void taskSelection() {
        System.out.println();
        System.out.println();
        System.out.println("Select all the tasks you performed as a Software Developer");
        System.out.println("Enter numbers (9 to Exit):");

        System.out.println("1. Design and develop scalable software solutions");
        System.out.println("2. Write clean, efficient, and maintainable code");
        System.out.println("3. Debug and troubleshoot complex software issues");
        System.out.println("4. Collaborate with cross-functional teams");
        System.out.println("5. Implement robust testing strategies");
        System.out.println("6. Optimize software performance and resource utilization");
        System.out.println("7. Code reviews and mentoring");
        System.out.println("8. Requirement analysis and documentation");
        System.out.println("9. Exit");

        while (true) {
            int t = sc.nextInt();

            if (t == 9)
                break;
            else if (t == 1)
                tasks += ", Design and develop scalable software solutions";
            else if (t == 2)
                tasks += ", Write clean, efficient, and maintainable code";
            else if (t == 3)
                tasks += ", Debug and troubleshoot complex software issues";
            else if (t == 4)
                tasks += ", Collaborate with cross-functional teams";
            else if (t == 5)
                tasks += ", Implement robust testing strategies";
            else if (t == 6)
                tasks += ", Optimize software performance and resource utilization";
            else if (t == 7)
                tasks += ", Code reviews and mentoring";
            else if (t == 8)
                tasks += ", Requirement analysis and documentation";
            else
                System.out.println("❌ invalid selection \n select again");
        }

        skillSelection();
    }

    void skillSelection() {
        System.out.println();
        System.out.println();
        System.out.println("Select your core skill set");
        System.out.println("Enter numbers (9 to Exit):");

        System.out.println("1. Problem Solving");
        System.out.println("2. Logical Reasoning");
        System.out.println("3. Attention To Detail");
        System.out.println("4. Critical Thinking");
        System.out.println("5. Adaptability");
        System.out.println("6. Algorithmic Thinking");
        System.out.println("7. System Design");
        System.out.println("8. Communication");
        System.out.println("9. Exit");

        while (true) {
            int s = sc.nextInt();

            if (s == 9)
                break;
            else if (s == 1)
                skills += ", Problem Solving";
            else if (s == 2)
                skills += ", Logical Reasoning";
            else if (s == 3)
                skills += ", Attention To Detail";
            else if (s == 4)
                skills += ", Critical Thinking";
            else if (s == 5)
                skills += ", Adaptability";
            else if (s == 6)
                skills += ", Algorithmic Thinking";
            else if (s == 7)
                skills += ", System Design";
            else if (s == 8)
                skills += ", Communication";
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
                "Guide me on how to grow in my software development career, " +
                "just tell me the list of important topics and ideal daily time table";

        ai assistant = new ai(prompt);
    }
}
