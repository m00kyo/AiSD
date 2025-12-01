void main() {
    // f(1) = 1
    // f(2) = 1
    // f(n) = 3((f(n-1))*(f(n-2)))
    System.out.print("Piąty wyraz ciągu to: ");
    System.out.println(NCiag(5));

}
int NCiag (int n){
    if(n == 1 || n == 2){
        return 1;
    } else{
        return 3 * NCiag(n-1) * NCiag(n-2);
    }
}