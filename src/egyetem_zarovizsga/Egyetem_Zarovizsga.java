/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egyetem_zarovizsga;

import java.util.Random;

/**
 *
 * @author tresz
 */
public class Egyetem_Zarovizsga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        if(PrimE(7)) System.out.println("1. Prím szám: "+"Prím"); else System.out.println("1. Prím szám: "+"Nem Prím");
        if(TokeletesE(6)) System.out.println("2. Tökéletes szám: "+"Tökéletes"); else System.out.println("2. Tökéletes szám: "+"Nem Tökéletes");
        System.out.println("3. Karakterkeverés: "+KarakterKeveres("Alma"));
        System.out.println("Faktoriálsi rekurzív: "+FaktorialisRekurziv(5));
        System.err.println("4. Négyzetgyők: "+Negyzetgyok(25));        
        System.out.println("6. Fibonacci rekurzív: "+FibonacciRekurziv(10));
        System.err.println("7. Legnagyobb egész kitevő: "+LegnagyobbEgeszKitevo(25));
        System.err.println("8. Kilencesek száma: "+KilencesekSzama(25989));
        System.err.println("9. Kettes szám második bitje: "+KettesMasodikBit(4));
        //System.out.println(NegyzetgyokRekurziv(50,25));
    }
    
    // 1. Írjon olyan függvényt vagy metódust, amely egy természetes számról eldönti, hogy
    //    prímszám-e, vagy sem!
    private static boolean PrimE(int N){
        
        boolean result = false;
        
        int szamlalo = 0;
        for(int i=1; i<=N; i++){
            
            if(N%i == 0) szamlalo++;
        }
        if(szamlalo<=2) result = true;
        
        return result;       
    }
    
    /*
    2. Írjon olyan függvényt vagy metódust, amely egy természetes számról eldönti, hogy tökéletes
szám-e, vagy sem! (pozitív osztóinak összege a szám kétszerese)
    */

    private static boolean TokeletesE(int N) {
        boolean result = false;
        
        int pozitivOsztokOsszege = 0;
        for(int i=1; i<=N; i++){
            
            if(N%i == 0) pozitivOsztokOsszege += i;
        }
        if(pozitivOsztokOsszege == (N*2)) result = true;
        
        return result;
    }
    
    /*
    3. Írjon olyan függvényt vagy metódust, amely egy karakterláncban vagy sztringben
véletlenszerűen összekeveri a karaktereket (véletlenszám–generátor használható)!
    */

    private static String KarakterKeveres(String str) {
        
        String result="";
        Random rand = new Random();
        int len = str.length();
        char[] ch = new char[len];
        
        for(int i=0; i<len; i++){
            ch[i] = str.charAt(i);
        }
        
        for(int i=0; i<len; i++){
            int ran1 = rand.nextInt(len-1);
            int ran2 = -1;
            do{          
               ran2 = rand.nextInt(len-1);  
            }while(ran1==ran2);
            
            char segedCh = ch[ran1];
            ch[ran1] = ch[ran2];
            ch[ran2] = segedCh;
        }
        
        result = String.valueOf(ch);
        
        return result;
    }
    
    
    private static int FaktorialisRekurziv(int N){
        if(N<1) return 1;
        else return N*FaktorialisRekurziv(N-1);
    }    
    /*
    4. A következő közelítő formulát használva írjon függvényt vagy metódust, amely egy valós
szám négyzetgyökét adja vissza! Használja az xk+1=1/2*(xk+a/xk) sorozatot, amely a
négyzetgyökéhez konvergál, ha x1=1.
    */
    private static float Negyzetgyok(int N){
        
        int n=50;
	float[] x = new float[n+1];
	x[1]=1;
	for(int k=1; k<n; k++)
		x[k+1]=(x[k]+(N/x[k]))/2;
	return x[n];
    }
    
    /* private static float NegyzetgyokRekurziv(int N, int szam){
        
        if(N<2) return 1;
        else return ((1/2)*(NegyzetgyokRekurziv(N-1,szam)+(szam/NegyzetgyokRekurziv(N-1,szam))));  
    } */
    
    /*
    5. Írjon függvényt vagy metódust, amely egy valós szám köbgyökét adja vissza! Használja az
xk+1=1/3*(2*xk+a/xk2) sorozatot, amely a köbgyökéhez konvergál, ha x1=1.
    */
   
    /*
    6. Írjon függvényt vagy metódust, amely kiszámolja az n-edik Fibonacci számot! A Fibonacci
sorozatot az an=an-2+an-1 rekurzióval definiálja (n>2), ahol a1=a2=1.

    */
    private static int FibonacciRekurziv(int N){
        
        if(N<1) return 0;
        else if(N==1 || N==2) return 1;
        else if(N>2) return (FibonacciRekurziv(N-1) + FibonacciRekurziv(N-2));
        
        return 0;
    }

    /*
    7. Írjon olyan függvényt vagy metódust, amely egy természetes számhoz visszaadja azt a
legnagyobb egész kitevős hatványát, amely még éppen kisebb, mint 567!
    */
    
    private static Integer LegnagyobbEgeszKitevo(int N) {
        //if(N>567) return false;
        int res = 0;
        if(N<567) res=1;  
        int N1 = N;
        do{
            N1 *= N;
            if(N1<=567) res++;
        }while(N1>567);             // amíg hamis
        
        return res;
    }    

