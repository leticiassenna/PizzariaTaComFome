/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pizzariatacomfome.cdp;

/**
 *
 * @author 20111BSI0161
 */
public interface IPizza {
    public void criarMassa();
    public void criarMolho();
    public void criarIngrediente();
    public Pizza fazerPizza();
    public float getPreco();
}
