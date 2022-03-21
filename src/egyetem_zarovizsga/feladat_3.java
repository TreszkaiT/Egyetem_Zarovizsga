package egyetem_zarovizsga;

import java.util.Random;

import com.sun.org.apache.xpath.internal.SourceTree;

class feladat_3 {
    /* 3. Írjon olyan függvényt vagy metódust, amely egy karakterláncban vagy sztringben
        véletlenszerűen összekeveri a karaktereket (véletlenszám–generátor használható)! */
    public static void main(String[] args) {
        kever(args[0]);
    }

    public static void kever(String szoveg){
        Random r =new Random();
        char c[]=new char[szoveg.length()];
        int a;
        for(int i=0;i<szoveg.length();i++){
            c[i]=szoveg.charAt(i);
        }
        for(int j=0;j<szoveg.length();j++){
            a=r.nextInt(szoveg.length());
            char kar=c[j];
            c[j]=c[a];
            c[a]=kar;
        }
        for(int k=0;k<szoveg.length();k++){
            System.out.print(c[k]);
        }
    } 
}