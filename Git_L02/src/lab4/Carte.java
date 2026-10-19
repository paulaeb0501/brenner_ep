package lab4;

public class Carte {
    private String[] titlu;
    private String[] autor;
    private boolean stare;

    public Carte(String[] titlu, String[] autor) {
        this.titlu = titlu;
        this.autor = autor;
    }

    public boolean imprumuta()
    {
        if(stare) return false;
        stare=true;
        return true;
    }

    public void returneaza()
    {
        stare=false;
    }

}
