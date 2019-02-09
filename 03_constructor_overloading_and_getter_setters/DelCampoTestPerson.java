/*
2015-12593
Programming Assignment 3
Compiled/Tested using Java 8
*/

class DelCampoTestPerson
{
    public static void main(String args[])
    {
        DelCampoPerson hero0 = new DelCampoPerson();
        DelCampoPerson hero1 = new DelCampoPerson("Jose");
        DelCampoPerson hero2 = new DelCampoPerson("SacXY", "Sacrificer");
        DelCampoPerson hero3 = new DelCampoPerson("Pudge", "Butcher", "a cleaver");

        System.out.println();
        System.out.println("--- Constructors");
        System.out.println("  hero0 = " + hero0.getVariables());
        System.out.println("  hero1 = " + hero1.getVariables());
        System.out.println("  hero2 = " + hero2.getVariables());
        System.out.println("  hero3 = " + hero3.getVariables());
        System.out.println();

        /* --- TESTING using hero0 -----------------------------------
        1. Print test name
        2. Set a variable using setter
        3.
            a) Get value of variable in #2 using getter
            b) Check if value was correctly set
        */

        System.out.println("--- Testing getters and setters (using hero0)");

        /* 1 */ System.out.print("  TEST ActualName          ");
        /* 2 */ hero0.setActualName("Alvin");
        /* 3 */ printResult(hero0.getActualName() == "Alvin");

        /* 1 */ System.out.print("  TEST SuperCoolName       ");
        /* 2 */ hero0.setSuperCoolName("Chipmunk");
        /* 3 */ printResult(hero0.getSuperCoolName() == "Chipmunk");

        /* 1 */ System.out.print("  TEST WeaponType          ");
        /* 2 */ hero0.setWeaponType("music");
        /* 3 */ printResult(hero0.getWeaponType() == "music");

        /* 1 */ System.out.print("  TEST NumPeopleKilled     ");
        /* 2 */ hero0.setNumPeopleKilled(911);
        /* 3 */ printResult(hero0.getNumPeopleKilled() == 911);

        /* 1 */ System.out.print("  TEST Emotion             ");
        /* 2 */ hero0.setEmotion("VERY VERY HAPPY");
        /* 3 */ printResult(hero0.getEmotion() == "VERY VERY HAPPY");

        System.out.println("  hero0 = " + hero0.getVariables());
        
    }

    public static void printResult(boolean passed)
    {
        System.out.println(passed ? "passed" : "failed");
    }
}