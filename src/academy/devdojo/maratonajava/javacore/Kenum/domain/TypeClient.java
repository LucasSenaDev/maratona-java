package academy.devdojo.maratonajava.javacore.Kenum.domain;

public enum TypeClient {
    NATURAL_PERSON(1),
    LEGAL_PERSON(2);

    private final int value;
    TypeClient(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
