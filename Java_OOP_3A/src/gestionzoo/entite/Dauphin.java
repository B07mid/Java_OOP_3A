package gestionzoo.entite;
public class Dauphin extends Aquatic{
    protected float swimmingSpeed;
    public Dauphin(){

    }
    public Dauphin(String family, String name, int age, boolean ismammal, String habitat, float swimmingSpeed)
    {
        super(family, name, age, ismammal, habitat);
        this.swimmingSpeed= swimmingSpeed;
    } 
    @Override
    public String toString(){
        return super.toString() + ", Swimming Speed: " + this.swimmingSpeed;
    }
    @Override
    public void swim()
    {
        System.out.println("This dolphin is swimming.");
    }
}
