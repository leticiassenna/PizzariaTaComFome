/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pizzariatacomfome.cdp;

import com.mycompany.pizzariatacomfome.util.AbstractMolho;

/**
 *
 * @author 20111BSI0161
 */
public class Molho extends AbstractMolho{
    private String nome;

    public Molho(IPizza pizza, String nome) {
        super(pizza);
        this.preco = 3;
        this.nome = nome;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    
    @Override
    public String toString() {
        return "Adicao de Molho "+this.nome+", Preco final = " + this.getPreco();
        
    }

    @Override
    public void criarMolho() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void criarMassa() {
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
