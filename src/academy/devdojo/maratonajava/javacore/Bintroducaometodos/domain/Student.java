package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain;

public class Student {
    public String name;
    public Integer age;
    public Character sex;

    public void imprime() {
        System.out.println("------------------");
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.sex);
    }
}
