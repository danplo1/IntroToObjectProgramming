package com.dan;

/**
 * Created by Daniel_D'AGE on 23.01.2019.
 */
public class Starter {
    public static void main(String[] args) {

        Person person1 = new Person("Maciek", "Iksinski", 30);// wartości z konstruktora
        Person person2 = new Person("Anna", "Kowalska", 27);

        /*person1.name = "Maciek";
        person1.surname = "Iksinski";
        person1.age = 30;

        Person person2 = new Person("Anna", "Kowalska", 27);

        person2.name = "Anna";
        person2.surname = "Kowalska";
        person2.age = 27;
*/

        System.out.println(person1.getName());
        System.out.println(person2.getName() + " lat: " + person2.getAge());

        person1.eat(); //kontenery
        person2.eat();

        System.out.println(person1.getNameWithSurname());
        System.out.println(person2.getNameWithSurname());
    }
}
