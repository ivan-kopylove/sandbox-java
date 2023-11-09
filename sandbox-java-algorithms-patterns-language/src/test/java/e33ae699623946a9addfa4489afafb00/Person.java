package e33ae699623946a9addfa4489afafb00;

class Person
{
    private String givenName;
    private String surName;
    private int    age;

    Person(String givenName, String surName, int age)
    {
        this.givenName = givenName;
        this.surName = surName;
        this.age = age;
    }

    public String getGivenName()
    {
        return givenName;
    }

    public void setGivenName(String givenName)
    {
        this.givenName = givenName;
    }

    public String getSurName()
    {
        return surName;
    }

    public void setSurName(String surName)
    {
        this.surName = surName;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
}
