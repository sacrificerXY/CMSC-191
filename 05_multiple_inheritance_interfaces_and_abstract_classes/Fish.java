public class Fish extends Animal implements Pet
{
    private String name;
    Fish()
    {
        super(0); //legs                                                                                                                                                                                                                        
    }

    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void play()
    {
        System.out.println("Fish.play: \tplaying with silenced shotgun. OOPS! Accidentally killed Chuck Norris");
    }

    public void eat()
    {
        System.out.println("Fish.eat: \tDining in 'Assasins R us'");
    }

    @Override
    public void walk()
    {
        System.out.println("Fish.walk: \tCan't walk but can swim. Zero legs for maximum stealth.");
    }
}