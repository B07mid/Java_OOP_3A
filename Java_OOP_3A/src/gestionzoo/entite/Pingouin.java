package gestionzoo.entite;
public class Pingouin extends Aquatic{
    protected float swimmingDepth;
    public Pingouin(){}
    public Pingouin(String family, String name, int age, boolean ismammal, String habitat, float swimmingDepth)
    {
        super(family, name, age, ismammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }
    @Override
    public String toString(){
        return super.toString() + ", Swimming Depth: " + this.swimmingDepth;
    }
}
