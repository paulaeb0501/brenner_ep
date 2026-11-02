package lab6;

public class Ghiozdan {
    private Rechizita[] rechizite= new Rechizita[10];
    private int nrRechizite=0;

    void add(Caiet caiet)
    {
        if(nrRechizite<rechizite.length){
            rechizite[nrRechizite]=caiet;
            nrRechizite++;
        }
    }

    void add(Manual manual)
    {
        if(nrRechizite<rechizite.length){
            rechizite[nrRechizite]=manual;
            nrRechizite++;
        }
    }

    int getNrRechizite() {
        return nrRechizite;
    }

    public void afisare() {
        for(int i=0;i<nrRechizite;i++)
            System.out.println(rechizite[i].getNume()+" ");
    }
}
