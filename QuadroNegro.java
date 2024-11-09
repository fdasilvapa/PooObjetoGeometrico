public class QuadroNegro {

    private Quadrado quadrado;
    private Retangulo retangulo;
    private Circunferencia circunferencia;
    private Triangulo triangulo;
    
    public void limpaQuadro(){
      
    }
    
    public void criaQuadrado(double l, String c){
      quadrado = new Quadrado(l);
      quadrado.setCor(c);
    }
    
    public void criaRetangulo(double c, double a, String cor){
      retangulo = new Retangulo(c, a);
      retangulo.setCor(cor);
    }
    
    public void criaCircunferencia(double r, String c){
      circunferencia = new Circunferencia(r);
      circunferencia.setCor(c);
    }
    
    public void criaTriangulo(double b, double a, String c){
      triangulo = new Triangulo(b, a);
      triangulo.setCor(c);
    }
    
    public void mostraAreaObjetos(){
      System.out.println("Quadrado. Area: " + quadrado.getArea());
      System.out.println("Retangulo. Area: " + retangulo.getArea());
      System.out.println("Triangulo. Area: " + (triangulo.base * triangulo.altura) / 2);
      System.out.println("Circunferencia. Area: " + circunferencia.getArea());
    }
    
    public void mostraPerimetroObjetos(){
      
      System.out.println("Quadrado. Perimetro: " + quadrado.getPerimetro());
      System.out.println("Retangulo. Perimetro: " + retangulo.getPerimetro());
      System.out.println("Triangulo. Perimetro: " + triangulo.getPerimetro());
      System.out.println("Circunferencia. Perimetro: " + circunferencia.getPerimetro());
    }
    
    public void mostraCorObjetos(){
      System.out.println("Quadrado. Cor: " + quadrado.getCor());
      System.out.println("Retangulo. Cor: " + retangulo.getCor());
      System.out.println("Triangulo. Cor: " + triangulo.getCor());
      System.out.println("Circunferencia. Cor: " + circunferencia.getCor());
    }
    
    public static void main(String args[]){
      QuadroNegro quadroNegro = new QuadroNegro();
      quadroNegro.criaQuadrado(10.6, "Vermelho");
      quadroNegro.criaRetangulo(50.5, 20.4, "Cinza");
      quadroNegro.criaTriangulo(6.7, 5.5, "Amarelo");
      quadroNegro.criaCircunferencia(10, "Verde");
      
      quadroNegro.mostraAreaObjetos();
      System.out.println("");
      quadroNegro.mostraPerimetroObjetos();
      System.out.println("");
      quadroNegro.mostraCorObjetos();
      
    }
    
}
  