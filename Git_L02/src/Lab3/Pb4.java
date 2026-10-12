package Lab3;

public class Pb4 {
    public static void main(String[] args) {
        String s="Azi invatam instructiuni de control in Java";
        int cuv=0,litere=0;
        for(String str:s.split(" "))
        {
            cuv++;
            for(String str1:str.split(""))
                litere++;
        }
    }
}
