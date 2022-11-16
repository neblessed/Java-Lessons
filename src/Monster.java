public class Monster {
    int eye;
    int hands;
    int legs;

    Monster() {
        this.eye = 2;
        this.hands = 2;
        this.legs = 2;
    }

    Monster(int eye) {
        this.eye = eye;
        this.hands = 2;
        this.legs = 2;
    }

    Monster(int eye, int hands, int legs) {
        this.eye = eye;
        this.hands = hands;
        this.legs = legs;
    }

    void voice (){
       System.out.println("Arrrhhg! ");
    }

    void voice (int i){
        int j = 0;
        while (j != i){
            System.out.print("Arrrhhg! ");
            j++;
        }
        System.out.println();
    }

    void voice (int i, String word) {
        int j = 0;
        while (j!=i){
            System.out.print(word + " ");
            j++;
        }
        System.out.println();
    }
}
