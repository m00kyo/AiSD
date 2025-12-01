void main() {
  double wynik = MonteCarlo(150);
    System.out.println("Wyliczone pole to: " + wynik);
}

double MonteCarlo(int n) {
    int trafienia = 0;
    Random random = new Random();

    for(int i = 0; i < n; i++){
        double x = random.nextDouble();
        double y = random.nextDouble();

        double granica = -Math.cos(x+Math.PI / 2);
        if(y<=granica){
            trafienia++;
        }

    }
    return (double)trafienia / n;
}