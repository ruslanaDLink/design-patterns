package patterns.behavioral.observer;

//concrete observer
public class CharityVisitor implements Visitor {
    private String name;
    private int age;

    public CharityVisitor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void getUpdated(String update) {
        System.out.println("Visitor " + name + " received an update.");
        System.out.println("{ " + update + " }");
    }

    @Override
    public String getFullInfo() {
        return "CharityVisitor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
