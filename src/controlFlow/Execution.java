package controlFlow;

import OOP.*;

public class Execution {
    public static void main(String[] args){
       // Exemplu pentru encapsulation//
        Car car = new Car();
        car.setMake("Ford");
        car.setModel("Mustang");
        car.setYear(2015);

        System.out.println("Make: " + car.getMake());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
        // Exemplu pentru Polimorphism //
        Human human = new Human();
        Human boy = new Boy();
        Human girl = new Girl();
        human.nightActivity();
        boy.nightActivity();
        girl.nightActivity();
        // Exemplu pentru Abstraction //
        Basket myBasket = new Basket();
        myBasket.typeSport();
        myBasket.number();
        // Exemplu pentru Inheritance //
        Car1 myCar = new Car1("Mercedes", "e220", 1994);
        System.out.println("Marca: " + myCar.make);
        System.out.println("Model: " + myCar.model);
        System.out.println("An: " + myCar.year);
            }
        }

