/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egyetem_zarovizsga;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
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
        System.err.println("5. Köbgyök: "+kobgyok(2234.423));
        System.out.println("6. Fibonacci rekurzív: "+FibonacciRekurziv(10));
        System.err.println("7. Legnagyobb egész kitevő: "+LegnagyobbEgeszKitevo(3));
        System.err.println("8. Kilencesek száma: "+KilencesekSzama(25989));
        System.err.println("9. Kettes szám második bitje: "+KettesMasodikBit(422));
        System.err.println("10. Sorozat első 5 X-eé osztható eleme: "); SorozatOttel(8);
        System.err.println("11. Pozitív osztók száma: "+PozitivOsztokSzama(6));
        System.err.println("12. Szamjegyek maradnak: "+SzamjegyekMaradnak("rfds 435fs4g"));
        System.err.println("13. Palindrom-e: "+PalindromE("abba"));
        System.err.println("14. Minden szó kezdőbetűje nagybetű: "+SzoKezdobetuNagy("abba sd 23 kk"));
        System.err.println("15. Karaktert eltávolít: "+KaraktertEltavolit("abba sd 23 kka",'k'));
        System.err.println("16. Összes előfordulás: "+KarakterlancOsszesElofordulasa("akkbba kksd 23 kka","kk"));
        System.err.println("17. Angol ASCII negyzetszam: "); AdciiNegyzetszam();
        System.err.println("18. Random string generátor: "+randomString());
        System.err.println("19. Karakterláncba beszúr a: "+ BeszurA("alma"));
        System.err.println("20. N alat a k: "+ kombinacio( 8, 3 ));
        int[] sz = {8,2,4};
        System.err.println("21. Van-e olyan szám, ami az összes többit osztja: "+ VanESzamOsztja( sz ));
        int[] sz1 = {8,2,4,2,3};
        System.err.println("22. Van-e olyan szám, ami az összes többinél többször: "+ VanESzamTobbszor( sz1 ));
        int[] sz2 = { 1, 2, 3, 4, 5, 6, 2, 5, 6, 7, 8, 9, 10 };
        System.err.println("23. Leghosszabb sorozat: "+ reszSorozatIndex(sz2) );
        int[] sz3 = { 30, 2, 4, 5, 14, 52, 3, 1, 18 };
        System.err.println("24. Legkisebb index: "+ LegkisebbIndex(sz3) ); 
        System.err.println("25. Hanyadik pozíció: "+ HanyadikPozicio("Halló! Ez itt egy teszt láték.", 'l', 3) );
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        System.err.println("26. Logaritmus: "+ BinarisLogaritmikus(arr, 6) ); 
        System.err.println("27. Paraméterének: "+ masodikSzam(51, 72) );
        char[][] arr1 = {{'q','b','c','d','q'},
                        {'a','q','c','q','c'},
                        {'z','b','q','d','j'},
                        {'w','q','c','q','h'},
                        {'q','b','j','d','q'}};
        System.err.println("28. Főátlón kívül: "+ vanEOlyanElem(arr1) );
        System.err.println("29. Valós típusú: "+ valosTipusu(22.56) );
        System.err.println("30. Fordít: "+ fordit(12345) );
                int[][] arr2 = { {0,1,2,7,3,4,3,1,0,2},
                                 {0,1,2,7,4,5,6,7,8,9},
                                 {5,9,7,6,7,5,6,7,8,9},
                                 {0,1,2,5,2,2,3,4,2,1},
                                 {0,1,2,9,4,5,6,7,8,9},
                                 {0,1,2,8,4,5,6,7,8,9},
                                 {0,1,2,7,4,5,6,7,8,9},
                                 {0,1,2,8,4,5,6,7,8,9},
                                 {0,1,2,9,4,5,6,7,8,9},
                                 {0,1,2,8,4,5,6,7,8,9},
                    };

        System.err.println("31. Matix sor nagyobb oszlop kisebb: "+  vanELegkisebbElem( arr2 ) ); 
        System.err.println("32. k-m-ig mennyi osztó: "+  MennyiSzam(2, 12, 2) ); 
        System.err.println("33. Hany szamjegy kettesben: "+  hanySzamjegyKettesben(33, 23) );        
        //System.out.println(NegyzetgyokRekurziv(50,25));
    }
    
    // 1. Írjon olyan függvényt vagy metódust, amely egy természetes számról eldönti, hogy
    //    prímszám-e, vagy sem!
    private static boolean PrimE(int N){
        
        int szamlalo = 0;
        for(int i=1; i<=N; i++){
            
            if(N%i == 0) szamlalo++;
        }
        if(szamlalo<=2) return true; else return false;     
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

    /*private static String KarakterKeveres(String str) {
        
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
    */
    private static String KarakterKeveres(String str) {
        
        Random rnd = new Random();
        char[] ch = str.toCharArray();
                
        for(int i=0; i< str.length(); i++){
            int j = rnd.nextInt(str.length());
            char segedCh = ch[i];
            ch[i] = ch[j];
            ch[j] = segedCh;
        }        
        return new String(ch);
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
    private static float Negyzetgyok(float N){
        
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
xk+1=1/3*(2*xk+a/xk2) sorozatot, amely a köbgyökéhez konvergál, ha x1=1. ****************************
    */
   /* public static double kobgyok(double a) {

        double x, y;
        x = 1;
        do {
            y = x;
            x = (double)( ( 2 * x + ( a / ( x * x ) ) ) / 3 );
        }
        while(Math.abs(x-y) > 0.00001);
        
        return x;
    }
    */ 
    
    public static double kobgyok(double szam)
        {
            int n = 50;
            double[] x = new double[n + 1];
            x[1] = 1;
            for (int k = 1; k < n; k++)
                x[k + 1] = (2 * x[k] + (szam / (x[k] * x[k]))) / 3;
            return x[n];
        }

       
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
    
    /*private static Integer LegnagyobbEgeszKitevo(int N) {
        //if(N>567) return false;
        int res = 0;
        if(N<567) res=1;  
        int N1 = N;
        do{
            N1 *= N;
            if(N1<=567) res++;
        }while(N1>567);             // amíg hamis
        
        return res;
    } */  

    private static Integer LegnagyobbEgeszKitevo(int N) {
        //if(N>567) return false;
        int res = 1;
        int N1 = N;
        do{
            N1 *= N;
            res++;
        }while(N1<567);             // amíg igaz
        
        return --res;
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

        int szam2 = N / 2;
        
        return szam2 % 2;

    }

    
    
/*
10. Írjon olyan függvényt vagy metódust, amelynek paramétere egy 1 < x < 10 természetes
szám, és kiírja az 1,3,4,6,7,9,10,12,... sorozat első öt x-szel osztható elemét, azaz a sorozat
i+1-edik tagja 2-vel nagyobb az i-ediknél, ha i páratlan, s eggyel nagyobb az i-ediknél, ha i
páros!    
    */

    private static void SorozatOttel(int N) {
        if(N<=1) return;
        if(N>=10) return;
        
        int k=0;
        int i=1;
        int szam=0;
        do{
            if(i==1) szam=1;
            else{
                if(i%2==0) szam=szam+2;
                else szam=szam+1;
            }
            if(szam%N==0) {System.out.print("; "+szam); k++;};
            i++;
        }while(k<5);
    }

/*
11. Írjon olyan függvényt vagy metódust, amely a paraméterében megadott természetes szám
pozitív osztóinak számával tér vissza!    
    */
    
    private static Integer PozitivOsztokSzama(int N) {
        int res=0;
        
        for(int i=1; i<=N; i++)
            if(N%i==0) res++;
        
        return res;
    }    

/*
12. Írjon olyan függvényt vagy metódust, amely egy karakterláncból vagy sztringből a
számjegyek kivételével minden karaktert eltávolít!    
    */    

    private static String SzamjegyekMaradnak(String S) {
        String res ="";
        String tar="";
        for(int i=0; i<S.length();i++)
            if(S.charAt(i)>=48 && S.charAt(i)<=57) tar+=S.charAt(i);
        res=tar;
        return res;
    }

/*
13. Írjon olyan függvényt vagy metódust, amely egy karakterláncról vagy sztringről eldönti,
hogy palindróma-e! (Balról olvasva ugyanaz, mint jobbról olvasva.)    
    */    
    private static String PalindromE(String S) {
        String res="Nem";
        boolean az=true;
        for(int i=0; i<(S.length()/2); i++)
           // for(int j=S.length()-1;i>=0;i--){
                if(S.charAt(i)!=S.charAt((S.length()-1)-i)) az=false;
            //}
        if(az) res="Igen";            
        return res;    
    }    
    
/*
14. Írjon olyan függvényt vagy metódust, amely egy, az angol ábécé betűit tartalmazó
karakterláncban vagy sztringben minden szó kezdőbetűjét nagybetűre alakítja!    
    */    
    /*private static String SzoKezdobetuNagy(String S) {
        String res="";
        String tar="";
        for(int i=0; i<S.length(); i++){
            if(S.charAt(i)>=97 && S.charAt(i)<=122){
                if(i==0) tar += Character.toString(S.charAt(i)-32);
                else if(S.charAt(i-1)==32) tar += Character.toString(S.charAt(i)-32);
                else tar += Character.toString(S.charAt(i));
            }
            else tar += Character.toString(S.charAt(i));
            
        }
        res = tar;
        return res;
    }  */

        private static String SzoKezdobetuNagy(String str) {

        String tar="";
        
        for(int i=0; i<str.length(); i++){
            if(i==0) tar += Character.toString(str.charAt(i)-32);
            else{
                if(str.charAt(i-1)==32) tar += Character.toString(str.charAt(i)-32);
                else  tar += Character.toString(str.charAt(i));
            }            
        }        
        return tar;
    }  

        
    /*private static String SzoKezdobetuNagy(String str) {

        char[] ch = new char[str.length()];
        
        for(int i=0; i<str.length(); i++){
            if(i==0) ch[i] = (char)(str.charAt(i)-32);
            else{
                if(str.charAt(i-1)==32) ch[i] = (char)(str.charAt(i)-32);
                else ch[i] = str.charAt(i);
            }            
        }        
        return new String(ch);
    } */    

/*
15. Írjon olyan függvényt vagy metódust, amely egy karakterláncból vagy sztringből eltávolítja
egy megadott karakter összes előfordulását!    
    */    
    private static String KaraktertEltavolit(String S, char c) {
        String res="";
        String tar="";
        for(int i=0; i<S.length(); i++)
            if(S.charAt(i)!=c) tar += Character.toString(S.charAt(i));
        res=tar;
        return res;
    }

    /*
 16. Írjon olyan függvényt vagy metódust, amely megszámolja egy adott karakterlánc vagy
sztring összes előfordulását egy másik karakterláncban vagy sztringben!   
    */
 /*   private static Integer KarakterlancOsszesElofordulasa(String S, String K) {
        int res=0;
        boolean talalat = false;
        for(int i=0; i<S.length(); i++){
            for(int j=0;j<K.length();j++){
                if(S.charAt(i)==K.charAt(j)){                 
                    talalat = true;                   
                    i++;
                    if(j==K.length()-1){ 
                        res++;
                        talalat=false;
                        j=0;
                        continue;
                    }
                }else{
                    talalat = false;                
                    j=0;
                    break;
                }                
            }
        }        
        return res;
    }      
*/
    private static Integer KarakterlancOsszesElofordulasa(String S, String K) {
        int db=0;
         for(int i=0; i<S.length(); i++){
            for(int j=0;j<K.length();j++){
                if(S.charAt(i)==K.charAt(j)){                                                       
                    i++;
                    if((j==K.length()-1)) db++;                    
                }else{
                    if(j!=0) i--;     
                    break;
                }                
            }
        }        
        return db;
    }    
    
/*
17. Írjon olyan függvényt vagy metódust, amely kiírja az angol kisbetűs ábécé azon betűit,
melyek ASCII kódja négyzetszám!    
    */    
    private static void AdciiNegyzetszam() {
        for(int i=97; i<=122; i++){
            for(int j=1; j<=11; j++){
                if(j*j==i) System.out.println(", "+(char)i);
            }
        }
    }
    
/*
18. Írjon olyan függvényt vagy metódust, amely előállít egy 5 karakterből (angol kisbetűs ábécé
karaktereit használva) álló véletlen karakterláncot vagy sztringet! Biztosítsa, hogy minden 5
hosszú különböző betűkből álló sztring egyenlő valószínűséggel kerüljön kiválasztásra,
feltéve, hogy a választott programozási nyelv véletlenszám-generátora egyenletes eloszlást
biztosít!    
    */
    /*static String randomString() {

        int a = (int)'a';
        int z = (int)'z';
        
        ArrayList<Integer> abc = new ArrayList<Integer>();
        char[] ch = new char[5];
        
        for(int i=a; i<=z; i++) abc.add(i);

        Random rnd = new Random();

        for( int i = 0; i < 5; i++ ) {
            int rnd1 = rnd.nextInt(abc.size());
            ch[i] = (char)((int)abc.get(rnd1));
            abc.remove(rnd1);
        }
        return new String(ch);
    }  */ 
    
    
    static String randomString() {

        int a = (int)'a';
        int z = (int)'z';
        
        ArrayList<Character> abc = new ArrayList<Character>();
 
        char[] ch = new char[5];
        
        for(int i=a; i<=z; i++) abc.add((char)i);

        Random rnd = new Random();

        for( int i = 0; i < 5; i++ ) {
            int ri = rnd.nextInt(abc.size());
            ch[i]  = abc.get(ri);
            abc.remove(ri);
        }
        return new String(ch);
    }       
    
    /*static String randomString() {

        int a = (int)'a';
        int z = (int)'z';
        int rndInt;
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();

        System.out.println( a + ", " + z );

        for( int i = 0; i < 5; i++ ) {
            rndInt = Math.abs((int)rand.nextInt() % (z - a + 1)) + a;
            sb.append( (char)rndInt );
        }
        return sb.toString();
    }*/

/*
19.Írjon olyan függvényt vagy metódust, amely egy karakterláncba vagy sztringbe beszúr egy
„a” karaktert véletlenül választott pozícióba (véletlenszám–generátor használható)!    
    */    
    /*static String BeszurA(String Str, char c){
        Random rand = new Random();
        int rnd = Math.abs((int)rand.nextInt() % Str.length());
        return Str.substring(0,rnd)+c+Str.substring(rnd);
    }*/

    static String BeszurA(String str){
        Random rnd = new Random();
        int i = rnd.nextInt(str.length());
        return str.substring(0,i)+'a'+str.substring(i);
    }    
    
/*
20.Adjon olyan függvényt vagy metódust, ami adott két pozitív egész paramétere esetén
megadja (n alatt a k)=n!/k!(n-k)! értékét. Használjon rekurziót! 
    */
    
    static float kombinacio( int n, int k ) {
        if( n >= k ) {
            return fakt(n) / ( fakt( k ) * fakt( n - k ) );
        }
        else {
            System.out.println( "Az n legyen nagyobb mint a k!" );
            return 0;
        }
    }

    static int fakt( int num ) {
        if( num == 0 ) return 1;
        else return num * fakt( num - 1 );
    }    

/*
21.Adjon olyan metódust vagy függvényt, ami eldönti, hogy a paramétereként megadott
(pozitív egészekből álló) nemüres tömbben van-e olyan szám, ami az összes többit osztja.
(Maradékszámító függvény használható).    
    */    
private static boolean VanESzamOsztja(int[] Num) {
    boolean van=true;
    for(int i=0; i<Num.length; i++){
        van=true;
        for(int j=0; j<Num.length; j++)
            if(Num[j]%Num[i]!=0){
                van=false;
            }    
        if(van==true) return true;
    }         
    return false;
}

/*
22.Adjon olyan metódust vagy függvényt, ami eldönti, hogy a paramétereként megadott
(pozitív egészekből álló) nemüres tömbben van-e olyan szám, ami az összes többinél
többször fordul elő.
*/
/*private static String VanESzamTobbszor(int[] Num){
    String res="Nincs";
    int db0=0, db1=0;
    for(int i=0; i<Num.length; i++){
        db1=0;
        for(int j=0; j<Num.length; j++){
            if(Num[i]==Num[j]) 
                if(i==0) db0++;
                else db1++;
        }
        if(i!=0 && db1>db0) res="Van";
    }
    return res;
}*/


private static boolean VanESzamTobbszor(int[] Num){
    int db0, db1;
    for(int i=0; i<Num.length; i++){
        db0=0; db1=0;
        for(int j=0; j<Num.length; j++){
            if(Num[i]==Num[j]) db0++; else db1++;
        }
        if(db0>db1) return true;
    }
    return false;
}

/*
23.Adjon olyan metódust vagy függvényt, ami visszaadja, hogy a paramétereként megadott
(pozitív egészekből álló) nemüres tömbben melyik index az, ahol a leghosszabb
folyamatosan növekvő részsorozat kezdődik. Ha több ilyen index is van, az utolsót adja
vissza.
*/
    private static int reszSorozatIndex(int[] Num) {
        int index=0, indexTar=0, db=0, dbTar=0;       // index1, db1 az aktuális sorozat éréketi|||  index2, db2 a leghosszabb sorozat értékei
        for(int i=0; i<Num.length-1; i++){
            if(Num[i]+1==Num[i+1]){
                if(db==0) {index = i; db++;}
                else db++;
            }else{
                if(db>=dbTar) { indexTar=index; dbTar=db;}
                db=0;
            }
            
            if(i==Num.length-2) if(db>=dbTar) { indexTar=index;}  // utolsó előtti elemre érve (Num.length-2)
        }
        return indexTar;
    }

/*
24.Adjon olyan metódust vagy függvényt, ami visszaadja, hogy a paramétereként megadott
(pozitív egészekből álló) nemüres tömbben melyik az a legkisebb index, amire az index
előtti elemek összege meghaladja a tömb első két elemének szorzatát. Ha nincs ilyen, 0-t
adjon vissza.    
    */    
/*
private static int LegkisebbIndex(int[] Num){
    int res = 0;
    int szorzElsoKetto = Num[0]*Num[1];
    int osszeg = 1;
    for(int i=0; i<Num.length; i++){
        osszeg = 1;
        for(int j=0; j<=i; j++) osszeg += Num[j];
        if(osszeg>szorzElsoKetto) {res=i+1; break;} 
    }
    
    return res;
}    
*/

private static int LegkisebbIndex(int[] Num){
    int osszeg = 1;
    for(int i=0; i<Num.length; i++){
        if(osszeg<=Num[0]*Num[1]) osszeg+=Num[i];
        else return i;
    }
    return 0;
}    


/*
25.Adjon egy metódust vagy függvényt, ami paraméterként adott s sztring/karaktertömb, c
karakter és n pozitív egész szám esetén megadja, hogy a c karakter n-edik előfordulása
hányadik pozíción van az „s” sztringben.
*/
/*private static int HanyadikPozicio(String s, char c, int n){
    int pos = 0;
    for(int i=0; i<s.length(); i++ ){
        if(s.charAt(i)==c) pos++;
        if(pos==n) {pos=i; break;}
    }
    return pos;
}*/

private static int HanyadikPozicio(String s, char c, int n){
    int pos = 0;
    for(int i=0; i<s.length(); i++ ){
        if(s.charAt(i)==c) pos++;
        if(pos==n) return i;
    }
    return 0;
}

/************************************************************************************************************************
26.Adjon metódust vagy függvényt, ami a paraméterként kapott, egészekből álló rendezett
tömbben a tömb hosszának logaritmusával arányos lépésszám alatt megkeresi a
paraméterként kapott egész első előfordulásának indexét, illetve ha nincs ilyen, akkor -1-et
ad vissza. (pl. a bináris keresés)
*/
    /*static int indexOfNum( int[] arr, int num ) {
    
        int logHossz = (int)Math.log( (double)(arr.length) );

        for (int i = 0; i < logHossz; i++) {            
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;    
    }*/

    /*static int BinarisLogaritmikus( int[] arr, int Num ) {
    
        int A = 0;
        int B = arr.length-1;
        int K = 0;

        do{
            K=(int)((A+B)/2);
            if(arr[K]>Num) B=K-1;
            if(arr[K]<Num) A=K+1;
        }while(A<B && arr[K]!=Num);
        
        if(A<=B) return K; else return -1;  
    }  */  
    
    
    static int BinarisLogaritmikus( int[] arr, int Num ) {
    
        int A = 0;
        int B = arr.length-1;
        int K = 0;

        while(A<=B){
            K=(A+B)/2;
            if(arr[K]==Num) return K;             
            if(arr[K]>Num) B=K-1;
            if(arr[K]<Num) A=K+1;
        };        
        return -1;  
    }   
    
    
    
 /* public static int BinarisLogaritmikus(int[] tomb, int szam)
        {
            int min = 0, max = tomb.length-1;
            while (min <= max)
            {
                int mid = min + (max - min) / 2;
                if (tomb[mid] == szam) return mid;
                if (tomb[mid] > szam) max = mid - 1;
                else min = mid + 1;
            }
            return -1;
        }    
    */
/*
27.Írjon függvényt vagy metódust, mely visszaadja két egész paramétere szorzatának balról
második számjegyét! (a megoldás során ne használjon sztringeket/karaktertömböket)    
    */    
    static int masodikSzam( int num1, int num2 ) {

        int szam = num1 * num2;
        
        while( szam > 99 ) {
            szam /= 10;
        }
        return szam % 10;        
    }    

/*
28.Írjon függvényt vagy metódust, mely eldönti, hogy a paraméterként kapott 5x5-ös
/karakterekből álló/ tömbben a főátlóban van-e olyan elem, mely a főátlón kívül is
megjelenik a tömbben!    
    */    
private static boolean vanEOlyanElem(char[][] c){
    
    char[] cTomb = new char[5];
    
    for(int i=0; i<5; i++)
        for(int j=0; j<5; j++)
            if(i==j) cTomb[i]=c[i][j];
    
    for(int i=0; i<5; i++)
        for(int j=0; j<5; j++)
            for(int k=0; k<cTomb.length; k++)
                if(i!=j && c[i][j]==cTomb[k]) return true;
            
    return false;
}

/*
29.Írjon függvényt vagy metódust, mely valós típusú paraméterének azt a számjegyét adja
vissza, amelyik a tizedes pont után áll! (a megoldás során ne használjon
sztringeket/karaktertömböket)
*/
private static int valosTipusu(double N){
    int Sz = (int)(N * 10);
    return Sz%10;
}    

/*
30.Írjon függvényt vagy metódust, mely pozitív egész paraméterét fordítva adja vissza, pl.
fordit(234) eredménye 432! (a megoldás során ne használjon sztringeket/karaktertömböket)
*/
/*private static int fordit(int N){
    int Sz=0;
    do{
        Sz = Sz*10 + N%10;
        N = N/10;
    }while(N!=0);
    
    return Sz;
}*/

private static int fordit(int N){
    int Sz=0;
    while(N>0){
        Sz = Sz*10 + N%10;
        N = N/10;
    }    
    return Sz;
}


/*
31.Írjon függvényt vagy metódust, mely a paraméterként kapott 10x10-es mátrixról eldönti,
hogy van-e olyan eleme, mely sorában nagyobb és oszlopában pedig kisebb a többi elemnél!
*/
private static boolean vanELegkisebbElem(int[][] Tomb){
    
    int sor = 0, indexI=0, indexJ=0, oszlop=0;
    for(int i=0; i<10; i++){
        sor=Tomb[i][0];
        for(int j=0; j<10; j++){
            if(Tomb[i][j]>sor) {sor=Tomb[i][j]; indexI=i; indexJ=j;}
        }
        
        oszlop=sor;
        for(int k=0; k<10; k++)
            if(Tomb[k][indexJ]<oszlop) oszlop=Tomb[k][indexJ];
        
        if(oszlop==sor) return true;
    }
    
    return false;
}

/*
32.Írjon függvényt vagy metódust, mely visszaadja, hogy k-tól m-ig hány olyan szám van,
melyeknek n db valódi osztója van! (n, k és m paraméter).
*/
private static int MennyiSzam(int k, int m, int n){
    int db=0, oszto=0;
    
    for(int i=k; i<=m; i++ ){
        oszto=0;
        for(int j=2; j<=i/2; j++)
            if(i%j==0) oszto++;        
        if(oszto==n) db++;
    }    
    return db;
}

/*******************************************************************************************
33.Írjon függvényt vagy metódust, mely visszaadja, hogy két pozitív egész paraméterének
legkisebb közös többszöröse hány számjegyből áll kettes számrendszerben. 
*/
    /*static int hanySzamjegyKettesben( int num1, int num2 ) {

        int lkkt = 1;
        int szamjegy = 0;
        boolean bool = true;

        while( bool ) {
            if ( lkkt % num1 == 0 && lkkt % num2 == 0 && lkkt != num1 && lkkt != num2 ) {
                bool = false;
            }
            else {
                lkkt++;
            }
        }

        while(lkkt > 0) {            
            lkkt /= 2;
            szamjegy++;
        }
        return szamjegy;
    }
   */ 

        public static int hanySzamjegyKettesben(int szam1, int szam2)
        {
            int lkkt = (szam1 < szam2) ? szam1 : szam2;

            while (lkkt % szam1 != 0 || lkkt % szam2 != 0) lkkt++;

            int db = 0;
            while (lkkt > 0)
            {
                lkkt /= 2;
                db++;
            }

            return db;
        }
  /*
        static int hanySzamjegyKettesben(int x, int y) {
        int a = x;
        int b = y;
        int t;
        while (b > 0) {
            t = b;
            b = a % b;
            a = t;
        }
        int res = x*y/a;
        int count = 0;
        while (res != 0) {
            res /= 2;
            count++;
        }
        return count;
    }
*/



}