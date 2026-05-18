package academy.devdojo.maratonajava.javacore.Kenum.domain;

public enum TypeClient {
    NATURAL_PERSON(1, "Natural Person"),
    LEGAL_PERSON(2, "Legal Person");

    private final int value;
    private String relatoryName;
    TypeClient(int value, String relatoryName) {
        this.value = value;
        this.relatoryName = relatoryName;
    }

    public static TypeClient typeClientforRelatoryName(String relatoryName) {
        for (TypeClient typeClient: values()) {
            if(typeClient.getRelatoryName().equals(relatoryName)){
                return typeClient;
            }
        }
        return null;
    }

    public String getRelatoryName() {
        return relatoryName;
    }

    public int getValue() {
        return value;
    }
}
