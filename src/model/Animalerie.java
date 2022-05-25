package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Animalerie {
    private ArrayList<Animal> animaux;

    public Animalerie() {
        this.animaux = new ArrayList<>();
    }

    public ArrayList<Animal> getAnimaux() {
        return animaux;
    }

    public void addAnimal(Animal animal) {
        this.animaux.add(animal);
    }

    public int getNbrChien() {
        int count = 0;
        for (Animal a : this.animaux) {
            if (a instanceof Chien) {
                count++;
            }
        }
        return count;
    }

    public int getNbrChat() {
        int count = 0;
        for (Animal a : this.animaux) {
            if (a instanceof Chat) {
                count++;
            }
        }
        return count;
    }

    public int getNbrOiseau() {
        int count = 0;
        for (Animal a : this.animaux) {
            if (a instanceof Oiseau) {
                count++;
            }
        }
        return count;
    }

    private void afficherMort() {
        for (Animal a : this.animaux) {
            if (a.isDead()) {
                System.out.println(a.getName() + " is dead !");
            }
        }
        System.out.println("-----------------------");
    }

    public void passerNuit() {
        for (Animal a : this.animaux) {
            a.passerNuit();
        }

        this.afficherMort();

        // stream().filter() permet de filtrer la liste
        List<Animal> newList = this.animaux
                .stream()
                .filter(animal -> !animal.isDead())
                .toList(); // Si !animal.isDead() est faux, je vire l'animal de la liste

        // Demo map

//        List<Integer> nbr = Arrays.asList(1, 2, 3, 4);
//
//        List<Integer> newNbr = nbr.stream()
//                .map(a -> a + 2)
//                .toList();

        this.animaux = new ArrayList<>(newList);
    }

    public void listerCarac() {
        for (Animal a : this.animaux) {
            System.out.println(a);
            System.out.println("------------------");;
        }
    }
}
