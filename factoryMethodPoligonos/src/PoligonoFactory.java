package src;

public class PoligonoFactory implements PoligonoFactoryMethod 
{

    @Override
    public Poligono createPoligono(int parametroA, int parametroB) 
    {
        
        if (parametroB == 0)
        {
            return new Circulo(parametroA);
        }
        else if (parametroA == parametroB)  
        {
            return new Cuadrado(parametroA, parametroB);            
        }
        else 
        {
            return new Triangulo(parametroA, parametroB);
        }
    }
}