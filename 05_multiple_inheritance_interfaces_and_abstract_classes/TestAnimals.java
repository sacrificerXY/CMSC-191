public class TestAnimals
{
    public static void main(String args[])
    {
        Fish f = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a1 = new Fish();
        Animal a2 = new Spider();
        Pet p = new Cat();

        printSection("A. Calling Functions");
        // Calling functions
        System.out.println("Fish a");
        testFish(f);
        System.out.println();
        System.out.println("Cat c");
        testCat(c);
        System.out.println();
        System.out.println("Animal a1");
        testAnimal(a1);
        System.out.println();
        System.out.println("Animal a2");
        printLineLong();
        testAnimal(a1);
        System.out.println();
        System.out.println("Pet p");
        testPet(p);
        System.out.println();

        printSection("B. Casting");
        // Casting Fish f
        // Source: Rivas & Orioque 
        Animal castAnimal   = ((Animal)f);    // cast Fish f -> Animal
        Pet castPet         = ((Pet)f);       // cast Fish f -> Pet
        // Spider castSpider   = ((Spider)f);    // cast Fish f -> Spider -- DOES NOT WORK
        // Cat castCat         = ((Cat)f);       // cast Fish f -> Cat    -- DOES NOT WORK
        Fish castFish       = ((Fish)f);      // cast Fish f -> Fish      -- Already a fish

        System.out.println("Fish --> Animal castAnimal");
        testAnimal(castAnimal);
        System.out.println();
        System.out.println("Fish --> Pet castPet");
        testPet(castPet);
        System.out.println();
        System.out.println("Fish --> Spider castFish");
        System.out.println("  !! Can't cast");
        System.out.println();
        System.out.println("Fish --> Cat castFish");
        System.out.println("  !! Can't cast");
        System.out.println();
        System.out.println("Fish --> Fish castFish");
        testFish(castFish);
        System.out.println();


        printSection("C. Polymorphism");
        // Polymorphism
        Animal polyAnimal   = f; 
        Pet polyPet         = f; 
        // Spider polySpider   = f;    // DOES NOT WORK
        // Cat polyCat         = f;    // DOES NOT WORK
        Fish polyFish       = f;      // Already a fish

        System.out.println("Fish > Animal polyAnimal");
        testAnimal(polyAnimal);
        System.out.println();
        System.out.println("Fish > Pet polyPet");
        testPet(polyPet);
        System.out.println();
        System.out.println("Fish > Spider polySpider");
        System.out.println("  !! Does not work");
        System.out.println();
        System.out.println("Fish > Cat polyCat");
        System.out.println("  !! Does not work");
        System.out.println();
        System.out.println("Fish > Fish polyFish");
        testFish(polyFish);
        System.out.println();
    }

    public static void testAnimal(Animal a)
    {
        // call walk
        // call eat

        System.out.println("  test Animal");
        printLineShort();
        printArrow();
        a.walk();
        printArrow();
        a.eat();
    }

    public static void testPet(Pet pet)
    {
        // assign a name
        // print the name
        // call play

        System.out.println("  test Pet");
        printLineShort();
        printArrow();
        pet.setName("George");
        System.out.println("Pet.name: \t" + pet.getName());
        printArrow();
        pet.play();
    }

    public static void testCat(Cat cat)
    {
        // assign a name
        // print the name
        // call play
        // call walk
        // call eat

        System.out.println("  test Cat");
        printLineShort();
        printArrow();
        cat.setName("George");
        System.out.println("Pet.name: \t" + cat.getName());
        printArrow();
        cat.play();
        printArrow();
        cat.walk();
        printArrow();
        cat.eat();
    }

    public static void testFish(Fish fish)
    {
        // assign a name
        // print the name
        // call play
        // call walk
        // call eat

        System.out.println("  test Cat");
        printLineShort();
        printArrow();
        fish.setName("George");
        System.out.println("Pet.name: \t" + fish.getName());
        printArrow();
        fish.play();
        printArrow();
        fish.walk();
        printArrow();
        fish.eat();
    }

    public static void printArrow()
    {
        System.out.print("   |-> ");
    }

    public static void printLineLong()
    {
        System.out.println("-----------------");
    }
    public static void printLineShort()
    {
        System.out.println("  -----------");
    }
    public static void printSection(String section)
    {
        System.out.println("====================================\n"+section+"\n====================================");
    }
}