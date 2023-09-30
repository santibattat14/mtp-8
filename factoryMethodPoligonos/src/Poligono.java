package src;

public abstract class Poligono 
{
    private int parametroA;
    private int parametroB;
    
    //Constructor
    public Poligono(int parametroA, int parametroB) 
    {
        this.parametroA = parametroA;
        this.parametroB = parametroB;
    }
    
    public int getParametroA() { return parametroA; }
    public int getParametroB() { return parametroB; }
    
    public void setParametroA(int ladoA) { this.parametroA = parametroA; }
    public void setParametroB(int ladoB) { this.parametroB = parametroB; }
    
    //Métodos a redefinir por las subclases
    public abstract String getDescription();
    
    public abstract double getSuperficie();
    
    public abstract void dibujate();   
}
