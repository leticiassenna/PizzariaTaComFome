/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pizzariatacomfome.application;

//import com.mycompany.pizzariatacomfome.util.FacadePrepararPizza;
import com.mycompany.pizzariatacomfome.util.PizzaFlyweightFactory;

/**
 *
 * @author 20111BSI0161
 */
public class Application {
    public static void main(String [] xxx) 
    {
        //USANDO FLYWEIGHT
        PizzaFlyweightFactory pizza = new PizzaFlyweightFactory();
        pizza.getIPizza("ConeMussarela");
        pizza.getIPizza("ConeQuatroQueijos");
        pizza.getIPizza("Mussarela");
        pizza.getIPizza("QuatroQueijos");
        
        //FacadePrepararPizza pizzaPreparada = new FacadePrepararPizza();
        //pizzaPreparada.prepararPizza("ConeMussarela");
        //pizzaPreparada.prepararPizza("ConeQuatroQueijos");
        //pizzaPreparada.prepararPizza("Mussarela");
        //pizzaPreparada.prepararPizza("QuatroQueijos");
                 
    }
}
