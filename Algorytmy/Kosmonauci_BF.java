static List<Integer> naj_Zaloga = null;

static int[] k = {
        0b1001, //k1
        0b0101, //k2
        0b0110, //k3
        0b1100, //k4
        0b0011, //k5
        0b0101, //k6
};

static int cel = 0b1111;
void main() {

    Rekrutuj(0, 0, new ArrayList<>());
    System.out.println("Długość najlepszej załogi: " + naj_Zaloga.size());
    for (int i : naj_Zaloga) {
        System.out.println(i+1);
    }
}

void Rekrutuj(int index, int akt_umiejetnosci, List<Integer> akt_Zaloga){
    if(naj_Zaloga != null && naj_Zaloga.size()<=akt_Zaloga.size()){
        return;
    }

    if(akt_umiejetnosci==cel){
        naj_Zaloga = new ArrayList<Integer>(akt_Zaloga);
        return;
    }
    if(index==k.length){
        return;
    }

    akt_Zaloga.add(index);
    Rekrutuj(index +1,akt_umiejetnosci | k[index], akt_Zaloga);

    akt_Zaloga.removeLast();
    Rekrutuj(index+1,akt_umiejetnosci, akt_Zaloga);
}