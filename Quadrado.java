public class Quadrado extends ObjetoGeometrico{
  
    private double lado;
    private double perimetro;
    
    Quadrado(double l){
      lado = l;
    }
    
    public double getArea(){
      area = lado * lado;
      return area;
    }
    
    public double getPerimetro(){
      perimetro = 4 * lado;
      return perimetro;
    }
    
}
  