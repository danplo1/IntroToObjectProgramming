package com.dan;

/**
 * Created by Daniel_D'AGE on 23.01.2019.
 */
public class Person {


    //cechy
    private String name;
    private String surname;
    private int age;

    //konstruktor z w/w trzema cechami
    public Person(String name, String surname, int age){

        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    //gettery i settery - specjalne metody, któa zwraca i ustawia wartość, to czym jest pole

    public String getName() {
        return name;
    }

    public void setName(String name) { //settery zmieniaja wartość
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    //metody

    public void eat(){
        System.out.println(name + " Mniam, mniam, mniam..."); //paramteryzacja funkcji name + ...
    }

    public String getNameWithSurname(){

        return name + "" + surname;

    }

}
