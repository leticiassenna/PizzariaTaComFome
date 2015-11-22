/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.pizzariatacomfome.cdp.IPizza;
import com.mycompany.pizzariatacomfome.cdp.MassaCone;
import com.mycompany.pizzariatacomfome.cdp.MassaTradicional;
import com.mycompany.pizzariatacomfome.cdp.Molho;
import com.mycompany.pizzariatacomfome.cdp.Presunto;
import com.mycompany.pizzariatacomfome.util.AbstractIngrediente;
import com.mycompany.pizzariatacomfome.util.PizzaConeMussarela;
import junit.framework.Assert;
import org.junit.Test;

/**
 *
 * @author Leticia
 */

//Teste para ingredientes do decorator
public class TesteDecorator {
    
    public TesteDecorator() {
    }
    
        
    @Test
    public void testDecoratorPConeM() 
    {
        IPizza pizza;
        PizzaConeMussarela pizzaMussarela = new PizzaConeMussarela();
        AbstractIngrediente pizzaIngredientes;
        pizza = pizzaMussarela.criarPizza("ConeMussarela");
        pizzaIngredientes = new MassaCone(pizza);        
        pizzaIngredientes = new Molho(pizzaIngredientes, "MolhoTomate");
        pizzaIngredientes = new Presunto(pizzaIngredientes);
        Assert.assertEquals(pizzaIngredientes.getPreco(), 16, 0.0001);   
    }
    
    @Test
    public void testDecoratorPConeQQ() 
    {
        IPizza pizza;
        PizzaConeMussarela pizzaMussarela = new PizzaConeMussarela();
        AbstractIngrediente pizzaIngredientes;
        pizza = pizzaMussarela.criarPizza("ConeQuatroQueijos");
        pizzaIngredientes = new MassaCone(pizza);        
        pizzaIngredientes = new Molho(pizzaIngredientes, "MolhoTomate");
        Assert.assertEquals(pizzaIngredientes.getPreco(), 13, 0.0001);   
    }
    
    @Test
    public void testDecoratorPizzaM() 
    {
        IPizza pizza;
        PizzaConeMussarela pizzaMussarela = new PizzaConeMussarela();
        AbstractIngrediente pizzaIngredientes;
        pizza = pizzaMussarela.criarPizza("Mussarela");
        pizzaIngredientes = new MassaTradicional(pizza);        
        pizzaIngredientes = new Molho(pizzaIngredientes, "MolhoTomate");
        pizzaIngredientes = new Presunto(pizzaIngredientes);
        Assert.assertEquals(pizzaIngredientes.getPreco(), 11, 0.0001);   
    }
    
    @Test
    public void testDecoratorPizzaQQ() 
    {
        IPizza pizza;
        PizzaConeMussarela pizzaMussarela = new PizzaConeMussarela();
        AbstractIngrediente pizzaIngredientes;
        pizza = pizzaMussarela.criarPizza("QuatroQueijos");
        pizzaIngredientes = new MassaTradicional(pizza);        
        pizzaIngredientes = new Molho(pizzaIngredientes, "MolhoTomate");
        Assert.assertEquals(pizzaIngredientes.getPreco(), 8, 0.0001);   
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
