package src;

public class Triangulo extends Poligono 
{

    public Triangulo(int parametroA, int parametroB) 
    {
        super(parametroA, parametroB);
    }

    @Override
    public String getDescription() 
    {
        return "Soy un TRIANGULO";
    }

    @Override
    public double getSuperficie() 
    {
        //Aquí iría el algoritmo para calcular la superficie de un triángulo escaleno
        double area = (getParametroA()*getParametroB())/2;
        return area;
    }

    @Override
    public void dibujate() 
    {
        //Aquí iría el algoritmo para dibujar un triángulo escaleno.
        System.out.println("Dibujando un triángulo ESCALENO");
    }
}