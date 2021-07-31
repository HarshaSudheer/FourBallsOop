import processing.core.PApplet;

public class TryProcessingOop extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    Circles circles1= new Circles(HEIGHT/5,1);
    Circles circles2= new Circles(2*(HEIGHT/5),2);
    Circles circles3= new Circles(3*(HEIGHT/5),3);
    Circles circles4= new Circles(4*(HEIGHT/5),4);
    public static void main(String[] args){
        PApplet.main("TryProcessingOop",args);
    }
    @Override
    public void settings(){
        super.settings();
        size(WIDTH, HEIGHT);
    }
    @Override
    public void draw(){
        ellipse(circles1.xPos,circles1.height, DIAMETER,DIAMETER);
        circles1.updateXPos();
        ellipse(circles2.xPos,circles2.height,10,10);
        circles2.updateXPos();
        ellipse(circles3.xPos,circles3.height,10,10);
        circles3.updateXPos();
        ellipse(circles4.xPos,circles4.height,10,10);
        circles4.updateXPos();
    }
}
