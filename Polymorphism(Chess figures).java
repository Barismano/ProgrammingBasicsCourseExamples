package com.company;


import com.sun.xml.internal.ws.server.ServerRtException;
import sun.net.www.protocol.https.AbstractDelegateHttpsURLConnection;
import sun.plugin2.util.PojoUtil;

import javax.swing.*;
import javax.xml.XMLConstants;
import javax.xml.bind.SchemaOutputResolver;
import java.time.Period;
import java.util.Arrays;
import java.util.Currency;
import java.util.Scanner;


public class Main
{
    public static void main(String[] args)
    {
        Figure[] figures = new Figure[4];
        figures[0]=new Rook(3,3);
        figures[1]=new Rook(5,5);
        System.out.println(figures[0].Move(3,4));
    }
}
abstract class Figure
{
 int Xcoord;
 int Ycoord;
  Figure(int x,int y)
 {
     Xcoord=x;
     Ycoord=y;
 }
 abstract boolean Move(int x,int y);

}
class Knight extends Figure
{
    Knight(int x,int y)
    {
        super(x,y);
    }
    @Override
    boolean Move(int x,int y)
    {
        int[] xMovement={1,1,-1,-1,-2,2,-2,2};
        int[] yMovement={-2,2,-2,2,1,1,-1,-1};
        for (int i = 0; i < 8; i++)
        {
            if(x==Xcoord+xMovement[i]&&y==Ycoord+yMovement[i])
            {
                Xcoord=x;
                Ycoord=y;
                return true;
            }
        }
        return false;

    }
}
class Rook extends Figure
{
    Rook(int x,int y)
    {
        super(x,y);
    }
    @Override
    boolean Move(int x, int y)
    {
        if(x==Xcoord||y==Ycoord)
        {
            Xcoord=x;
            Ycoord=y;
            return true;
        }
        return false;
    }
}


