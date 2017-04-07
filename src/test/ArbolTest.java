package test;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by alfred on 4/1/17.
 */
public class ArbolTest {
    @Test
    public void Test(){
        clases.Arbol<Integer> arbol = new clases.Arbol<Integer>();
        arbol.agregar(100);
        Assert.assertNotNull(arbol.raiz);
        Assert.assertNull(arbol.raiz.hijoDer);
        Assert.assertNull(arbol.raiz.hijoIzq);

        arbol.agregar(50);
        Assert.assertNotNull(arbol.raiz.hijoIzq);
        Assert.assertNull(arbol.raiz.hijoDer);

        arbol.agregar(60);
        arbol.agregar(160);
        arbol.agregar(10);
        arbol.agregar(1000);
        arbol.agregar(120);
        arbol.agregar(1);
        arbol.agregar(2);
        arbol.agregar(3);
        Assert.assertEquals(new Integer(100), arbol.raiz.valor);
    }
}