import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Hogan, Kevin 6/20/2019
 */
public class Platform_00
{
    private static double[] pos = new double[] {0,0};
    double gravity = 9.8;
    double x1 = -300;
    double y1 = -300;
    double x2,y2;
    private static double GRAVITY = 9.8;
    int scale = 1;
    Entities Ball_1 = new Entities(3, 0, 0,15);

    static void drawGridCanvas()
    {
        double resolution_Width = 1280;
        double resolution_Height = 720;
        for (double i = 0; i < resolution_Width; i += 20) {
            if (i <= resolution_Height) {
                if (i == 0) {
                    StdDraw.setPenRadius(.005);
                } else
                    StdDraw.setPenRadius(.001);
                StdDraw.line(-resolution_Width / 2, i / 2, resolution_Width / 2, i / 2);
                StdDraw.line(-resolution_Width / 2, -i / 2, resolution_Width / 2, -i / 2);
            }
            if (i == 0) {
                StdDraw.setPenRadius(.005);
            } else
                StdDraw.setPenRadius(.001);
            StdDraw.line(i / 2, -resolution_Height / 2, i / 2, resolution_Height / 2);
            StdDraw.line(-i / 2, -resolution_Height / 2, -i / 2, resolution_Height / 2);

        }
        for (double i = 0; i < resolution_Height; i += 20) {
            if (i == 0) {
                StdDraw.setPenRadius(.005);
            } else
                StdDraw.setPenRadius(.001);
            StdDraw.line(-resolution_Width / 2, i / 2, resolution_Width / 2, i / 2);
            StdDraw.line(-resolution_Width / 2, -i / 2, resolution_Width / 2, -i / 2);
        }
    }


    public static void main(String [] args)
    {
        StdDraw.enableDoubleBuffering();
        double gravity = 9.8;
        double x1 = -300;
        double y1 = -300;
        double x2,y2;
        double resolution_Height = 720;
        double resolution_Width = 1280;
        int scale = 1;
        Entities Ball_1 = new Entities(3, 0, 0,25);
        int cooldown = 0;


        StdDraw.setCanvasSize(scale *(int)resolution_Width,scale *(int)resolution_Height);
        StdDraw.setXscale(-resolution_Width/2*scale,+resolution_Width/2*scale);
        StdDraw.setYscale(-resolution_Height/2*scale,+resolution_Height/2*scale);
        while(true) {
            StdDraw.clear();
            //grid for debugging, grid line every 20 pixels
            StdDraw.setPenColor(Color.black);
            /*
*/
            // time and animation tests

            StdDraw.setPenColor(Color.MAGENTA);
            StdDraw.filledCircle( Ball_1.getX_Pos(), Ball_1.getY_pos(), 10);
            // Ball_1.Move_Left();
            StdDraw.setPenRadius(.005);
            StdDraw.setPenColor(Color.GREEN);
            StdDraw.line( Ball_1.getX_Pos(),Ball_1.getY_pos(), StdDraw.mouseX(),StdDraw.mouseY());
            if(StdDraw.isKeyPressed(87)){
                Entities.Move_Up();}//w
            if(StdDraw.isKeyPressed(65)){
                Entities.Move_Left();}//a
            if(StdDraw.isKeyPressed(83)){
                Entities.Move_Dwn();}//s
            if(StdDraw.isKeyPressed(68)) {
                Entities.Move_Right();//d
            }


            //StdDraw.filledCircle(-460, -250, 10);
            StdDraw.show();
            if (cooldown == 0) {

                if (StdDraw.isMousePressed()) {
                    StdDraw.setPenColor(Color.RED);
                    StdDraw.filledCircle( StdDraw.mouseX(),StdDraw.mouseY(), 10);
                    cooldown = 3;
                    StdDraw.show();
                }
            }
            if (cooldown < 0)
                cooldown--;
            StdDraw.show();
            StdDraw.pause(20);
        }
    }
}

