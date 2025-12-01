void main() {
    int max_wartosc = BrutForce(0,0);
    System.out.println(max_wartosc);
}
int[] wartosc_przedmiotu = {6,4,5,7,10,2,3};
int[] objetosc_przedmiotu = {6,2,3,2,3,1,2};

int BrutForce(int i, int aktualna_waga){
    int max_plecak = 15;
    int took_wartosc;
    int not_wartosc;

    if(i == 7){
        return 0;
    }
    if(aktualna_waga+objetosc_przedmiotu[i]>max_plecak){
        return BrutForce(i+1, aktualna_waga);
    }

    took_wartosc = wartosc_przedmiotu[i] + BrutForce(i+1,objetosc_przedmiotu[i]+aktualna_waga);
    not_wartosc = BrutForce(i+1, aktualna_waga);

    return Math.max(took_wartosc,not_wartosc);
}