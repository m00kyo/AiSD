int[] przedmioty_wartosc = {22, 33, 43, 56, 76};
int[] przedmioty_wielkosc = {1, 2, 10, 7, 9};

int Plecak_BF(int i, int akt_waga){
    if(i == 5){
        return 0;
    }
    if(akt_waga+przedmioty_wielkosc[i] > 10){
        return Plecak_BF(i+1,akt_waga);
    }

    int wartosc_wzietych = przedmioty_wartosc[i]+Plecak_BF(i+1,akt_waga+przedmioty_wielkosc[i]);
    int wartosc_nie_wzietych = Plecak_BF(i+1,akt_waga);

    return Math.max(wartosc_wzietych, wartosc_nie_wzietych);
}

void main() {
    int max_war = Plecak_BF(0,0);
    System.out.println(max_war);
}