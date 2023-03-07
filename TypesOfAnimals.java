class Animal
{
    public void eat()
    {
        System.out.println("Eating the food");
    }
}
class Herbivores extends Animal
{
    public void eat()
    {
        System.out.println("Eating plants only");
    }
}
class Carnivores extends Animal
{
    public void eat()
    {
        System.out.println("Eating meat only");
    }
}
class Omnivores extends Animal
{
    public void eat()
    {
        System.out.println("Eating both plants and meat");
    }
}
public class TypesOfAnimals {
    public static void main(String args[])
    {
        Animal a=new Animal();
        a.eat();
        Herbivores h=new Herbivores();
        h.eat();
        Carnivores c=new Carnivores();
        c.eat();
        Omnivores o=new Omnivores();
        o.eat();
    }
}
