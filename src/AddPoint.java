public class AddPoint {
    private static int point=0;
    private static boolean bl1=false,bl2=false,bl3=false;
    private OngNuoc ongnuoc = new OngNuoc();
    private Bird chim = new Bird();

    public static int getPoint() {
        return point;
    }

    public void AddPoint()
    {
        if((ongnuoc.getX1() < 170) && (ongnuoc.getX1()>85)) bl1 = true;
        if(bl1==true && (ongnuoc.getX1() +65 <150)) {
            point++;
            bl1 = false;
        }

        if((ongnuoc.getX2() < 170) && (ongnuoc.getX2()>85)) bl2 = true;
        if(bl2==true && (ongnuoc.getX2() +65 <150)) {
            point++;
            bl2 = false;
        }

        if((ongnuoc.getX3() < 170) && (ongnuoc.getX3()>85)) bl3 = true;
        if(bl3==true && (ongnuoc.getX3() +65 <150)) {
            point++;
            bl3 = false;
        }
    }

}