/*
8. Írjon olyan függvényt vagy metódust, amely egy természetes szám esetén kiírja, hogy a 9-es
számjegyből hány darabot tartalmaz (ne alakítsa át sztringgé/karaktertömbbé)!    
    */
    private static Integer KilencesekSzama(int N) {
        int res = 0;
        int maradek = 0;
        do{
            maradek = N % 10;
            N = N/10;
            if(maradek==9) res++;
        }while(N>0);        // amíg hamis
        
        return res;
    }

/*
9. Írjon olyan függvényt vagy metódust, amely egy természetes számról eldönti, hogy a kettes
számrendszerbeli felírásában a jobbról második bitje 1 vagy 0 (ne alakítsa át sztringgé/karaktertömbbé)!    
    */    
    
    private static Integer KettesMasodikBit(int N) {
        int res = 0;
        
        return res;
    }
    
/*
    
Feladatsor
1. Írjon olyan függvényt vagy metódust, amely egy természetes számról eldönti, hogy
prímszám-e, vagy sem!
2. Írjon olyan függvényt vagy metódust, amely egy természetes számról eldönti, hogy tökéletes
szám-e, vagy sem! (pozitív osztóinak összege a szám kétszerese)
3. Írjon olyan függvényt vagy metódust, amely egy karakterláncban vagy sztringben
véletlenszerűen összekeveri a karaktereket (véletlenszám–generátor használható)!
4. A következő közelítő formulát használva írjon függvényt vagy metódust, amely egy valós
szám négyzetgyökét adja vissza! Használja az xk+1=1/2*(xk+a/xk) sorozatot, amely a
négyzetgyökéhez konvergál, ha x1=1.
5. Írjon függvényt vagy metódust, amely egy valós szám köbgyökét adja vissza! Használja az
xk+1=1/3*(2*xk+a/xk
2
) sorozatot, amely a köbgyökéhez konvergál, ha x1=1.
6. Írjon függvényt vagy metódust, amely kiszámolja az n-edik Fibonacci számot! A Fibonacci
sorozatot az an=an-2+an-1 rekurzióval definiálja (n>2), ahol a1=a2=1.
7. Írjon olyan függvényt vagy metódust, amely egy természetes számhoz visszaadja azt a
legnagyobb egész kitevős hatványát, amely még éppen kisebb, mint 567!
8. Írjon olyan függvényt vagy metódust, amely egy természetes szám esetén kiírja, hogy a 9-es
számjegyből hány darabot tartalmaz (ne alakítsa át sztringgé/karaktertömbbé)!
9. Írjon olyan függvényt vagy metódust, amely egy természetes számról eldönti, hogy a kettes
számrendszerbeli felírásában a jobbról második bitje 1 vagy 0 (ne alakítsa át sztringgé/karaktertömbbé)!
10. Írjon olyan függvényt vagy metódust, amelynek paramétere egy 1 < x < 10 természetes
szám, és kiírja az 1,3,4,6,7,9,10,12,... sorozat első öt x-szel osztható elemét, azaz a sorozat
i+1-edik tagja 2-vel nagyobb az i-ediknél, ha i páratlan, s eggyel nagyobb az i-ediknél, ha i
páros!
11. Írjon olyan függvényt vagy metódust, amely a paraméterében megadott természetes szám
pozitív osztóinak számával tér vissza!
12. Írjon olyan függvényt vagy metódust, amely egy karakterláncból vagy sztringből a
számjegyek kivételével minden karaktert eltávolít!
13. Írjon olyan függvényt vagy metódust, amely egy karakterláncról vagy sztringről eldönti,
hogy palindróma-e! (Balról olvasva ugyanaz, mint jobbról olvasva.)
14. Írjon olyan függvényt vagy metódust, amely egy, az angol ábécé betűit tartalmazó
karakterláncban vagy sztringben minden szó kezdőbetűjét nagybetűre alakítja!
15. Írjon olyan függvényt vagy metódust, amely egy karakterláncból vagy sztringből eltávolítja
egy megadott karakter összes előfordulását!
16. Írjon olyan függvényt vagy metódust, amely megszámolja egy adott karakterlánc vagy
sztring összes előfordulását egy másik karakterláncban vagy sztringben!
17. Írjon olyan függvényt vagy metódust, amely kiírja az angol kisbetűs ábécé azon betűit,
melyek ASCII kódja négyzetszám!
18. Írjon olyan függvényt vagy metódust, amely előállít egy 5 karakterből (angol kisbetűs ábécé
karaktereit használva) álló véletlen karakterláncot vagy sztringet! Biztosítsa, hogy minden 5
hosszú különböző betűkből álló sztring egyenlő valószínűséggel kerüljön kiválasztásra,
feltéve, hogy a választott programozási nyelv véletlenszám-generátora egyenletes eloszlást
biztosít!
19.Írjon olyan függvényt vagy metódust, amely egy karakterláncba vagy sztringbe beszúr egy
„a” karaktert véletlenül választott pozícióba (véletlenszám–generátor használható)!
20.Adjon olyan függvényt vagy metódust, ami adott két pozitív egész paramétere esetén
megadja (n alatt a k)=n!/k!(n-k)! értékét. Használjon rekurziót!
21.Adjon olyan metódust vagy függvényt, ami eldönti, hogy a paramétereként megadott
(pozitív egészekből álló) nemüres tömbben van-e olyan szám, ami az összes többit osztja.
(Maradékszámító függvény használható).
22.Adjon olyan metódust vagy függvényt, ami eldönti, hogy a paramétereként megadott
(pozitív egészekből álló) nemüres tömbben van-e olyan szám, ami az összes többinél
többször fordul elő.
23.Adjon olyan metódust vagy függvényt, ami visszaadja, hogy a paramétereként megadott
(pozitív egészekből álló) nemüres tömbben melyik index az, ahol a leghosszabb
folyamatosan növekvő részsorozat kezdődik. Ha több ilyen index is van, az utolsót adja
vissza.
24.Adjon olyan metódust vagy függvényt, ami visszaadja, hogy a paramétereként megadott
(pozitív egészekből álló) nemüres tömbben melyik az a legkisebb index, amire az index
előtti elemek összege meghaladja a tömb első két elemének szorzatát. Ha nincs ilyen, 0-t
adjon vissza.
25.Adjon egy metódust vagy függvényt, ami paraméterként adott s sztring/karaktertömb, c
karakter és n pozitív egész szám esetén megadja, hogy a c karakter n-edik előfordulása
hányadik pozíción van az „s” sztringben.
26.Adjon metódust vagy függvényt, ami a paraméterként kapott, egészekből álló rendezett
tömbben a tömb hosszának logaritmusával arányos lépésszám alatt megkeresi a
paraméterként kapott egész első előfordulásának indexét, illetve ha nincs ilyen, akkor -1-et
ad vissza. (pl. a bináris keresés)
27.Írjon függvényt vagy metódust, mely visszaadja két egész paramétere szorzatának balról
második számjegyét! (a megoldás során ne használjon sztringeket/karaktertömböket)
28.Írjon függvényt vagy metódust, mely eldönti, hogy a paraméterként kapott 5x5-ös
/karakterekből álló/ tömbben a főátlóban van-e olyan elem, mely a főátlón kívül is
megjelenik a tömbben!
29.Írjon függvényt vagy metódust, mely valós típusú paraméterének azt a számjegyét adja
vissza, amelyik a tizedes pont után áll! (a megoldás során ne használjon
sztringeket/karaktertömböket)
30.Írjon függvényt vagy metódust, mely pozitív egész paraméterét fordítva adja vissza, pl.
fordit(234) eredménye 432! (a megoldás során ne használjon sztringeket/karaktertömböket)
31.Írjon függvényt vagy metódust, mely a paraméterként kapott 10x10-es mátrixról eldönti,
hogy van-e olyan eleme, mely sorában nagyobb és oszlopában pedig kisebb a többi elemnél!
32.Írjon függvényt vagy metódust, mely visszaadja, hogy k-tól m-ig hány olyan szám van,
melyeknek n db valódi osztója van! (n, k és m paraméter).
33.Írjon függvényt vagy metódust, mely visszaadja, hogy két pozitív egész paraméterének
legkisebb közös többszöröse hány számjegyből áll kettes számrendszerben.    
    
    */






        
    
    
}

