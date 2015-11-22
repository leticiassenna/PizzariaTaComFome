/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.pizzariatacomfome.util.PizzaFlyweightFactory;
import junit.framework.Assert;
import org.junit.Test;

/**
 *
 * @author Leticia
 */
public class TestFlyweight {
    
    public TestFlyweight() {
    }
    
    @Test
    public void testFlywheightCM() 
    {
        PizzaFlyweightFactory pizza = new PizzaFlyweightFactory();
        pizza.getIPizza("ConeMussarela");
        Assert.assertSame(pizza.getTipo(), "ConeMussarela");
    }

    @Test
    public void testFlywheightCQQ() 
    {
        PizzaFlyweightFactory pizza = new PizzaFlyweightFactory();
        pizza.getIPizza("ConeQuatroQueijos");
        Assert.assertSame(pizza.getTipo(), "ConeQuatroQueijos");
    }
    
    @Test
    public void testFlywheightM() 
    {
        PizzaFlyweightFactory pizza = new PizzaFlyweightFactory();
        pizza.getIPizza("Mussarela");
        Assert.assertSame(pizza.getTipo(), "Mussarela");
    }
    
    @Test
    public void testFlywheightQQ() 
    {
        PizzaFlyweightFactory pizza = new PizzaFlyweightFactory();
        pizza.getIPizza("QuatroQueijos");
        Assert.assertSame(pizza.getTipo(), "QuatroQueijos");
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
