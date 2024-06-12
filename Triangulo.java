

public class Triangulo extends Figura
{
    double base,h,aBase;

    
    public Triangulo(double base,double h,double aBase)
    {
        this.base = base;
        this.h = h;
        this.aBase = aBase;
    }

    public double getBase(){
        return base;
    }
    
    public double getH(){
        return h;
    }
    
    public double getAbase(){
        return aBase;
    }
    
    public void setBase(double base){
        this.base = base;
    }
    
    public void setH(double h){
        this.h = h;
    }
    
    public void setAbase(double aBase){
        this.aBase = aBase;
    }
    
    @Override
    public double calcularArea()
    {
       double area = (( base * h)/2);
       return area;
    }

     @Override
    public double calcularVolumen(){
        double volumen = ((aBase * h)/3);
        return volumen;
    }
    
}
