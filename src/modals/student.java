package modals;

public class student {

    String name;
    int age;
    int specification;

    // parameterised construction

    public student(String name, int age, int specification) {
        this.name = name;
        this.age = age;
        this.specification = specification;
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

    public int getSpecification() {
        return specification;
    }

    public void setSpecification(int specification) {
        this.specification = specification;
    }
}
