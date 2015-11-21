/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pizzariatacomfome.cdp;

import com.mycompany.pizzariatacomfome.util.AbstractIngrediente;
import com.mycompany.pizzariatacomfome.util.AbstractMassa;
import com.mycompany.pizzariatacomfome.util.AbstractMolho;
import com.mycompany.pizzariatacomfome.util.PizzaAbstrata;

/**
 *
 * @author 20111BSI0161
 */
public class Pizza extends PizzaAbstrata{
    AbstractMassa massaTipo;
    AbstractMolho molho;
    AbstractIngrediente ingredientes;
    

    @Override
    public void criarMassa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void criarMolho() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void criarIngrediente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pizza fazerPizza() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float getPreco() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
