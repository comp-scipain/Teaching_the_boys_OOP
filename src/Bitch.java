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
}
