import javax.swing.text.html.parser.Entity;
import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Hogan, Kevin 6/20/2019
 */
public class Platform_00
{

    static Entities[] allEntitiesInWorld = new Entities[25];
    public static int numOfTotalEntities = 0;
    public static int screenWidth = 1080;
    public static int screenHeight = 720;
    public static int PLAYER_START_X = -520;
    public static int PLAYER_START_Y = -220;
    public static double PLAYER1_RADIUS = 0.5;

    private static int gravity = 10;
    private static void drawWorld( int screenWidth, int screenHeight)
    {
        StdDraw.setCanvasSize(screenWidth, screenHeight);
        StdDraw.setXscale(-screenWidth/2, screenWidth/2);
        StdDraw.setYscale(-screenHeight/2, screenHeight/2);
    }
    public static int getGravity()
    {
        return gravity;
    }


    public static void main (String args[])
    {
        StdDraw.enableDoubleBuffering();
        drawWorld(screenWidth, screenHeight);
        StdDraw.filledCircle(PLAYER_START_X, PLAYER_START_Y, 8.5);
        StdDraw.setPenColor(Color.RED);
        Entities PLAYER = new Entities(PLAYER_START_X, PLAYER_START_Y, 1,PLAYER1_RADIUS, 10);
        Entities testWall = new Entities(0, 0, 2, 100);
        testWall.showME();

        while(true)
        {
            StdDraw.clear();
            if(StdDraw.isKeyPressed(87)){
                PLAYER.MoveUp();}//w
            if(StdDraw.isKeyPressed(65)){
                PLAYER.MoveLeft();}//a
            if(StdDraw.isKeyPressed(83)){
                PLAYER.MoveDown();}//s
            if(StdDraw.isKeyPressed(68)) {
                PLAYER.MoveRight();//d
            }
            StdDraw.filledCircle(screenWidth/2, screenHeight/2, 10);
            StdDraw.filledCircle(PLAYER.getX_Position(), PLAYER.getY_Position(), 8.5);
            StdDraw.show();
            StdDraw.pause(30);
        }

    }
}