package src;

public class Circulo extends Poligono 
{

    public Circulo(int parametroA) 
    {
        super(parametroA, 0);
    }

    @Override
    public String getDescription() 
    {
        return "Soy un CIRCULO";
    }

    @Override
    public double getSuperficie() 
    {
        //Aquí iría el algoritmo para calcular la superficie de un triángulo equilatero
        double area = 2*3.1415*Math.pow(getParametroA(),2);
        return area;
    }

    @Override
    public void dibujate() 
    {
        //Aquí iría el algoritmo para dibujar un triángulo equilatero.
        System.out.println("Dibujando un triángulo EQUILATERO");
    }
}