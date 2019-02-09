class DelCampoPerson
{
    // --- Variables ---------------------
    private String actualName;
    private String superCoolName;
    private String weaponType;
    private int numPeopleKilled;
    private String emotion;

    // --- Constructors ------------------

    DelCampoPerson()
    {
    }
    DelCampoPerson(String actualName)
    {
        setActualName(actualName);
    }
    DelCampoPerson(String actualName, String superCoolName)
    {
        setActualName(actualName);
        setSuperCoolName(superCoolName);
    }
    DelCampoPerson(String actualName, String superCoolName, String weaponType)
    {
        setActualName(actualName);
        setSuperCoolName(superCoolName);
        setWeaponType(weaponType);
    }
    
    // --- Getters/Setters --------------

    public String getActualName() 
    {
        return actualName;
    }
    public void setActualName(String actualName) 
    {
        this.actualName = actualName;
    }

    public String getSuperCoolName() 
    {
        return superCoolName;
    }
    public void setSuperCoolName(String superCoolName) 
    {
        this.superCoolName = superCoolName;
    }
    
    public String getWeaponType() 
    {
        return weaponType;
    }
    public void setWeaponType(String weaponType) 
    {
        this.weaponType = weaponType;
    }

    public int getNumPeopleKilled() 
    {
        return numPeopleKilled;
    }
    public void setNumPeopleKilled(int numPeopleKilled) 
    {
        this.numPeopleKilled = numPeopleKilled;
    }

    public String getEmotion() 
    {
        return emotion;
    }
    public void setEmotion(String emotion) 
    {
        this.emotion = emotion;
    }

    // Return the list of variable values as a string
    public String getVariables()
    {
        return "{" 
            + actualName + ", " 
            + superCoolName  + ", "
            + weaponType  + ", "
            + numPeopleKilled  + ", "
            + emotion +
        "}";
    }
}