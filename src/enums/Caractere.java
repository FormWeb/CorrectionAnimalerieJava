package enums;

public enum Caractere {
    ENERGIQUE, FAROUCHE, CALIN;

    public static Caractere convert(String caractere) {
        return switch (caractere) {
            case "energique" -> Caractere.ENERGIQUE;
            case "farouche" -> Caractere.FAROUCHE;
            case "calin" -> Caractere.CALIN;
            default -> Caractere.CALIN;
        };
    }
}
