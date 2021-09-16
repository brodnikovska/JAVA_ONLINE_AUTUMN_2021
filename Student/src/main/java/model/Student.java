package model;

public class Student {
    private String name;
    private int age;
    private String group;

    public Student(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGroup() {
        return group;
    }

    public boolean equals(Object obj) {
        // base realisation. true if both refers to the same object
        if (this == obj) {
            return true;
        }
        // non-null reference while being comparing with null always must return false
        if (obj == null) {
            return false;
        }
        // returns true if the two objects have the same content
        if (obj instanceof Student) {
            Student studentCast = (Student) obj;
            return this.name == studentCast.name & this.age == studentCast.getAge() & this.group == studentCast.group;
        } else return false;
    }

    public int hashCode() {
        return (int) age * name.hashCode() + group.hashCode();
    }
}
