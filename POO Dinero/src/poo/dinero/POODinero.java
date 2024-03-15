
package poo.dinero;

public class POODinero {

    public static void main(String[] args) {
        
        
        CuentaCorriente cc1 = new CuentaCorriente();
        
        // introducir saldo
        
        CuentaCorriente cc2 = new CuentaCorriente(550);
        
        // introducir Nombre Saldo Limite y dni 
        
        CuentaCorriente cc3 = new CuentaCorriente("Fernando" , 1770 , -50 , "12345678Y");
        
        
        cc1.SacarDinero(0);
        
        cc1.IngresarDinero(0);
        
        cc2.MostrarDatos();
        cc3.MostrarDatos();
        
    }
    
}
