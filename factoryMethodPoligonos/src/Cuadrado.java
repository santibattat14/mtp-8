package src;

public class Cuadrado extends Poligono 
{

    public Cuadrado(int parametroA, int parametroB) 
    {
        super(parametroA, parametroB);
    }

    @Override
    public String getDescription() 
    {
        return "Soy un CUADRADO";
    }

    @Override
    public double getSuperficie() 
    {
        //Aquí iría el algoritmo para calcular la superficie de un triángulo escaleno
        double area = getParametroA()*getParametroB();
        return area;
    }

    @Override
    public void dibujate() 
    {
        //Aquí iría el algoritmo para dibujar un triángulo escaleno.
        System.out.println("Dibujando un triángulo ESCALENO");
    }
}