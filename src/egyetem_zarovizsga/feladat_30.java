package egyetem_zarovizsga;

class Feladat_30 {

    public static void main(String[] args) {
        
        System.out.println( fordit(234) );

    }

    static int fordit(int num) {

        int szam = num;
        int forditva = 0;

        while( szam > 0 ) {

            forditva = (forditva * 10) + (szam % 10);
            szam /= 10;

        }

        return forditva;

    }

}