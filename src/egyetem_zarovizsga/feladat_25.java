package egyetem_zarovizsga;

class Feladat_25 {

    public static void main(String[] args) {
        System.out.println(elofordulas("Halló! Ez itt egy teszt láték.", 'l', 3));
    }

    static int elofordulas(String s, char c, int n) {

        int counter = 0, poz = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                counter++;
                if (counter == n) {
                    poz = i;
                }
            }
        }
        return poz;
    }
}