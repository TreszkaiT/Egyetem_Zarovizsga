package egyetem_zarovizsga;

class Feladat_27 {

    public static void main(String[] args) {
        
        System.out.println( masodikSzam(51, 72) );

    }

    static int masodikSzam( int num1, int num2 ) {

        int szam = num1 * num2;
        
        while( szam > 99 ) {

            szam /= 10;

        }

        return szam % 10;
        
    }

}