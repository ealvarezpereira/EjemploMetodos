package ejemplometodos;


public class Rectangulo {
    
    private float base;
    private float altura;
    
    //Constructor por defecto
    
    public Rectangulo (){}
    
    
    //Constructor con parametros
    
    
    //Constructor con parametros normal
    //public Rectangulo (float ba, float alt){
    //   base = ba;
    //   altura = alt; 
    //}
    
    //Constructor con parametros que tienen el mismo nombre
    public Rectangulo (float base,float altura){
    
        this.base = base;
        this.altura = altura;   
    }
    
    
    //Metodos de acceso
    
    public void setBase(float b){
    
        base = b;
    }
    
    
    public float getbase (){
    
        return base;
    
    }
    
    
      public void setAltura(float a){
    
        altura = a;
    }
    
    
    public float getAltura (){
    
        return altura;    
    }
    
    public void mostrar (){
    
        System.out.println("base= "+base+"   altura= "+altura);   
    }

    public void calcularArea (float base,float altura){
    
    float area = base*altura;
    
        System.out.println("Area= " + area);
    }
    
    public float calcularPerimetro (float ba, float alt){
    
        ba = base;
        alt = altura;
        
        float perimetro =2*base + 2*altura;
        
        return perimetro;
    }

    public String visualizar(){

        //Como hay que devolver un String se hace una concatenacion, porque no se puede pasar de float a String
        return ("Base= "+base + " Altura= "+altura);
    }
      
}
