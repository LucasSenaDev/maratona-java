package academy.devdojo.maratonajava.javacore.Npolimorfismo.domain;

public class Tomato extends Product{
    public static final double TAX_PERCENTAGE = 0.06;
    private String ExpirationDate;
    public Tomato(String name, double value) {
        super(name, value);
    }

    @Override
    public double calculeTax() {
        System.out.println("Calculating tomato tax");
        return this.value * TAX_PERCENTAGE;
    }

    public String getExpirationDate() {
        return ExpirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        ExpirationDate = expirationDate;
    }
}
