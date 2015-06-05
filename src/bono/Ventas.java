package bono;
import java.util.Scanner;

/**
 * Created by ceiis4 on 22/05/2015.
 */
public class Ventas {
    private Scanner reader;
    private Integer numero;
    private Float   venta;
    private Float bono;

    private Vendedor vendedor1;
    public Ventas() {
        vendedor1 = new Vendedor("Johan");
    }
    public void actualizar(){
        reader = new Scanner(System.in);
        System.out.println("Introduzca el numero de ventas: ");
        numero = reader.nextInt();
        if (numero<30){
            bono=20f;
        }
        if (numero>100){
            bono=100f;
        }else{
            if (numero>40){
                bono=50f;
            }
        }
        vendedor1.Guardar(bono);
        for (int i = 0; i < numero; i++) {
            bono = 0f;
            System.out.println("Introduzca la venta " + (i + 1));
            venta = reader.nextFloat();
            venta= venta*82/100;
            if (venta<500){
                bono=venta*3/100;
            }
            if (venta>1500){
                bono=venta*7/100;
            }else{
                if (venta>1000){
                    bono=venta*5/100;
                }
            }
            vendedor1.Guardar(bono);
        }
    }
    public void mostrar(){
        vendedor1.MostrarDatos();
    }

}
