/**
 * Hogan, Kevin 11/4/2019
 *
 *
 * "public class child extends parent
 *  super for inheritance
 *
 *  https://www.youtube.com/watch?v=5ApeBo1LujE
 */
public class Entities
{

    //      Private Fields
    //----------------------------
    private int X_Position;
    private int Y_Position;
    private int entityType;
    private int speed;
    private double size;

    //      Constructors
    //----------------------------
    Entities()
    {
        if(Platform_00.numOfTotalEntities < 25)
        {
            Platform_00.allEntitiesInWorld[Platform_00.numOfTotalEntities] = this;
            Platform_00.numOfTotalEntities++;
        }
        else
            System.out.println("Oops, too many");
    }//default

    Entities(int x, int y, int type, int radius)
    {
        if(Platform_00.numOfTotalEntities < 25)
        {
            this.size = radius;
            this.X_Position = x;
            this.Y_Position = y;
            this.entityType = type;
            Platform_00.allEntitiesInWorld[Platform_00.numOfTotalEntities] = this;
            Platform_00.numOfTotalEntities++;
        }
        else
            System.out.println("Oops, too many");
    }
    Entities(int x, int y, int type, double radius, int velo)
    {
        if(Platform_00.numOfTotalEntities < 25)
        {
            this.size = radius;
            this.speed = velo;
            this.X_Position = x;
            this.Y_Position = y;
            this.entityType = type;
            Platform_00.allEntitiesInWorld[Platform_00.numOfTotalEntities] = this;
            Platform_00.numOfTotalEntities++;
        }
        else
            System.out.println("Oops, too many");
    }

    //      Getters and Setters
    //----------------------------
    public void setX_Position(int x)
    {
        this.X_Position = x;
    }
    public void setY_Position(int y)
    {
        this.Y_Position = y;
    }
    public void setEntityType(int type)
    {
        this.entityType = type;
    }
    public void setSpeed(int velo)
    {
        this.speed = velo;
    }
    public void setSize(int radius)
    {
        this.size = radius;
    }
    public double getSize()
    {
        return this.size;
    }
    public int getSpeed()
    {
        return this.speed;
    }
    public int getType()
    {
        return this.entityType;
    }
    public int getX_Position()
    {
        return this.X_Position;
    }
    public int getY_Position()
    {
        return this.Y_Position;
    }

    //      Mutators
    //----------------------------
    public void MoveLeft()
    {
        if(this.getX_Position() > -(Platform_00.screenWidth)/2  +10)
        {
            this.setX_Position(this.getX_Position() - this.getSpeed());
        }
        else this.setX_Position(this.getX_Position());
    }
     public void MoveRight()
    {
        if(this.getX_Position() < (Platform_00.screenWidth)/2  - 10)
        {
            this.setX_Position(this.getX_Position() + this.getSpeed());
        }
        else this.setX_Position(this.getX_Position());
    }
    public void MoveUp()
    {
        if(this.getY_Position() < (Platform_00.screenHeight)/2 -10)
        {
           this.setY_Position( this.getY_Position() + this.getSpeed() );
        }
        else this.setX_Position( this.getX_Position());
    }

    public void MoveDown()
    {

        if(this.getY_Position() > (-Platform_00.screenHeight)/2 +10)
        {
            this.setY_Position((this.getY_Position() - Platform_00.getGravity()));
        }
        else this.setX_Position( this.getX_Position());

    }

    public void showME()
    {
        switch (this.entityType)
        {
            case 1:
                StdDraw.filledCircle(this.getX_Position(), this.getY_Position(), this.getSize());
                break;
            case 2:
                StdDraw.filledSquare(this.getX_Position(), this.getY_Position(), this.getSize());
            break;
            default:
                StdDraw.filledCircle(this.getX_Position(), this.getY_Position(), this.getSize());
                break;
        }
    }
}
