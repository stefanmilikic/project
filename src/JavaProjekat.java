import java.util.Scanner;

public class JavaProjekat {

    static int[] ispisElemenataNiza(int[] niz) {
        for (int i = 0; i < niz.length; i++) {
            System.out.print(niz[i] + " ");
        }
        return niz;
    }

    static String[] ispisElemenataNiza(String[] niz) {
        for (int i = 0; i < niz.length; i++) {
            System.out.print(niz[i] + " ");
        }
        return niz;
    }

    //1) Napraviti funkciju koja kao argument prima niz Stringova,
// i String koji zelimo da lociramo u tom nizu. Kao rezultat vratiti true/false ukoliko se nalazi/ne nalazi u nizu.
//public static boolean find(String rec, String[] niz)
    public static boolean find(String rec, String[] niz) {
        for (int i = 0; i < niz.length; i++) {
            if (!rec.equalsIgnoreCase(niz[i]))
                return false;
        }
        return true;
    }

    //2) Napraviti funkciju koja prima niz celih brojeva
    // i kao rezultat vraca nov niz gde je svaki element pomnozen sa Pi.
    //public static double[] pomnozenoSaPI(int[] brojevi)
    public static double[] pomnozenoSaPI(int[] brojevi) {
        final double PI = 3.14;
        double[] noviNiz = new double[brojevi.length];
        for (int i = 0; i < brojevi.length; i++) {
            brojevi[i] *= PI;
        }
        for (int i = 0; i < noviNiz.length; i++) {
            noviNiz[i] = brojevi[i];
            System.out.print(noviNiz[i] + " ");
        }
        return noviNiz;
    }

    //3) Napraviti funkciju koja ce za prosledjeni String obrnuti redosled karaktera.
// public static String reverse(String rec)
    public static String reverse(String rec) {
        String obrnuti = "";

        for (int i = 0; i < rec.length(); i++) {
            obrnuti = rec.charAt(i) + obrnuti;
        }
        return obrnuti;
    }

    //4) Napraviti funkciju koja ce primati niz Stringova, String koji zelimo da zamenimo,
// i String sa kojim zelimo da ga zamenimo u tom nizu.
//public static void replaceWith(String[] niz, String oldString, String newString)
    public static void replaceWith(String[] niz, String oldString, String newString) {
        for (int i = 0; i < niz.length; i++) {
            if (oldString.equalsIgnoreCase(niz[i]))
                niz[i] = newString;
            System.out.print(niz[i] + " ");
        }
        System.out.println();
    }

    //5) Napraviti funkciju koja prima String, String zapis ce biti u vidu nekog broja(npr "123", "741",..),
// funkcija treba ovaj String da pretvori u ceo broj i da ispise svaki broj koji je deljiv sa tim brojem.
//public static void deljivSa(String broj)
    public static void deljivSa(String broj) {
        int tajBroj = Integer.parseInt(broj);
        for (int i = 1; i < tajBroj; i++) {
            if (tajBroj % i == 0)
                System.out.println(i);
        }
        System.out.println();
    }
//6)Napraviti funkciju koja prima dva niza celih brojeva(ne moraju da budu iste velicine),
// porediti svaki broj na istoj poziciji i u zavisnosti od toga koji je veci dodati ga u rezultujuci niz,
// ako jednom nizu ponestane elemenata za poredjenje sa drugim nizom, samo ispisati preostale elemente.
//public static int[] najveci(int[] niz1, int[] niz2)

    public static int[] najveci(int[] niz1, int[] niz2) {
        int[] veci;
        if (niz1.length > niz2.length) {
            veci = new int[niz1.length];
            for (int i = 0; i < niz2.length; i++) {
                if (niz1[i] > niz2[i]) {
                    veci[i] = niz1[i];
                } else veci[i] = niz2[i];
            }
            for (int i = niz2.length; i < niz1.length; i++) {
                veci[i] = niz1[i];
            }
        } else if (niz2.length > niz1.length) {
            veci = new int[niz2.length];
            for (int i = 0; i < niz1.length; i++) {
                if (niz2[i] > niz1[i]) {
                    veci[i] = niz2[i];
                } else veci[i] = niz1[i];
            }
            for (int i = niz1.length; i < niz2.length; i++) {
                veci[i] = niz2[i];
            }
        } else {
            veci = new int[niz1.length];
            for (int i = 0; i < niz1.length; i++) {
                if (niz1[i] > niz2[i]) {
                    veci[i] = niz1[i];
                } else veci[i] = niz2[i];
            }

        }
        return veci;
    }

    // 7) Napraviti program koji(ovaj zadatak mozda bolje uraditi u posebnoj klasi) :
    //a) Ima funkciju koja omogucava korisniku da unese u niz 6 brojeva(nebitno kojih).
    //public static int[] unesiBrojeve()
    //b) Funkciju koja generise nasumicnih 30 brojeva.(Ovde ce nam trebati Math.random() funkcija koja generise Random broj,
    // ali je problem sto generise jedan double broj sa dugom decimalom, osmislite kako bi vi taj broj skratili
    // i pretvorili ga u ceo broj)
    //public static int[] randomBrojevi()
    //c) Funkcija koja ispisuje korisniku koliko je brojeva pogodio i koje brojeve je pogodio.
    // public static void bingo(int[] niz1, int[] niz2)
    public static void ispisiNiz(int[] niz) {
        for (int i = 0; i < niz.length; i++) {
            System.out.print(niz[i] + "");
        }
        System.out.println();
    }

    public static int[] unesiBrojeve() {
        int[] niz = new int[6];
        Scanner skener = new Scanner(System.in);
        for (int i = 0; i < niz.length; i++) {
            niz[i] = skener.nextInt();
        }
        return niz;
    }

    public static void main(String[] args) {

        String[] nekiNiz = {"Sretna", "steta", "sto", "stolica", "njiva", "kuca", "sporet", "krevet"};
        int[] nizBrojeva = {1, 3, 4, 5, 6, 7, 8};
        System.out.println("Unesite rec");
        Scanner sc = new Scanner(System.in);
        String rec = sc.nextLine();
        deljivSa(rec);
        String stari = sc.nextLine();
        String novi = sc.nextLine();
        System.out.println(find(rec, nekiNiz));
        System.out.println("Unesite brojeve u nizu");
        int[] rezultat = unesiBrojeve();
        ispisiNiz(rezultat);

        ispisElemenataNiza(nizBrojeva);
        System.out.println();
        pomnozenoSaPI(nizBrojeva);
        String nekaRec = sc.nextLine();
        System.out.println(reverse(nekaRec));
        replaceWith(nekiNiz, stari, novi);
        System.out.println(reverse(rec));
    }
}
