/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pizzariatacomfome.cdp;

import com.mycompany.pizzariatacomfome.util.AbstractIngrediente;

/**
 *
 * @author 20111BSI0161
 */
public class Presunto extends AbstractIngrediente{

    public Presunto(IPizza pizza) {
        super(pizza);
        this.preco = 3;
    }

    @Override
    public String toString() {
        return "Adicao de Presunto, Preco final = " + this.getPreco();
        
    }

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

}
