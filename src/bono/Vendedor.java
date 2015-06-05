package bono;

/**
 * Created by ceiis4 on 22/05/2015.
 */
public class Vendedor {
    private String nombre;
    private Float bono;

    public Vendedor(String nombre){
        this.nombre=nombre;
        bono=0f;
    }
    public void Guardar(float din){
        bono=bono+din;
    }

    public void MostrarDatos(){
        System.out.println(nombre+ " tiene como bono "+bono+" soles");
    }
}
