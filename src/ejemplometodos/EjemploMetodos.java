package ejemplometodos;

import java.util.Scanner;


public class EjemploMetodos {

    
    public static void main(String[] args) {
        
        //Creamos el rectangulo 1
        Rectangulo unRectangulo = new Rectangulo();
        unRectangulo.mostrar();
        
        //Creamos la clase scanner para recibir por teclado
        Scanner leer = new Scanner(System.in);
        unRectangulo.mostrar();
        
        //Aqui escribimos la base en un float
        System.out.println("Escribe la base");
        float base = leer.nextFloat();
        
        //Aqui escribimos la altura en un float
        System.out.println("Escribe la altura");
        float altura = leer.nextFloat();
        
        //Creamos el rectangulo 2
        Rectangulo unRectangulo2 = new Rectangulo(base,altura);
        unRectangulo2.mostrar();
        
        //Calcular el area del rectangulo 2
        unRectangulo2.calcularArea(base, altura);
        
        //Calcular el perimetro del rectangulo 2
        float perimetro = unRectangulo2.calcularPerimetro(base, altura);
        System.out.println("Perimetro= "+perimetro);
        
        //O tambien se puede hacer
        System.out.println("Perimetro= "+ unRectangulo2.calcularPerimetro(base, altura));
        
        //Cambiar valor de la base del rectangulo 2
        unRectangulo2.setBase(10f);
        //Aqui llamo al metodo getbase y lo muestro para asegurarme de que cambia el valor de la base
        float basecambiada = unRectangulo2.getbase();
        System.out.println("Base cambiada= "+basecambiada);
        
        //Mostrar el valor de la altura del rectangulo 2
        float respuesta = unRectangulo2.getAltura();
        System.out.println("Altura= "+respuesta);
        
        
        //Creamos el objeto para mostrar el string, lo llamamos y lo visualizamos
        Rectangulo tuString = new Rectangulo();
        String todo= tuString.visualizar();
        System.out.println("Todo=>  "+todo);
        
    }
    
}
