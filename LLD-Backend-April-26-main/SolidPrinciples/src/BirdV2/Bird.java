package BirdV2;

public abstract class Bird {
    private String name;
    private int age;
    private int numberOfLegs;
    private String type;

    public void eat(){
        System.out.println("Bird : " + name + " is eating!");
    }

    public void sleep(){
        System.out.println("Bird : " + name + " is sleeping!");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}