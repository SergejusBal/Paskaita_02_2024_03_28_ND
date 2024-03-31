
public class Main {
    public static void main(String[] args) {
        //////////////////////////////////////////////
        //////// Pirma užduotis

        System.out.println();
        System.out.println("Pirma užduotis");
        System.out.println();

        int gimimoMetai = 1990;
        int amzius;

        while (2024 >= gimimoMetai){
            amzius = 2024 - gimimoMetai;
            if (amzius > 18) System.out.println("Vyrensis nei 18, amzius yra: " + amzius + " metai.");
            else if (amzius < 18) System.out.println("Jaunesnis nei 18, amzius yra: " + amzius + " metai.");
            else System.out.println("18 metu, Pilnametis!");

            gimimoMetai++;
        }


        //////////////////////////////////////////////
        //////// Antra užduotis

        System.out.println();
        System.out.println("Antra užduotis");
        System.out.println();


        //Cia skirtingi variantai, kad visus patikrinti ar kiekvienam skirtinga programa?
        int[] dalikliai = {2, 5, 7, 8, 12, 16, 42, 103, 111, 223, 250};

        // pirmas variantas su visais dalikliais kartu
        int dalijasi = 0;
        for(int i = 1; i <= 10000; i++) {
            for (int j = 0; j < dalikliai.length; j++) {
                dalijasi = i % dalikliai[j];
                if (dalijasi == 0) break;
            }
            switch (dalijasi) {
                case 0:
                    System.out.println(i);
                    break;
                default:
                    System.out.println(i+" nesidalina");
            }
        }

        // Antras variantas su kiekvienu dalikliu atskirai
        for (int j = 0; j < dalikliai.length; j++) {
            int daliklis = dalikliai[j];
            for (int i = 1; i <= 10000; i++) {
                dalijasi = i % daliklis;
                switch (dalijasi) {
                    case 0:
                        System.out.println(i);
                        break;
                    default:
                        System.out.println(i + " nesidalina");
                }
            }
        }
    }
}