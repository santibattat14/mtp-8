package src;

public class TestFactoryMethod 
{
    public static void main(String[] args) 
    {
        PoligonoFactoryMethod factoria = new PoligonoFactory();
        Poligono poligono = factoria.createPoligono(5, 0);
        Poligono poligono2 = factoria.createPoligono(10, 10);
        Poligono poligono3 = factoria.createPoligono(10, 15);

        System.out.println("********** POLIGONOS GENERADOS **********");
        System.out.println("Poligono 1: " + poligono.getDescription() + " " + poligono.getSuperficie());
        System.out.println("Poligono 2: " + poligono2.getDescription() + " " + poligono2.getSuperficie());
        System.out.println("Poligono 3: " + poligono3.getDescription() + " " + poligono3.getSuperficie());
    }
}