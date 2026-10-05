package gestionzoo.entite;
public class Animal
{
    private String family ;
    private String name ;
    private int age ;
    private boolean ismammal ;

    public Animal(){};
    public Animal(String family, String name, int age, boolean ismammal)
    {
        this.family = family ;
        this.name = name ;
        this.age = age ;
        this.ismammal = ismammal ;
    }

    public String toString()
    {
        return "Animal Name: " + this.name + ", Family: " + this.family + ", Age: " + this.age + ", Is Mammal: " + this.ismammal;
    }

    public String getFamily() {
        return family;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public boolean isIsmammal() {
        return ismammal;
    }

}