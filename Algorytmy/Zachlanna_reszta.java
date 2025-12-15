void main() {
    int[] monety = {2000,1000, 500, 200, 100, 50, 20, 10, 5, 1};
    int[] ilosc =   {2,   2,     30,  1,   0,  30, 30, 30, 30, 30};
    int index = 0;
    double dzielenie = 100.0;

    double reszta = 8.27;
    reszta = reszta * 100;

    while(reszta>0){
        if(reszta >= monety[index]){
            if(ilosc[index]>0){
                reszta = reszta - monety[index];
                ilosc[index]--;
                System.out.println("Reszta: " + monety[index]/dzielenie);
                System.out.println("Zostało w kasie "+ilosc[index] + " takich monet.");
            } else {
                index++;
            }
        } else {
            index++;
        }
    }

}