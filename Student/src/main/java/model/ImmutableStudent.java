package model;

public final class ImmutableStudent {
    private String name;
    private Age age;
    private Groups group;

    public ImmutableStudent(String name, Age age, Groups group) {
        this.name = name;
        Age cloneAge = new Age();
        cloneAge.setYear(age.getYear());
        this.age = cloneAge;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public Age getAge() {
        Age cloneAge = new Age();
        cloneAge.setYear(this.age.getYear());
        return cloneAge;
    }

    public Groups getGroup() {
        return group;
    }

    public ImmutableStudent setName(String name) {
        return new ImmutableStudent(name, this.age, this.group);
    }

    public ImmutableStudent setAge(Age age) {
        return new ImmutableStudent(this.name, age, this.group);
    }

    public ImmutableStudent setGroup(Groups group) {
        return new ImmutableStudent(this.name, this.age, group);
    }
}
