package egyetem_zarovizsga;

class Feladat_7 {
    
    public static void main(String[] args) {
       System.out.println( kitevosHatvany(2) );
    }

    static int kitevosHatvany( int szam ) {

        int eredmeny = 1;
        int eredmeny2 = 1;

        while( eredmeny * szam < 567 ) {

            temp = eredmeny;
            eredmeny = szam * temp;

        }

        return eredmeny;

    }

}