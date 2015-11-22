/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pizzariatacomfome.util;

import com.mycompany.pizzariatacomfome.cdp.Cebola;
import com.mycompany.pizzariatacomfome.cdp.IPizza;
import com.mycompany.pizzariatacomfome.cdp.MassaCone;
import com.mycompany.pizzariatacomfome.cdp.Molho;
import com.mycompany.pizzariatacomfome.cdp.Pizza;
import com.mycompany.pizzariatacomfome.cdp.Presunto;
import com.mycompany.pizzariatacomfome.cdp.Queijo;

/**
 *
 * @author 20111BSI0161
 */
public class PizzaConeQuatroQueijos extends FabricaPizzaAbstrata{

    @Override
    public Pizza criarPizza(String nome) {
        Pizza pizzaFeita = new Pizza();
        pizzaFeita.setNome(nome);
        return pizzaFeita;
    }

    @Override
    public AbstractIngrediente criarIngrediente() {
        
        Pizza pizzaP = this.criarPizza("ConeQuatroQueijos");
        IPizza pizzaFeita = pizzaP;
        AbstractIngrediente pizzaIngredientes;
        
        pizzaIngredientes = new MassaCone(pizzaFeita);
        System.out.println(""+pizzaIngredientes.toString());
        
        pizzaIngredientes = new Molho(pizzaIngredientes, "MolhoTomate");
        System.out.println(""+pizzaIngredientes.toString());
        
        pizzaIngredientes = new Presunto(pizzaIngredientes);
        System.out.println(""+pizzaIngredientes.toString());
        
        pizzaIngredientes = new Cebola(pizzaIngredientes);
        System.out.println(""+pizzaIngredientes.toString());
        
        pizzaIngredientes = new Queijo(pizzaIngredientes, "Mussarela");
        System.out.println(""+pizzaIngredientes.toString());
        
        pizzaIngredientes = new Queijo(pizzaIngredientes, "Gorgonzola");
        System.out.println(""+pizzaIngredientes.toString());
       
        pizzaIngredientes = new Queijo(pizzaIngredientes, "Parmesao");
        System.out.println(""+pizzaIngredientes.toString());
        
        pizzaIngredientes = new Queijo(pizzaIngredientes, "Provolone");
        System.out.println(""+pizzaIngredientes.toString());
        
        pizzaIngredientes = new Queijo(pizzaIngredientes, "Margherita");
        System.out.println(""+pizzaIngredientes.toString());
        
        return pizzaIngredientes;
    }
    
}
