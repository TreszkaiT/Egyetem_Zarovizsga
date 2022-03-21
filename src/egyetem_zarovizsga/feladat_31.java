package egyetem_zarovizsga;

class Feladat_31 {

    public static void main(String[] args) {
    
        int[][] arr = { {0,1,2,7,3,4,3,1,0,2},
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

        System.out.println( vanELegkisebbElem( arr ) );

    }

    static boolean vanELegkisebbElem( int[][] arr ) {

        boolean sorbanALegnagyobb = true;
        boolean oszlopbanALegkisebb = true;
        
        for (int ri = 0; ri < 10; ri++) {
            for (int ci = 0; ci < 10; ci++) {
                
                sorbanALegnagyobb = true;
                oszlopbanALegkisebb = true;

                /* sorában a legnagyobb? */
                for (int i = 0; i < 10; i++) {
                    if (arr[ri][ci] < arr[ri][i]) {
                        sorbanALegnagyobb = false;
                    }
                }

                /* oszlopában a legkisebb? */
                for (int j = 0; j < 10; j++) {
                    if ( arr[ri][ci] > arr[j][ci] ) {
                        oszlopbanALegkisebb = false;
                    }
                }

                if (oszlopbanALegkisebb == true && sorbanALegnagyobb == true) {
                    return true;
                }

            }
        }

        return false;

    }


}