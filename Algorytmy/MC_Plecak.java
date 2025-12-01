void main() {
    int[] wagi = {3, 5, 5, 5, 2, 1, 3};
    int[] ceny = {1, 2, 3, 2, 5, 6, 4};
    int limit_plecaka = 10;

    int ilosc_przedmiotow = wagi.length;
    int najWynik = 0;

    Random losuj = new Random();

    for (int i = 0; i < 10000; i++) {

        int obecna_waga = 0;
        int obecna_cena = 0;
        boolean[] czyWziete = new boolean[ilosc_przedmiotow];

        for (int j = 0; j < 20; j++) {

            int nr = losuj.nextInt(ilosc_przedmiotow);

            if (czyWziete[nr] == false && obecna_waga + wagi[nr] <= limit_plecaka) {

                czyWziete[nr] = true;
                obecna_waga += wagi[nr];
                obecna_cena += ceny[nr];
            }
        }

        if (obecna_cena > najWynik) {
            najWynik = obecna_cena;
        }
    }

    System.out.println("Najlepsza znaleziona wartość to: " + najWynik);
}