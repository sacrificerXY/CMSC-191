
abstract public class Animal
{
    protected int legs;

    protected Animal(int legs)
    {
        this.legs = legs;
    }

    abstract public void eat();

    public void walk()
    {
        System.out.println("Animal.walk: \twalking stupidly with " + legs + " legs.");
    }

}