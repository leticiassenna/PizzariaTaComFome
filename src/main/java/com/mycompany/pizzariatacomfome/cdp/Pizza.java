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
    private AbstractMassa massaTipo;
    private AbstractMolho molho;
    private AbstractIngrediente ingredientes;
    private String nome;
    private float preco;
    
   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public AbstractMassa getMassaTipo() {
        return massaTipo;
    }

    public void setMassaTipo(AbstractMassa massaTipo) {
        this.massaTipo = massaTipo;
    }

    public AbstractMolho getMolho() {
        return molho;
    }

    public void setMolho(AbstractMolho molho) {
        this.molho = molho;
    }

    public AbstractIngrediente getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(AbstractIngrediente ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public void criarMassa() {}

    @Override
    public void criarMolho() {}

    @Override
    public void criarIngrediente() {}

    @Override
    public Pizza fazerPizza() {
        return null;
    }

    @Override
    public float getPreco() {
        return preco;  
    }
    public void setPreco(float preco){
        this.preco = preco;
    }
    
}
