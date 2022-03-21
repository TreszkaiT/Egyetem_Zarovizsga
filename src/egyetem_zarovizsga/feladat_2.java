package egyetem_zarovizsga;

class feladat_2 {

    public static void main(String[] args) {
        System.out.println(isPerfect(Integer.parseInt(args[0])));
    }

    //Írjon olyan függvényt vagy metódust, amely egy természetes 
    //számról eldönti, hogy tökéletes szám-e, vagy sem! (pozitív osztóinak összege a szám kétszerese)

    public static boolean isPerfect(int num){
        int osszeg=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                osszeg+=i;
            }
        }
        return num*2==osszeg;
    }
}