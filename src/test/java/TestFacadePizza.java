/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.pizzariatacomfome.util.FacadePrepararPizza;
import junit.framework.Assert;
import org.junit.Test;

/**
 *
 * @author Leticia
 */
public class TestFacadePizza {
    
    public TestFacadePizza() {
    }
    
    @Test
    public void testFacadePConeM() 
    {
        FacadePrepararPizza pizzaPreparada = new FacadePrepararPizza();
        pizzaPreparada.prepararPizza("ConeMussarela");
        Assert.assertSame(pizzaPreparada.getNomePizza(), "ConeMussarela");
    }
    @Test
    public void testFacadePConeQQ() 
    {
        FacadePrepararPizza pizzaPreparada = new FacadePrepararPizza();
        pizzaPreparada.prepararPizza("ConeQuatroQueijos");
        Assert.assertSame(pizzaPreparada.getNomePizza(), "ConeQuatroQueijos");
    }
    
    @Test
    public void testFacadePizzaM() 
    {
        FacadePrepararPizza pizzaPreparada = new FacadePrepararPizza();
        pizzaPreparada.prepararPizza("Mussarela");
        Assert.assertSame(pizzaPreparada.getNomePizza(), "Mussarela");
    }
    
    @Test
    public void testFacadePizzaQQ() 
    {
        FacadePrepararPizza pizzaPreparada = new FacadePrepararPizza();
        pizzaPreparada.prepararPizza("QuatroQueijos");
        Assert.assertSame(pizzaPreparada.getNomePizza(), "QuatroQueijos");
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
