import javax.xml.stream.util.StreamReaderDelegate;

/**
 * Hogan, Kevin 6/20/2019
 *
 *
 * "public class child extends parent
 *  super for inheritance
 *
 *  https://www.youtube.com/watch?v=5ApeBo1LujE
 */
public class Entities {
    //public static double getX_Pos;
    //public static double getY_pos;
    //private static double x_pos;
    private static int name_ID = 0;        //make more automated
    private static int hitPoints = 0;
    private static double speed = 0;
    private static double x_pos, y_pos;
    private static int shape;
    private double[] position = new double[]{0, 0};
    private double pi = Math.PI;

    public Entities() {
    }

    public Entities(int hitPoints, int x_pos, int y_pos, int speed) {
        this.hitPoints = hitPoints;
        this.x_pos = x_pos;
        this.y_pos = y_pos;
        this.speed = speed;
    }

    public Entities(int hitPoints, int x_pos, int y_pos, double speed, int shape) {
        this.hitPoints = hitPoints;
        this.x_pos = x_pos;
        this.y_pos = y_pos;
        this.speed = speed;
        if (speed == 0) speed = 1;
        this.shape = shape;
    }

    public  static double getX_Pos() {
        return x_pos;
    }

    public static double getY_pos() {
        return y_pos;
    }

    public static double getHitPoints() {
        return hitPoints;
    }

    public static double getSpeed() {
        return speed;
    }

    public static int getName_ID() {
        return name_ID;
    }

    public static int getShape() {
        return shape;
    }


//   public double[] newPos(double t_change, double r_change){
//       double radius = Math.sqrt(Math.pow(getX_Pos()- StdDraw.mouseX() , 2) + Math.pow(getY_pos() - StdDraw.mouseY() , 2));
//       double theta = Math.acos( (getX_Pos()-StdDraw.mouseX()) / radius);
//        position[0] = (radius *(Math.cos(theta + t_change * pi/12))) + x_pos + r_change;
//        position[1] = (radius * (Math.sin(theta + t_change * pi/12))) + y_pos + r_change;
//        x_pos = position[0];
//        y_pos = position[1];
//        return position;
//   }


    public static double Move_Left() {
        if ((x_pos >= -620))
            return x_pos = x_pos - speed * .8;
        else
            return x_pos = x_pos;
    }

    public static double Move_Right() {
        if (x_pos <= 620)
            return x_pos = x_pos + speed * .8;
        else return x_pos = x_pos;
    }

    public static double Move_Up() {
        if (y_pos < 340)
            return y_pos = y_pos + speed * .8;
        else
            return y_pos = y_pos;
    }

    public static double Move_Dwn() {
        if (y_pos > -340)
            return y_pos = y_pos - speed * .6;
        else
            return y_pos = y_pos;
    }

    public double Move_FwdX() {
        double distance = Math.sqrt(Math.pow((StdDraw.mouseX()) - x_pos, 2) + Math.pow((StdDraw.mouseY()) - y_pos, 2));
        if (distance <= 30) return x_pos;
        else
            return x_pos = x_pos - speed * 2 * Math.sin((x_pos - StdDraw.mouseX()) / distance);
    }

    public double Move_FwdY() {
        double distance = Math.sqrt(Math.pow((StdDraw.mouseX()) - x_pos, 2) + Math.pow((StdDraw.mouseY()) - y_pos, 2));
        if (distance <= 30) return y_pos;
        else
            return y_pos = y_pos + speed * 2 * Math.sin((StdDraw.mouseY() - y_pos) / distance);

    }

    public double Move_BackX() {
        double distance = Math.sqrt(Math.pow((StdDraw.mouseX()) - x_pos, 2) + Math.pow((StdDraw.mouseY()) - y_pos, 2));
        if (distance <= 30) return x_pos;
        else
            return x_pos = x_pos - speed * -2 * Math.sin((x_pos - StdDraw.mouseX()) / distance);
    }

    public double Move_BackY() {
        double distance = Math.sqrt(Math.pow((StdDraw.mouseX()) - x_pos, 2) + Math.pow((StdDraw.mouseY()) - y_pos, 2));
        if (distance <= 30) return y_pos;
        else
            return y_pos = y_pos + speed * -2 * Math.sin((StdDraw.mouseY() - y_pos) / distance);

    }
}

//    public double Move_LeftOfMouseX() {
//        double distance = Math.sqrt(Math.pow((StdDraw.mouseX() - x_pos), 2) + Math.pow((StdDraw.mouseY() - y_pos), 2));
//        //double theta = Math.acos((StdDraw.mouseX() - x_pos)/distance);
//        return x_pos = StdDraw.mouseX() + distance * (StdDraw.mouseX() - x_pos);
//    }
//
//    public double Move_LeftOfMouseY() {
//      *//*  double distance = Math.sqrt(Math.pow((StdDraw.mouseX() - x_pos), 2) + Math.pow((StdDraw.mouseY() - y_pos), 2));
//        return y_pos = (StdDraw.mouseY() + (distance * StdDraw.mouseY() - y_pos));*//*
//
//      return y_pos;
//    }
//
//    /**
//     * public int Move_RightofMouse()
//     * {
//     * <p>
//     * }
//     * public int Move_LeftofMouse()
//     * {
//     * <p>
//     * }
//     **/
//    public int hurtme() {
//        return hitPoints - 1; // add variable to damage
//    }
//}



