package com.github.ivan.kopylove.sandbox.java.dozermapper;

class MyDto
{
    private String key;
    private String value;
    private String myCustomValue;

    public MyDto(String key, String value, String myCustomValue)
    {
        this.key = key;
        this.value = value;
        this.myCustomValue = myCustomValue;
    }

    public String getKey()
    {
        return key;
    }

    public void setKey(String key)
    {
        this.key = key;
    }

    public String getValue()
    {
        return value;
    }

    public void setValue(String value)
    {
        this.value = value;
    }

    public String getMyCustomValue()
    {
        return myCustomValue;
    }

    public void setMyCustomValue(String myCustomValue)
    {
        this.myCustomValue = myCustomValue;
    }
}
