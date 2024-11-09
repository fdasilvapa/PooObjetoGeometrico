public class Triangulo extends ObjetoGeometrico{
  
    protected double base;
    protected double altura;
    private double perimetro;
    
    Triangulo(double b, double a){
      base = b;
      altura = a;
    }
    
    public double getArea(){
      area = (base * altura) / 2;
      return area;
    }
    
    public double getPerimetro(){
      perimetro = base * 3;
      return perimetro;
    }
    
}
  