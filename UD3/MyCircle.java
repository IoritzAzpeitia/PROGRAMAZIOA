public class MyCircle {
    private MyPoint center;
    private int radius = 1;

    public MyCircle(){
        center = new MyPoint(0,0);
        radius = 1;
    }

    public MyCircle(int x,int y, int radius){
        this.radius = radius;
        this.center.setXY(x, y);
    }

    public MyCircle(MyPoint center, int radius) {
        this.radius = radius;
        this.center = center;
    }    

    public double distance(MyCircle another){
        double 

        
    }

}
