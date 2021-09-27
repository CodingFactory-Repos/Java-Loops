package me.loule;

public class Main {

    public static void main(String[] args) {
        // Clear console
        System.out.print("\033[H\033[2J");

        /////////////////////
        /* Exercise Loops */
        ///////////////////

        // Affichez tous les nombres entre 0 et 100 inclus, par ordre croissant
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }

        // Affichez tous les nombres entre 0 et 100 inclus, par ordre décroissant
        for (int i = 100; i >= 0; i--) {
            System.out.println(i);
        }

        // Affichez tous les nombres multiples de 3 entre 0 et 100 par ordre croissant
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }

        // Calculez ab (a puissance b) en utilisant des multiplications successives
        int a = 2;
        for (int b = 0; b <= 10; b++) {
            System.out.println(Math.pow(a, b));
        }

        // Affichez la table de multiplication de la valeur d'une variable
        int c = 5;
        for (int i = 0; i <= 10; i++) {
            System.out.println(c + " x " + i + " = " + c * i);
        }

        // Calculez la somme des entiers de 1 à N, et stoppez votre programme si cette somme dépasse la valeur M
        int n = 10;
        int m = 50;
        int somme = 0;

        for (int i = 1; i <= n; i++) {
            somme += i;
            if (somme > m) {
                System.out.println("La somme des entiers de 1 à " + n + " dépasse " + m);
                break;
            }
        }

        // Affichez le miroir d'une String (ex : pour une valeur de "Coding", affichez "gnidoC")
        String str = "Coding";
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
            System.out.println();
        }

    }
}
