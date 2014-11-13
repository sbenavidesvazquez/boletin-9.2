
package boletin92;


public class SumaProd {
    
    public SumaProd(){
        
    }
    
    public void resultado(){
        double suma=0, producto=1;
        
        for(double i=10;i<=90;i++){
            suma+=i;
            producto=producto*i;
            System.out.println("suma: "+suma+" producto: "+producto);
            
        }
    }
    
}
