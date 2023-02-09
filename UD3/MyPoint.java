public class MyPoint {
    
    private int x;
    private int y;

    public MyPoint(){
        x = 0;
        y = 0;
    }

    public MyPoint(int x,int y){
        this.x = x;
        this.y = y;
    }
    
    public String toString(){
        return "(" + x + "," + y + ")";
    }

    public double distance(){
        double dx, dy, d;
        dx = Math.pow(this.x - 0,2);
        dy = Math.pow(this.y - 0,2);

        d = Math.sqrt(dx - dy);

        return d;
    }
    
    public double distance(MyPoint another){
        double dx, dy, d;
        dx = Math.pow(this.x - another.x,2);
        dy = Math.pow(this.y - another.y,2);

        d = Math.sqrt(dx - dy);

        return d;        
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public int[] getXY(){
        int[] arrai = {x , y};
        return arrai;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) //this aldagaiak apuntatzen al du obj aldagaiak apuntatzen duen leku berdinera?
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        MyPoint other = (MyPoint) obj;
        if (x != other.x)
            return false;
        if (y != other.y)
            return false;
        return true;
    }
    
}
