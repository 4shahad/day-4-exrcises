package T2B3;

public class MyPoint {
    int x = 0;
    int y = 0 ;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public int[] getXY() {
        int arry[]={x,y};
        return arry;
    }
    public void setXY(int x , int y) {
        this.x = x;
        this . y = y ;
    }


    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "MyPoint{" +"("+
                x +","+ y +")"+
                '}';
    }

    public double distance(int x2 , int y2 ){
      double dis1 = x2-x;
      double dis2 = y2-y ;
      double thedis= (dis2*dis2)+(dis1*dis1);
     return Math.sqrt(thedis);
    }
    public double distance2(MyPoint another ){
        double dis1=another.x-x ;
        double dis2=another.y-y  ;
        double thedis= (dis2*dis2)+(dis1*dis1);
        return Math.sqrt(thedis);
    }
    public double distance3(){
        double dis1=0-x ;
        double dis2=0-y  ;
        double thedis= (dis2*dis2)+(dis1*dis1);
        return Math.sqrt(thedis);
    }


}
