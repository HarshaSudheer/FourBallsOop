public class Circles {
    int xPos;
    int height;
    int speed;
    public Circles(int height, int speed){
        xPos=0;
        this.height=height;
        this.speed=speed;
    }
    public void updateXPos(){
        xPos+=speed;
    }
}
