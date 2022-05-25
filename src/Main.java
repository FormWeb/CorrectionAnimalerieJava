import enums.Caractere;
import enums.Sexe;
import model.Animalerie;
import model.Chat;
import model.Chien;
import model.Oiseau;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Chien ch1 = new Chien("Rex", 10, 100, Sexe.MALE, LocalDate.of(2016, 3, 3), "Jaune", "Labrador", true);
        Chat chat1 = new Chat("Felix", 8, 50, Sexe.MALE, LocalDate.of(2016, 8, 8), false, Caractere.CALIN, true);
        Oiseau o1 = new Oiseau("Titi", 1, 5, Sexe.MALE, LocalDate.of(2015, 1, 1), "Jaune", false);
        Animalerie animalerie = new Animalerie();
        animalerie.addAnimal(ch1);
        animalerie.addAnimal(chat1);
        animalerie.addAnimal(o1);

        int choix = -1;

        while (choix != 4) {
            System.out.println("Que voulez-vous faire ?\n" +
                    "1. Encoder un animal\n" +
                    "2. Lister les animaux\n" +
                    "3. Passer la nuit\n" +
                    "4. Quitter");
            choix = Integer.parseInt(sc.nextLine());

            switch (choix) {
                case 1:
                    encoderAnimal(animalerie);
                    break;
                case 2:
                    listerAnimaux(animalerie);
                    break;
                case 3:
                    passerNuit(animalerie);
                    break;
                case 4:
                    System.out.println("Au revoir");
                    break;
                default:
                    System.out.println("Incorrect");
                    break;
            }
        }
    }

    private static void passerNuit(Animalerie animalerie) {
        animalerie.passerNuit();
    }

    private static void listerAnimaux(Animalerie animalerie) {
        animalerie.listerCarac();
    }

    private static void encoderAnimal(Animalerie animalerie) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quel animal voulez-vous encoder ? (chat, chien, oiseau)");
        String espece = scanner.nextLine();

        System.out.print("Nom : ");
        String nom = scanner.nextLine();

        System.out.print("Poids : ");
        int poids = Integer.parseInt(scanner.nextLine());

        System.out.print("Taille : ");
        int taille = Integer.parseInt(scanner.nextLine());

        System.out.print("Sexe (m/f) : ");
        Sexe sexe = Sexe.convert(scanner.nextLine());

        System.out.print("Date de naissance (yyyy-mm-dd) :");
        LocalDate dateNaissance = LocalDate.parse(scanner.nextLine());

        switch (espece) {
            case "chat":
                System.out.print("Poil long (true/false) : ");
                boolean poilLong = Boolean.parseBoolean(scanner.nextLine());

                System.out.print("Caractère (energique, farouche, calin) :");
                Caractere caractere = Caractere.convert(scanner.nextLine());

                System.out.print("Griffe coupée (true/false) : ");
                boolean griffeCoupee = Boolean.parseBoolean(scanner.nextLine());

                Chat newChat = new Chat(nom, poids, taille, sexe, dateNaissance, poilLong, caractere, griffeCoupee);
                animalerie.addAnimal(newChat);
                break;
            case "chien":
                System.out.print("Couleur du collier : ");
                String couleurCollier = scanner.nextLine();

                System.out.print("Race : ");
                String race = scanner.nextLine();

                System.out.print("Dressé (true/false) : ");
                boolean dresse = Boolean.parseBoolean(scanner.nextLine());

                Chien newChien = new Chien(nom, poids, taille, sexe, dateNaissance, couleurCollier, race, dresse);
                animalerie.addAnimal(newChien);
                break;
            case "oiseau":
                System.out.print("Couleur : ");
                String couleur = scanner.nextLine();

                System.out.print("Volière (true) ou cage (false) : ");
                Boolean voliere = Boolean.parseBoolean(scanner.nextLine());

                Oiseau newOiseau = new Oiseau(nom, poids, taille, sexe, dateNaissance, couleur, voliere);
                animalerie.addAnimal(newOiseau);
        }
    }
}