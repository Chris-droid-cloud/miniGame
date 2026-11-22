public class Pet4 {

    String x = "x";
    String o = "o";

    String[] array = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};

    void smena(String znak, String pozitia) {
        int one = 0;
        for (int i = 0; i <= 8; i++) {
            if (pozitia.equals(array[i])) {
                one=2;
                if (znak.equals("x")) {
                    array[i] = x;
                }
                if (znak.equals("o")) {
                    array[i] = o;
                }
            }
        }
        if (one == 0) {
            System.out.println("Iacheika "+pozitia+" zaniata");
        }

        System.out.println(array[0] + array[1] + array[2]);
        System.out.println(array[3] + array[4] + array[5]);
        System.out.println(array[6] + array[7] + array[8]);
        System.out.println();

        control();

    }

    void control(){
        String nolik = "Player nolik win!";
        String krestik = "Player krestik win!";
        String nicia = "nicia";
        int game = 0;

        String x1 = "x";
        for (int i = 0; i <= 6; i = i + 3) {
            if (array[i].equals(x) || array[i].equals(o)) {
                x1 = x1.concat(array[i]);
                if (array[i + 1].equals(x) || array[i + 1].equals(o)) {
                    x1 = x1.concat(array[i + 1]);
                    if (array[i + 2].equals(x) || array[i + 2].equals(o)) {
                        x1 = x1.concat(array[i + 2]);
                        if (x1.equals("xxxx")) {
                            System.out.println(krestik);
                            game=1;
                        }
                        if (x1.equals("xooo")) {
                            System.out.println(nolik);
                            game=2;
                        }
                    }
                }
            }
        }

        String x2 = "x";
        for (int i = 0; i <= 2; i = i + 1) {
            if (array[i].equals(x) || array[i].equals(o)) {
                x2 = x2.concat(array[i]);
                if (array[i + 3].equals(x) || array[i + 3].equals(o)) {
                    x2 = x2.concat(array[i + 3]);
                    if (array[i + 6].equals(x) || array[i + 6].equals(o)) {
                        x2 = x2.concat(array[i + 6]);
                        if (x2.equals("xxxx")) {
                            System.out.println(krestik);
                            game=1;
                        }
                        if (x2.equals("xooo")) {
                            System.out.println(nolik);
                            game=2;
                        }
                    }
                }
            }
        }

        if (array[2].equals(o)) {
            if (array[4].equals(o)) {
                if (array[6].equals(o)) {
                    System.out.println(nolik);
                    game=2;
                }
            }
        }

        if (array[0].equals(o)) {
            if (array[4].equals(o)) {
                if (array[8].equals(o)) {
                    System.out.println(nolik);
                    game=2;
                }
            }
        }

        if (array[2].equals(x)) {
            if (array[4].equals(x)) {
                if (array[6].equals(x)) {
                    System.out.println(krestik);
                    game=1;
                }
            }
        }

        if (array[0].equals(x)) {
            if (array[4].equals(x)) {
                if (array[8].equals(x)) {
                    System.out.println(krestik);
                    game=1;
                }
            }
        }

        int a = 0;
        for(int i=0;i<=8;i++){
            if(array[i].equals(x)||array[i].equals(o)){
                a++;
            }
        }
        if (a == 9) {
            System.out.println("nicia! zanovo");

        }

        if(game==1||game==2){
            System.out.println("Zanovo!");
            game=0;
        }

    }

    void pole() {
        System.out.println(array[0] + array[1] + array[2]);
        System.out.println(array[3] + array[4] + array[5]);
        System.out.println(array[6] + array[7] + array[8]);
        System.out.println();
    }

    public static void main(String[] args) {
        //Pet4 krestik_Nolik = new Pet4();
        Pet4 play = new Pet4();

        play.pole();
        play.smena("o", "1");
        play.smena("o", "4");
        play.smena("o", "7");
       /* play.smena("x", "4");
        play.smena("o", "5");
        play.smena("x", "6");
        play.smena("o", "7");
        play.smena("x", "8");
        play.smena("o", "9");*/

    }
}