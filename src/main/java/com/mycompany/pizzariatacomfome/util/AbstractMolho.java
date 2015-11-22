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
public abstract class AbstractMolho extends AbstractIngrediente{

    public AbstractMolho(IPizza pizza) {
        super(pizza);
    }
    
    @Override
    public abstract void criarMolho();
    
    
}
