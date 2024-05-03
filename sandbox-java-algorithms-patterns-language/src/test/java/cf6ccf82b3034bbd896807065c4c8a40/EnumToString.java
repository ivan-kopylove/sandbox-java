package com.github.ivan.kopylove.challenges.cf6ccf82b3034bbd896807065c4c8a40;

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
