package egyetem_zarovizsga;

class Feladat_23 {

    public static void main(String[] args) {
        
        int[] arr = { 1, 2, 3, 4, 5, 6, 2, 5, 6, 7, 8, 9, 10 };
        System.out.println( reszSorozatIndex(arr) );

    }

    static int reszSorozatIndex( int[] arr ) {

        int kezdoIndex = 0,
            sorozatHossz = 0,
            leghosszabbSorozatHossz = 0;

        for( int i = 0; i < arr.length - 1; i++ ) {

            /* ha az i-edik szám egyenlő a következő szám-1 */
            if( arr[i] == arr[i+1] - 1 ) {
            
                /* az aktuális sorozat hossza így egyel növekszik */
                sorozatHossz++;

                /* ha ez a sorozat így eddig a leghosszabb */
                if( sorozatHossz > leghosszabbSorozatHossz ) {

                    /* akkor ez a leghosszabb */
                    leghosszabbSorozatHossz = sorozatHossz;

                }
                /* ha az utolsó előtti elemet nézzük és az így kialakult sorhossz egyenlő,
                vagy nagyobb ... */
                if( i == arr.length-2 && sorozatHossz >= leghosszabbSorozatHossz ) {

                    kezdoIndex = i - sorozatHossz + 1;

                }

            }
            else {

                if(sorozatHossz >= leghosszabbSorozatHossz) {

                    kezdoIndex = i - sorozatHossz;

                }

                sorozatHossz = 0;

            }

        }

        return kezdoIndex;

    }

}