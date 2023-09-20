import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int Math, Phy, Chem, Lite, Hist, Mus;

        Scanner inp = new Scanner(System.in);

        System.out.print(" Your Math Grade : ");
        Math = inp.nextInt();

        System.out.print(" Your Physics Grade : ");
        Phy = inp.nextInt();

        System.out.print(" Your Chemistry Grade : ");
        Chem = inp.nextInt();

        System.out.print(" Your Literature Grade : ");
        Lite = inp.nextInt();

        System.out.print(" Your History Grade : ");
        Hist = inp.nextInt();

        System.out.print(" Your Music Grade : ");
        Mus = inp.nextInt();

        int total = (Math + Phy + Chem + Lite + Hist + Mus);
        double outcome = total / 6.0;
        boolean cond1 = outcome >= 60;
        String str = cond1 ? "Passed" : "Failed";
        System.out.println(outcome);
        System.out.println(str);

    }
}