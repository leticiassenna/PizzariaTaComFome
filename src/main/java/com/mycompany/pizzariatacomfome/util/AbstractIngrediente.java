/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pizzariatacomfome.util;

import com.mycompany.pizzariatacomfome.cdp.IPizza;



/**
 *
 * @author 20111BSI0161
 */
public abstract class AbstractIngrediente extends PizzaAbstrata{
    protected IPizza decoratedPizza;
    
    public AbstractIngrediente (IPizza pizza){        
        decoratedPizza = pizza;      
    }

    public IPizza getDecoratedPizza() {
        return decoratedPizza;
    }

    public final void setDecoratedPizza(IPizza decoratedPizza) {
        this.decoratedPizza = decoratedPizza;
    }
    
    @Override
    public float getPreco(){
        return (float) (decoratedPizza.getPreco()+ preco);
    }
    
    @Override
    public abstract void criarMassa();

    @Override
    public abstract void criarMolho();

    @Override
    public abstract void criarIngrediente();

    
}
