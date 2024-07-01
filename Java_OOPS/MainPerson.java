/* 1. Write a Java program to create a class called "Person" with a name and age 
attribute. Create two instances of the "Person" class, set their attributes using 
the constructor, and print their name and age. */

package Java_OOPS;

class Person{
    private String name;
    private int age;
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}
public class MainPerson {
    public static void main(String[] args) {
        Person person1 = new Person("Sumit", 22);
        Person person2 = new Person("Rahul", 22);
        System.out.println(person1.getName()+" Is "+person1.getAge()+" years old");
        System.out.println(person2.getName()+" Is "+person2.getAge()+" years old");
    }
}
