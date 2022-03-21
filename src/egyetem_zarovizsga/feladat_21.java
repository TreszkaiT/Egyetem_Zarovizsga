package egyetem_zarovizsga;

class Feladat_21 {

    public static void main(String[] args) {
        
        int[] arr = { 6, 3, 12, 9, 18 };

        if( vanEMindendOszto( arr ) ) System.out.println( "igen, van" );
        else System.out.println( "nem, nincsen" );

    }

    static boolean vanEMindendOszto( int[] arr ) {

        boolean bool = false;
        int counter = 0;

        for(int i=0; i < arr.length; i++) {

            counter = 0;

            for( int j=0; j < arr.length; j++ ) {

                /* hogyha a vizsgált szám ossza a tömmben helyet foglaló j-edik számot,
                akkor növeljük a számlálót */
                if( arr[j] % arr[i] == 0 ) counter++;

            }

            /* ha a számláló megegyzik a több méretével, az azt jelenti, 
            hogy az összes számot ossza a tömbben, ez esetben a bool változot true-ra módosítjuk */
            if( counter == arr.length ) bool = true;

            /* a számlálót visszaállítjuk 0-ra a következő ciklushoz */

        }

        /* ha a bool átvált valamikor is true-ra, akkor van egy olyan szám, 
        amelyik mindent oszt a tömbben */
        return bool;

    }

}