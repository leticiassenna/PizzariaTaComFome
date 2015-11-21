/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pizzariatacomfome.util;

import com.mycompany.pizzariatacomfome.cdp.Pizza;

/**
 *
 * @author 20111BSI0161
 */
public abstract class FabricaPizzaAbstrata {
    Pizza pizza;
    
    public abstract Pizza criarPizza();
}
