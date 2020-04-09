public class checkDie {
    private Bird chim = new Bird();
    private OngNuoc ongnuoc = new OngNuoc();
    public boolean chet()
    {
        if(chim.getY()>280) return true; // khi con chim chạm dất

        // Cột trên 1
        if(((chim.getY()+20<= ongnuoc.getH1()) && (ongnuoc.getX1()==205)) || (chim.getY()==ongnuoc.getH1())&&(85<=ongnuoc.getX1() && ongnuoc.getX1()<=150)) return true;
        // Cột dưới 1
        if(((chim.getY()==ongnuoc.getH1()+50)&&(85<=ongnuoc.getX1() && ongnuoc.getX1()<=150)) || ((chim.getY()>= ongnuoc.getH1()+100) && (ongnuoc.getX1()==170))) return true;

        if(((chim.getY()+20<= ongnuoc.getH2()) && (ongnuoc.getX2()==205)) || (chim.getY()==ongnuoc.getH2())&&(85<=ongnuoc.getX2() && ongnuoc.getX2()<=150)) return true;
        if(((chim.getY()==ongnuoc.getH2()+50)&&(85<=ongnuoc.getX2() && ongnuoc.getX2()<=150)) || ((chim.getY()>= ongnuoc.getH2()+100) && (ongnuoc.getX2()==170))) return true;

        if(((chim.getY()+20<= ongnuoc.getH3()) && (ongnuoc.getX3()==205)) || (chim.getY()==ongnuoc.getH3())&&(85<=ongnuoc.getX3() && ongnuoc.getX3()<=150)) return true;
        if(((chim.getY()==ongnuoc.getH3()+50)&&(85<=ongnuoc.getX3() && ongnuoc.getX3()<=150)) || ((chim.getY()>= ongnuoc.getH3()+100) && (ongnuoc.getX3()==170))) return true;



        return false;
    }

}
