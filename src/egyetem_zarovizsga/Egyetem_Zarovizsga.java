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
        
        if(PrimE(8)) System.out.println("Prím"); else System.out.println("Nem Prím");
        if(TermeszetesE(6)) System.out.println("Tökéletes"); else System.out.println("Nem Tökéletes");
        System.out.println(KarakterKeveres("Alma"));
        System.out.println(FaktorialisRekurziv(5));
        System.out.println(FibonacciRekurziv(10));
        System.err.println(Negyzetgyok(25));
        //System.out.println(NegyzetgyokRekurziv(50,25));
    }
    

 
    // 1. Írjon olyan függvényt vagy metódust, amely egy természetes számról eldönti, hogy
    //    prímszám-e, vagy sem!
    private static boolean PrimE(int N){       
        int szamlalo = 0;
        for(int i=1; i<=N; i++) if(N%i == 0) szamlalo++;
        return szamlalo<=2;       
    }    
    /*private static boolean PrimE(int N){
       
        int szamlalo = 0;
        for(int i=1; i<=N; i++){
            if(N%i == 0) szamlalo++;
        }
        return szamlalo<=2;
        //if(szamlalo<=2) return true;
        //return false;         
    }*/
    
    /*
    2. Írjon olyan függvényt vagy metódust, amely egy természetes számról eldönti, hogy tökéletes
szám-e, vagy sem! (pozitív osztóinak összege a szám kétszerese)
    */

    private static boolean TermeszetesE(int N) {
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
	for(int k=1; k<n;k++)
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

}
