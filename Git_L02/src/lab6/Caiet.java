package lab6;

public class Caiet extends Rechizita {
    Caiet(String eticheta)
    {
        super(eticheta);
    }
    @Override
    String getNume(){
        return "Caiet: "+eticheta;
    }
}
