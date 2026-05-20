package academy.devdojo.maratonajava.javacore.Npolimorfismo.domain;

public class Television extends Product{
    public static final double TAX_PERCENTAGE = 0.06;
    public Television(String name, double value) {
        super(name, value);
    }

    @Override
    public double calculeTax() {
        System.out.println("Calculating television tax");
        return this.value * TAX_PERCENTAGE;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getValue() {
        return super.getValue();
    }
}
