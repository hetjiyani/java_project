import java.util.Scanner;
class skillsforproduct_manager extends Product_Manager {
    void taskSelection() {
        System.out.println();
        System.out.println();
        System.out.println("Select all the tasks you performed as a Product Manager");
        System.out.println("Enter numbers (9 to Exit):");

        System.out.println("1. Define product vision and strategy to guide development efforts");
        System.out.println("2. Conduct market research and competitive analysis");
        System.out.println("3. Prioritize product features and roadmap based on user needs and business goals");
        System.out.println("4. Collaborate with engineering and design teams to deliver high-quality products");
        System.out.println("5. Analyze product performance and user feedback to iterate and improve");
        System.out.println("6. Develop and execute go-to-market strategies for new product launches");
        System.out.println("7. Communicate product updates and roadmaps to stakeholders across the organization");
        System.out.println("9. Exit");

        while (true) {
            int t = sc.nextInt();
            sc.nextLine();

            if (t == 9)
                break;
            else if (t == 1)
                tasks += ", Define product vision and strategy";
            else if (t == 2)
                tasks += ", Conduct market research and competitive analysis";
            else if (t == 3)
                tasks += ", Prioritize product features and roadmap";
            else if (t == 4)
                tasks += ", Collaborate with engineering and design teams";
            else if (t == 5)
                tasks += ", Analyze product performance and user feedback";
            else if (t == 6)
                tasks += ", Develop and execute go-to-market strategies";
            else if (t == 7)
                tasks += ", Communicate product updates and roadmaps";
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

        System.out.println("1. Product Strategy");
        System.out.println("2. Roadmap Development");
        System.out.println("3. User Research");
        System.out.println("4. Cross-Functional Collaboration");
        System.out.println("5. Market Analysis");
        System.out.println("6. Agile Methodologies");
        System.out.println("7. Data Interpretation");
        System.out.println("8. Stakeholder Management");
        System.out.println("9. Exit");

        while (true) {
            int s = sc.nextInt();
            sc.nextLine();

            if (s == 9)
                break;
            else if (s == 1)
                skills += ", Product Strategy";
            else if (s == 2)
                skills += ", Roadmap Development";
            else if (s == 3)
                skills += ", User Research";
            else if (s == 4)
                skills += ", Cross-Functional Collaboration";
            else if (s == 5)
                skills += ", Market Analysis";
            else if (s == 6)
                skills += ", Agile Methodologies";
            else if (s == 7)
                skills += ", Data Interpretation";
            else if (s == 8)
                skills += ", Stakeholder Management";
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
                "Guide me on how to grow in my product management career, " +
                "recommend advanced skills, learning roadmap, career progression paths, " +
                "and a daily ideal routine with time allocation. " +
                "Keep explanations concise and practical.in short";

        ai assistant = new ai(prompt);
    }
}
