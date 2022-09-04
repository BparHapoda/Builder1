/*
Реализовать паттерн билдер - создание авто с харакетирстиками -
название, цвет, мощность двигателя, корбока передач и
 паттерна Template method - выбираем любую тематику”
 */

public class Main {
    public static void main(String[] args) {
        Car civic = new Car.CarBuilder().setBody(TypeBodies.Hatchback).setAccelerationTo100(7).
                setEngine(TypeEngine.PETROL).setName(NameOfCar.HONDA).
                setColor(Colors.BLACK).setMaxSpeed(200).setVolume(1800).build();


        System.out.println(civic) ;
    }
}
