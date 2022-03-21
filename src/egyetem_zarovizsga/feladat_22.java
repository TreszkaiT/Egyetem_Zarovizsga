package egyetem_zarovizsga;

class Feladat_22 {

    public static void main(String[] args) {

        int[] arr = { 10, 2, 2, 10, 10, 3, 4, 3 };

        System.out.println(vanELeggyakrabbSzam(arr));

    }

    static boolean vanELeggyakrabbSzam(int[] arr) {

        int maxElofordulas = 0;
        int elofordulas = 0;
        int legtobbszorEloforduloSzam = 0;
        boolean bool = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    elofordulas++;
            }
            if (elofordulas > maxElofordulas && i != 0 && arr[i] != legtobbszorEloforduloSzam) {
                maxElofordulas = elofordulas;
                legtobbszorEloforduloSzam = arr[i];
                bool = true;
            } else if (elofordulas == maxElofordulas && arr[i] != legtobbszorEloforduloSzam) {
                bool = false;
            }

            elofordulas = 0;
        }

        return bool;

    }

}