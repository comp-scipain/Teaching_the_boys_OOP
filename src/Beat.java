import java.util.Scanner;

public class Beat extends Bitch {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String option1 = "yes";
        String option2 = "no";

        Bitch bitch1 = new Bitch();
        Bitch bitch2 = new Bitch();
        Bitch bitch3 = new Bitch();

        System.out.println("Hello nigga.");
        System.out.println("Create your own bitches");
        System.out.println("Just set their properties. Name, age, etc");

        System.out.println("What is their name?");
        String name = keyboard.next();
        bitch1.setName(name);
        System.out.println("How old are they?");
        int age = keyboard.nextInt();
        bitch1.setAge(age);
        System.out.println("Do you like traps? Answer yes or no");
        String answer = keyboard.next();

        boolean answered = false;
        while (!answered) {
            if (answer.equalsIgnoreCase(option1)) {
                boolean AreFemale = false;
                bitch1.setGender(AreFemale);
                answered = true;
            } else if (answer.equalsIgnoreCase(option2)) {
                boolean AreFemale2 = true;
                bitch1.setGender(AreFemale2);
                answered = true;
            } else {
                System.out.println("That is not an option. It is a yes or no question");
                answer = keyboard.next();
            }
        }

        System.out.println(" ");
        System.out.println("Create another bitch.");
        System.out.println(" ");
        System.out.println("What is their name?");
        name = keyboard.next();
        bitch2.setName(name);
        System.out.println("How old are they?");
        age = keyboard.nextInt();
        bitch2.setAge(age);
        System.out.println("Do you like traps? Answer yes or no");
        answer = keyboard.next();

        System.out.println(" ");
        answered = false;
        while (!answered) {
            if (answer.equalsIgnoreCase(option1)) {
                boolean AreFemale = false;
                bitch2.setGender(AreFemale);
                answered = true;
            } else if (answer.equalsIgnoreCase(option2)) {
                boolean AreFemale2 = true;
                bitch2.setGender(AreFemale2);
                answered = true;
            } else {
                System.out.println("That is not an option. It is a yes or no question");
                answer = keyboard.next();
            }
        }

        System.out.println("The bitches you created:");
        System.out.println("This is the first bitch you created.");
        System.out.println("Their name is " + bitch1.getName() + ".");
        System.out.println("They are " + bitch1.getAge() + " years old.");
        if (bitch1.getGender()) {
            System.out.println("You are straight my niggalo");
        } else if (!bitch1.getGender()) {
            System.out.println("You are gay. lmao");
        } else {
            System.out.println("I don't know how you are seeing this");
        }

        System.out.println(" ");
        System.out.println("This is the second bitch you created");
        System.out.println("Their name is " + bitch2.getName() + ".");
        System.out.println("They are " + bitch2.getAge() + " years old.");
        if (bitch2.getGender()) {
            System.out.println("You are straight my niggalo");
        } else if (!bitch2.getGender()) {
            System.out.println("You are gay. lmao");
        } else {
            System.out.println("I don't know how you are seeing this");
        }


    }

}
