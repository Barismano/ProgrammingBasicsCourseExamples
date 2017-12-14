package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args)
    {

        
    Boxer d = new Boxer("Nikola",999999);
    Boxer dd= new Boxer("Angel",99);

    Boxer winner = fight(d,dd);

    }
    public static Boxer fight(Boxer first, Boxer second)
    {
        if(first.getPower()>second.getPower())
            return first;
        else if(first.getPower()<second.getPower())
            return second;
        return null;
    }

}
class Boxer
{
    private String name;
    private int power;

    Boxer(String name,int power)
    {
        setName(name);
        setPower(power);
    }

    public int getPower() {
        return power;
    }

    public String getName() {
        return name;
    }
    public void setPower(int power)
    {
        if(power>100)
            power=100;
        if(power<0)
            power=0;
        this.power=power;
    }
    public void setName(String name)
    {

        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i)>='0'&&name.charAt(i)<='9')
            {
                name="NullBoxer";
                break;
            }

        }
        if(name=="")
            name="NullBoxer";

        this.name=name;
    }
}
