public class Main
{

    public static void main(String[] args)
    {

    }

}
class point
{
    int x;
    int y;
    static int a;
    void doSomething()
    {

    }
    point(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
}
class Rect
{
     point p1;
     point p2;
     point p3;
     point p4;
    Rect(int x1,int y1,int x2,int y2)
    {
        p1=new point(x1,y1);
        p2=new point(x2,y2);
        p3=new point(x1,y2);
        p4=new point(x2,y1);
    }
 static boolean hasIntersection(Rect first,Rect second)
 {
        if(isPointInRect(first.p1,second)||isPointInRect(first.p2,second)||isPointInRect(first.p3,second)||isPointInRect(first.p4,second))
            return true;
        return false;
 }
    public static boolean isPointInRect(point tochica, Rect prawougulnik) {
        boolean isByYOK = tochica.y >= Math.min(prawougulnik.p1.y, prawougulnik.p2.y) && (tochica.y <= Math.max(prawougulnik.p1.y, prawougulnik.p2.y));
        boolean isByXOK = tochica.x >= Math.min(prawougulnik.p1.x, prawougulnik.p2.x) && (tochica.x <= Math.min(prawougulnik.p1.x, prawougulnik.p2.x));

        if (isByXOK && isByYOK)
            return true;
        return false;
    }
}


