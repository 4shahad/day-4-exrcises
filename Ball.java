package T2B3;

public class Ball {
    float x;
    float y;
    int redius;
    float xdelta;
    float ydelta;

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setRedius(int redius) {
        this.redius = redius;
    }

    public void setXdelta(float xdelta) {
        this.xdelta = xdelta;
    }

    public void setYdelta(float ydelta) {
        this.ydelta = ydelta;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public int getRedius() {
        return redius;
    }

    public float getXdelta() {
        return xdelta;
    }

    public float getYdelta() {
        return ydelta;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "x=" + x +
                ", y=" + y +
                ", redius=" + redius +
                ", xdelta=" + xdelta +
                ", ydelta=" + ydelta +
                '}';
    }

    public Ball(float x, float y, int redius, float xdelta, float ydelta) {
        this.x = x;
        this.y = y;
        this.redius = redius;
        this.xdelta = xdelta;
        this.ydelta = ydelta;

    }
    public void move(){
        x+=xdelta;
        y+=ydelta;
    }

    public void reflectVertical(){
        y=-(ydelta);
    }
    public void reflectHorizental(){
        x=-(xdelta);
    }
}
