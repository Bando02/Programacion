package array;
import java.util.Scanner;
import java.util.Arrays;
public class Array {

    private static boolean arrayA;
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);  
      

// .equals = comparar Arrays con el mismo tamaño //
// .length = si no sabes el tamaño del array //
// .toString = para que muestre todo el Array // 
// .fill = rellena un array con un char //



/*
    int[] array={5,3,2,1,7};
    char[] arrai={'a','b','c'};
        
    System.out.println(array[0]); 
// array [0] para que pinte la posicion 0, basicamente la posicion 1 //
     
    int[] array2 = new int[5];
    */




/*
    int[] array = new int[3];
    
    array[0] = 2;
    array[1] = 3;
    
    System.out.println(array[0]+";" +array[1] + ";" +array[2]);

    
    
    
    int[] tabla = new int[4];
    // rellenar con el teclado //
    
    for(int i=0;i<4;i++){
        System.out.println("Introduce el num");
        tabla[i] = sc.nextInt();
    }
    
    //mostar//
    for(int i=0;i<4;i++){
        System.out.print(tabla[i] +" ; ");
    }

*/




/*
    int[] Tabla7 = new int[7];
    int res;
    res = 0;
    for(int a=0;a<7;a++){
        System.out.println(" Rellena la tabla");
        Tabla7[a] = sc.nextInt();
       
    }
    
    
    System.out.println("El resultado de sumar todos los valores de la tabla es: " +sumaArray(Tabla7));
}



public static int sumaArray(int[] array){
    int suma = 0;
     for(int a=0;a<7;a++){
       suma = suma + array[a];
     }
  
return suma;
}

}
*/
/*
    System.out.println(" Elige el tamaño ");
    int x;
    x = sc.nextInt();
    int[] tabla= new int[x];
    
    for(int i=0;i<x;i++){
        
        System.out.println(" imprime los nums ");
        tabla[i] = sc.nextInt();
    }
    for(int i=x-1;i>-1;i--){
        System.out.print(tabla[i] +" , ");
    }
*/



 // ARRAY.LENGTH para saber el tamaño de la array //

 
 
 /*
    
   int [] combinación_secreta= new int [3];
     
     int num1 = (int) (Math.random()*10);
     int num2 = (int) (Math.random()*10);
     int num3 = (int) (Math.random()*10);
     
     combinación_secreta[0]= num1;
     combinación_secreta[1]= num2;
     combinación_secreta[2]= num3;

     
     int[] usuario= new int [3];
        System.out.println("Introduce los valores: ");
     usuario[0]= sc.nextInt();
     usuario[1]= sc.nextInt();
     usuario[2]= sc.nextInt();
     
       boolean respuesta= Arrays.equals (combinación_secreta, usuario);
       
        while (!respuesta) {
            System.out.println("Introduce los valores: ");
            usuario[0]= sc.nextInt();
            usuario[1]= sc.nextInt();
            usuario[2]= sc.nextInt();
        }
        System.out.println("Acertaste el numero secreto");
*/
 
 
 
    /*  //Llenar un array un letras//
    char a[] = new char[5];
    Arrays.fill(a,'a');
    System.out.println(Arrays.toString(a));
*/

    /*
    int x;
    int[]array1={1,2,3};
    
    System.out.println("Introduce el tamaño de la secuencia de numeros ");
    x = sc.nextInt(); 
    int[] array2 = new int[x];
    for(int i = 0;i<array2.length;i++){
        System.out.println("introduce el dato en posicion "+i);
        array2[i] = sc.nextInt();
    }
    System.out.println(Arrays.toString(array2));
    
    System.out.println(comparaArrays(array1,array2));
    */
    
     
    
    int []array = {3,2,4,7};
    
    int[]arrayB = new int[5];
    
    for(int i = 0; i<4 ; i++){
        arrayB[i] = array[i];
    }
    System.out.println("Introduce el ultimo numero");
    arrayB[4] = sc.nextInt();
    System.out.println(Arrays.toString(arrayB));
    
    Arrays.sort(arrayB);
    System.out.println(Arrays.toString(arrayB));
  
  
    
    
    
    
    
    
    
    
    
    
}
public static boolean comparaArrays(int[]a,int[]b){
    boolean aux = true;
    for(int i = 0; i < a.length;i++){
        if(a[i]!= b[i]){
            aux = false;
        }
    }
    return aux;
}

}