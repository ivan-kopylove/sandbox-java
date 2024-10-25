package acaf073ad95f029042ea7071fd12917cf;

import java.util.Date;

class ComparableObject
{

    private String str;
    private Date   date;
    private int    num;

    public ComparableObject(String str, Date date, int num)
    {
        this.str = str;
        this.date = date;
        this.num = num;
    }

    public String getStr()
    {
        return str;
    }

    public void setStr(String str)
    {
        this.str = str;
    }

    public Date getDate()
    {
        return date;
    }

    public void setDate(Date date)
    {
        this.date = date;
    }

    public int getNum()
    {
        return num;
    }

    public void setNum(int num)
    {
        this.num = num;
    }
}
