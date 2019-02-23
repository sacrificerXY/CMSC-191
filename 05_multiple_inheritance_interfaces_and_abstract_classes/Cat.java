public class Cat extends Animal implements Pet
{
    private String name;

    Cat(String name)
    {
        super(4); // legs
        this.name = name;
    }

    Cat()
    {
        this("");
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void play()
    {
        System.out.println("Cat.play: \tplaying with severed head of owner :)");
    }

    public void eat()
    {
        System.out.println("Cat.eat: \tfeasting on our neighbors dismembered torso");
    }
}