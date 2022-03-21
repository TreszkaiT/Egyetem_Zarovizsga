package egyetem_zarovizsga;

class Feladat_28 {

    public static void main(String[] args) {
        
        char[][] arr = {{'q','b','c','d','q'},
                        {'a','q','c','q','c'},
                        {'z','b','q','d','j'},
                        {'w','q','c','q','h'},
                        {'q','b','j','d','q'}};
        System.out.println( vanEOlyanElem(arr) );

    }

    static boolean vanEOlyanElem( char arr[][] ) {

        boolean bool = false;
        char[] atloElemek = { arr[0][0], arr[1][1], arr[2][2], arr[3][3], arr[4][4], arr[4][0], arr[3][1], arr[1][3], arr[0][4] };

        for (int ri = 0; ri < 5; ri++) {
            for (int ci = 0; ci < 5; ci++) {
                for (int i = 0; i < atloElemek.length; i++) {
                    if (   ((ri!=0 && ci!=0) && (ri!=1 && ci!=1) && (ri!=2 && ci!=2) && (ri!=3 && ci!=3) && (ri!=4 && ci!=4) && (ri!=4 && ci!=0) && (ri!=3 && ci!=1) && (ri!=1 && ci!=3) && (ri!=0 && ci!=4))  
                        && (atloElemek[i] == arr[ri][ci]) ) {
                        
                        bool = true;

                    }
                }
            }
        }

        return bool;
    
    }               

}