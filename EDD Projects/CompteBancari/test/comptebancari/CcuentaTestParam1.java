/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comptebancari;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CcuentaTestParam1 {

    private final double ini;
    private final double quant;
    private final double esp;

    public CcuentaTestParam1(double num1, double num2, double resul) {
        this.ini = num1;
        this.quant = num2;
        this.esp = resul;
    }

    @Parameters
    public static Collection<Object[]> numeros() {
        return Arrays.asList(new Object[][]{
            {2000, 100, 2100}, {300, 0, 300}, {500, 900, 1400}
        });
    }

    @Test
    public void testIngresar() throws Exception {
        CompteBancari lameua = new CompteBancari(11, ini);
        lameua.ingresar(quant);
        double saldo = lameua.cons_saldo();
        assertEquals(esp, saldo, 0);
    }
}
