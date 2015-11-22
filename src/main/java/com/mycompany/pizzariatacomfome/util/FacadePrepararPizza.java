/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pizzariatacomfome.util;

import com.mycompany.pizzariatacomfome.cdp.IPizza;
import com.mycompany.pizzariatacomfome.cdp.Pizza;

/**
 *
 * @author 20111BSI0161
 */
public class FacadePrepararPizza {
    IPizza pizza;
    FabricaPizzaAbstrata fabricaPizza;
    String nomePizza;

    public String getNomePizza() {
        return nomePizza;
    }

    public void setNomePizza(String nomePizza) {
        this.nomePizza = nomePizza;
    }
    
    public IPizza prepararPizza(String nome){
        this.nomePizza = nome;
        
        fabricaPizza = new FabricaPizzaAbstrata() {
            
            @Override
            public Pizza criarPizza(String nome) {
                if ("ConeMussarela".equals(nome)){
                    System.out.println("\nPizza Cone de Mussarela");
                    fabricaPizza= new PizzaConeMussarela();
                }

                if ("ConeQuatroQueijos".equals(nome)){
                    System.out.println("\nPizza Cone de Quatro Queijos");
                    fabricaPizza = new PizzaConeQuatroQueijos();
                }
                if ("Mussarela".equals(nome)){
                    System.out.println("\nPizza de Mussarela");
                    fabricaPizza = new PizzaMussarela();
                }
                if ("QuatroQueijos".equals(nome)){
                    System.out.println("\nPizza de Quatro Queijos");
                    fabricaPizza = new PizzaQuatroQueijos();
                }

                

                return pizza;
            }

            @Override
            public AbstractIngrediente criarIngrediente() {
                return fabricaPizza.criarIngrediente(); 
            }
        };
        
        pizza = fabricaPizza.criarPizza(nome);
        fabricaPizza.criarIngrediente();
       return pizza;
        
    }
}
