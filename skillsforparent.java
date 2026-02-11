import java.util.Scanner;
class skillsforparent extends Parent {
    void taskSelection() {
        System.out.println();
        System.out.println();
        System.out.println("Select all the tasks you perform as a Parent:");
        System.out.println("Enter numbers (9 to Exit):");

        System.out.println("1. Nurture and guide children's development through support and encouragement");
        System.out.println("2. Educate children on essential life skills and values");
        System.out.println("3. Provide a safe and nurturing environment for physical and emotional well-being");
        System.out.println("4. Communicate effectively with children to understand their needs");
        System.out.println("5. Facilitate opportunities for children to explore interests and develop talents");
        System.out.println("6. Establish routines and boundaries for a stable home atmosphere");
        System.out.println("7. Model positive behaviors and problem-solving skills for children to emulate");
        System.out.println("9. Exit");

        while (true) {
            int t = sc.nextInt();
            sc.nextLine();

            if (t == 9)
                break;
            else if (t == 1)
                tasks += ", Nurture and guide children's development";
            else if (t == 2)
                tasks += ", Educate children on life skills and values";
            else if (t == 3)
                tasks += ", Provide a safe and nurturing environment";
            else if (t == 4)
                tasks += ", Communicate effectively with children";
            else if (t == 5)
                tasks += ", Facilitate opportunities for children to explore interests";
            else if (t == 6)
                tasks += ", Establish routines and boundaries";
            else if (t == 7)
                tasks += ", Model positive behaviors and problem-solving skills";
            else
                System.out.println("❌ invalid selection \n select again");
        }

        skillSelection();
    }

    void skillSelection() {
        System.out.println();
        System.out.println();

        System.out.println("Select your core skill set as a Parent:");
        System.out.println("Enter numbers (9 to Exit):");

        System.out.println("1. Problem Solving");
        System.out.println("2. Time Management");
        System.out.println("3. Communication");
        System.out.println("4. Patience");
        System.out.println("5. Adaptability");
        System.out.println("6. Empathy");
        System.out.println("7. Negotiation");
        System.out.println("8. Resilience");
        System.out.println("9. Exit");

        while (true) {
            int s = sc.nextInt();
            sc.nextLine();

            if (s == 9)
                break;
            else if (s == 1)
                skills += ", Problem Solving";
            else if (s == 2)
                skills += ", Time Management";
            else if (s == 3)
                skills += ", Communication";
            else if (s == 4)
                skills += ", Patience";
            else if (s == 5)
                skills += ", Adaptability";
            else if (s == 6)
                skills += ", Empathy";
            else if (s == 7)
                skills += ", Negotiation";
            else if (s == 8)
                skills += ", Resilience";
            else
                System.out.println("❌ invalid selection \n select again");
        }

        generatePrompt();
    }

    void generatePrompt() {

        String prompt = "give the 10 list in which field i should go and also do not describe in detail,I am a " + role1
                +
                " currently associated with the " + industry + " industry. " +
                "My responsibilities include " + tasks + ". " +
                "My core skills are " + skills + ". " +
                "Guide me on how to improve as a parent, recommend learning or activities to enhance my skills, " +
                "suggest strategies to support children's growth, and create a daily ideal routine with time stap for parenting responsibilities. "
                +
                " explanations concise, practical, and actionable.in very short about 100 words";

        ai assistant = new ai(prompt);
    }
}
