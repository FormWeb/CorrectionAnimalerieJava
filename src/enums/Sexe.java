package enums;

public enum Sexe {
    MALE, FEMELLE;

    public static Sexe convert(String sexe) {
        if (sexe.equals("m")) {
            return Sexe.MALE;
        }
        else if (sexe.equals("f")) {
            return Sexe.FEMELLE;
        }
        else {
            return Sexe.MALE;
        }
    }
}
