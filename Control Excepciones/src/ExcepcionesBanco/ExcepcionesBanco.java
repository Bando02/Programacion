
package ExcepcionesBanco;

import java.util.Scanner;
public class ExcepcionesBanco {

    
    public static void main(String[] args) {
        
        
       
        Scanner sc = new Scanner(System.in);

        Cuenta c;
        String[] valores = {"pp", "-2500", "100"};
        try {
            c = new Cuenta("Antonio", 25, -1000.0);
            System.out.println(c);
            procesarMovimientos(c, valores);
            System.out.println(c);

        } catch (SaldoInsuficienteException e1) {
            System.out.println(e1.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void procesarMovimientos(Cuenta c, String[] movs) throws SaldoInsuficienteException {
        for (int i = 0; i < movs.length; i++) {
            c.movimiento(Double.parseDouble(movs[i]));
        }
    }
}


            
        
    
    

