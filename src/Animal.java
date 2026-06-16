package Mypackage;

public class Animal {
    String animal_name;
    String type;
    int legs;


    public Animal(String animal_name, String type, int legs){

        this.animal_name = animal_name;
        this.type = type;
        this.legs = legs;


    }

    public void print(){
        System.out.println(animal_name);
        System.out.println(type);
        System.out.println(legs);
    }

}

