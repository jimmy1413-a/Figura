
public class Circulo extends Figura
{
    public double radio;
    public static double pi;
    
    public Circulo(double radio,double pi)
    {
       this.radio = radio;
       this.pi = pi;
    }

    public double getRadio(){
        return radio;
    }
    
    public double getPi(){
        return pi;
    }
    
    public void setRadio(double radio){
        this.radio = radio;
    }
    
    public void setPi(double pi){
        this.pi = pi;
    }
    
    
      @Override
    public double calcularArea()
    {
       double area = pi *  Math. pow(radio, 2);
       return area;
    }

     @Override
    public double calcularVolumen(){
        double volumen = 4/3 * pi * Math. pow(radio, 3);
        return volumen;
    }
}
