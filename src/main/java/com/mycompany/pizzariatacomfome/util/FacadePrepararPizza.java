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
    
    public Pizza criarPizza(){
        
        fabricaPizza = new FabricaPizzaAbstrata() {
            
            @Override
            public Pizza criarPizza() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        return null;
        
    }
}
