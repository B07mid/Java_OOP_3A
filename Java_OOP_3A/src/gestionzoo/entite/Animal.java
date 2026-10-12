package gestionzoo.entite;
sealed public class Animal permits Aquatic,Terrestrial 
{
    protected String family ;
    protected String name ;
    protected int age ;
    protected boolean ismammal ;

    public Animal(){};
    public Animal(String family, String name, int age, boolean ismammal)
    {
        this.family = family ;
        this.name = name ;
        this.age = age ;
        this.ismammal = ismammal ;
    }

    @Override
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