void main() {
    //ZACHŁANNY PROBLEM PLECAKA :)
    int[] przedmioty_w = {22, 33, 43, 56, 76};
    int[] przedmioty_obj = {1, 2, 10, 7, 9};
    int plecak_max = 10;
    int n = 5;
    boolean[] czySpakowane = new boolean[n];
    int w_plecaku = 0;
    int wartosc_wplecaku = 0;
    int liczba = 0;

    while(true){
        int id_przedmiotu = -1;
        for(int i=0; i <= 4; i++){
            if(czySpakowane[i]==false && przedmioty_obj[i]+w_plecaku<=plecak_max){
                if(id_przedmiotu == -1){
                    id_przedmiotu = i;
                }
                else if(przedmioty_w[i]>przedmioty_w[id_przedmiotu]){
                    id_przedmiotu = i;
                }
            }
        }
        if(id_przedmiotu == -1){
            break;
        }
        czySpakowane[id_przedmiotu] = true;
        w_plecaku = w_plecaku + przedmioty_obj[id_przedmiotu];
        wartosc_wplecaku = przedmioty_w[id_przedmiotu] + wartosc_wplecaku;
        liczba++;
    }
    System.out.println("Wartość w plecaku: " + wartosc_wplecaku);
    System.out.println("Zapakowałeś " + liczba + " przedmiotów.");

}
