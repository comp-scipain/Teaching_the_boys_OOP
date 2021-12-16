public class Bitch {

    private String name;
    private boolean IsFemale;
    private int age;

    public void SayHi () {
        System.out.println("Hi");
    }

    public void setName (String inputName) {
        name = inputName;
    }

    public String getName() {
        return name;
    }

    public void setGender(boolean likes) {
        IsFemale = likes;
    }

    public boolean getGender() {
        return IsFemale;
    }

    public void setAge(int inputAge) {
        age = inputAge;
    }

    public int getAge() {
        return age;
    }

    public void printInfo () {
        System.out.println("Their name is " + getName() + ".");
        System.out.println("They are " + getAge() + " years old.");
        if (getGender()) {
            System.out.println("You are straight my niggalo");
        } else if (!getGender()) {
            System.out.println("You are gay. lmao");
        } else {
            System.out.println("I don't know how you are seeing this");
        }
    }
}
