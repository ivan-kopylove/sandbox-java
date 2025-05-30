package heap.a4e1f984f3bdc1f642f2fd6b5320c1959;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BitFieldExampleTest
{
    private static final int MAGIC        = 1; // power of 0
    private static final int AGILITY      = 2; // power of 1
    private static final int INTELLIGENCE = 4; // power of 2
    private static final int CHARISMA     = 8; // power of 3
    private static final int WILLPOWER    = 16;// power of 4
    private static final int POWER        = 32;// power of 5

    private static final long REGENERATION = 8589934592L; // power of 33
    private static final long STAMINA      = 9223372036854775807L; //power of 63

    @Test
    void set_flag_1()
    {
        int combined = POWER | WILLPOWER;

        assertEquals(16 + 32, combined);
        assertEquals("100000", Integer.toBinaryString(POWER));
        assertEquals("010000", fillNumberWithLeadingZeroes(6, Integer.toBinaryString(WILLPOWER)));
        assertEquals("110000", Integer.toBinaryString(combined));
    }

    private String fillNumberWithLeadingZeroes(int length, String s)
    {
        return String.format("%" + length + "s", s)
                     .replace(' ', '0');
    }

    @Test
    void leading_zero_is_negative_flag()
    {
        int to_31_power = Integer.MAX_VALUE; // 2147483647;
        int to_31_power_negative = Integer.MIN_VALUE; // -2147483648;

        assertEquals("01111111111111111111111111111111",
                     fillNumberWithLeadingZeroes(32, Integer.toBinaryString(to_31_power)));
        assertEquals("10000000000000000000000000000000",
                     fillNumberWithLeadingZeroes(32, Integer.toBinaryString(to_31_power_negative)));
    }

    @Test
    void leading_zero_is_negative_flag_long()
    {
        long to_63_power = Long.MAX_VALUE;
        long to_63_power_negative = Long.MIN_VALUE;

        assertEquals("0111111111111111111111111111111111111111111111111111111111111111",
                     fillNumberWithLeadingZeroes(64, Long.toBinaryString(to_63_power)));
        assertEquals("1000000000000000000000000000000000000000000000000000000000000000",
                     Long.toBinaryString(to_63_power_negative));
    }

    @Test
    void set_flag_long()
    {
        long combined = POWER | REGENERATION;

        assertEquals("1000000000000000000000000000000000", Long.toBinaryString(REGENERATION));
        assertEquals("0000000000000000000000000000100000", fillNumberWithLeadingZeroes(34, Long.toBinaryString(POWER)));
        assertEquals("1000000000000000000000000000100000", Long.toBinaryString(combined));
        assertEquals(8589934592L + 32, combined);
    }

    @Test
    void leadingBit()
    {
        long attributes = STAMINA | REGENERATION;


        assertEquals("111111111111111111111111111111111111111111111111111111111111111",
                     Long.toBinaryString(Long.MAX_VALUE));
        assertEquals("111111111111111111111111111111111111111111111111111111111111111", Long.toBinaryString(STAMINA));
        assertEquals("000000000000000000000000000001000000000000000000000000000000000",
                     fillNumberWithLeadingZeroes(63, Long.toBinaryString(REGENERATION)));
        assertEquals("111111111111111111111111111111111111111111111111111111111111111",
                     Long.toBinaryString(attributes));
        assertEquals(Long.MAX_VALUE, attributes);
    }

    @Test
    void set_flag_2()
    {
        int attributes = POWER | WILLPOWER;
        attributes |= CHARISMA;

        assertEquals("100000", Integer.toBinaryString(POWER));
        assertEquals("010000", fillNumberWithLeadingZeroes(6, Integer.toBinaryString(WILLPOWER)));
        assertEquals("001000", fillNumberWithLeadingZeroes(6, Integer.toBinaryString(CHARISMA)));

        assertEquals(8 + 16 + 32, attributes);
    }

    @Test
    void unset_flag()
    {
        int attributes = POWER | WILLPOWER;
        attributes &= ~WILLPOWER;

        assertEquals(16 + 32 - 16, attributes);

        assertEquals("100000", Integer.toBinaryString(POWER));
        assertEquals("010000", fillNumberWithLeadingZeroes(6, Integer.toBinaryString(WILLPOWER)));
        assertEquals("100000", Integer.toBinaryString(attributes));
    }
}
