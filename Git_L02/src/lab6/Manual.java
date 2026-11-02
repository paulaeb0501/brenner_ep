package lab6;

public class Manual extends Rechizita{

     Manual(String eticheta)
     {
         super(eticheta);
     }
     @Override
    String getNume(){
         return "Manual: "+eticheta;
     }
}
