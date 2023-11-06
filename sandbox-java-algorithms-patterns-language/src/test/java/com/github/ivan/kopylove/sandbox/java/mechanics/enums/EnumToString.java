package com.github.ivan.kopylove.sandbox.java.mechanics.enums;

public enum EnumToString
{
    MY_VALUE("QWERTY");

    private final String enumValue;

    EnumToString(String enumValue)
    {
        this.enumValue = enumValue;
    }

    public String getEnumValue()
    {
        return enumValue;
    }
}
