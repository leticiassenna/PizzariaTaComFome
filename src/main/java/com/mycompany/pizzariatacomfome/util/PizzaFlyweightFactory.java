/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pizzariatacomfome.util;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Leticia
 */
public class PizzaFlyweightFactory {
    private String tipo;
    private final Map<String, FabricaPizzaAbstrata> mussarela;
    private final Map<String, FabricaPizzaAbstrata> quatroQueijos;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public PizzaFlyweightFactory() {
        mussarela = new HashMap<>();
        quatroQueijos = new HashMap<>();        
    }
    
    public FabricaPizzaAbstrata getMussarela(String tipoPizza){
        FabricaPizzaAbstrata pizzaMussarela = mussarela.get(tipoPizza) ;
        if (pizzaMussarela==null){
            if(tipoPizza.equals("ConeMussarela")) {
                pizzaMussarela =  new PizzaConeMussarela();
                System.out.println("\nPizza Cone de Mussarela");
            } else {
                pizzaMussarela =  new PizzaMussarela();
                System.out.println("\nPizza de Mussarela");
            }
            pizzaMussarela.criarIngrediente();
            this.tipo = tipoPizza;
            mussarela.put(tipoPizza, pizzaMussarela);
        }
        return pizzaMussarela;
    }
    
    public FabricaPizzaAbstrata getQuatroQueijos(String tipoPizza){
        FabricaPizzaAbstrata pizzaQuatroQueijos = mussarela.get(tipoPizza);
        if (pizzaQuatroQueijos==null){
            if(tipoPizza.equals("ConeQuatroQueijos")) {
                pizzaQuatroQueijos = new PizzaConeQuatroQueijos();
                System.out.println("\nPizza Cone de Quatro Queijos");
            } else {
                pizzaQuatroQueijos =  new PizzaQuatroQueijos();
                System.out.println("\nPizza de Quatro Queijos");
            }
            pizzaQuatroQueijos.criarIngrediente();
            this.tipo = tipoPizza;
            mussarela.put(tipoPizza, pizzaQuatroQueijos);
        }
        return pizzaQuatroQueijos;
    }
    
    public FabricaPizzaAbstrata getIPizza(String tipo) {
        FabricaPizzaAbstrata pizza = null;
        switch (tipo) {
            case "Mussarela":
                pizza = getMussarela("Mussarela");
                break;
            case "ConeMussarela":
                pizza = getMussarela("ConeMussarela");
                break;
            case "ConeQuatroQueijos":
                pizza = getQuatroQueijos("ConeQuatroQueijos");
                break;
            case "QuatroQueijos":
                pizza = getQuatroQueijos("QuatroQueijos");
                break;
        }
        
        return pizza;
    }
}
