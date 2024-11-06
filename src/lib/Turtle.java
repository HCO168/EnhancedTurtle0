package lib;

/**
 * Class that represents a turtle which is similar to a Logo turtle.
 * This class inherts from SimpleTurtle and is for students
 * to add methods to.
 *
 * Copyright Georgia Institute of Technology 2004
 * @author Barb Ericson ericson@cc.gatech.edu
 */
public class Turtle extends SimpleTurtle
{
  ////////////////// fields ///////////////////////
  double x;
  double y;
  ////////////////// constructors ///////////////////////
  
  /** Constructor that takes the x and y and a picture to
   * draw on
   * @param x the starting x position
   * @param y the starting y position
   * @param picture the picture to draw on
   */
  public Turtle (int x, int y, Picture picture) 
  {
    // let the parent constructor handle it
    super(x,y,picture);
    this.x=x;
    this.y=y;

  }
  
  /** Constructor that takes the x and y and a model
   * display to draw it on
   * @param x the starting x position
   * @param y the starting y position
   * @param modelDisplayer the thing that displays the model
   */
  public Turtle (int x, int y,
                 ModelDisplay modelDisplayer) 
  {
    // let the parent constructor handle it
    super(x,y,modelDisplayer);
    this.x=x;
    this.y=y;
  }
  
  /** Constructor that takes the model display
   * @param modelDisplay the thing that displays the model
   */
  public Turtle (ModelDisplay modelDisplay) 
  {
    // let the parent constructor handle it
    super(modelDisplay);
    this.x=getXPos();
    this.y=getYPos();
  }
  
  /**
   * Constructor that takes a picture to draw on
   * @param p the picture to draw on
   */
  public Turtle (Picture p)
  {
    // let the parent constructor handle it
    super(p);
    this.x=getXPos();
    this.y=getYPos();
  }
  /////////////////// methods ///////////////////////

  public void forward(double length){
    double old_x=x,old_y=y;
    x=x+Math.sin(Math.toRadians(getHeading()))*length;
    y=y-Math.cos(Math.toRadians(getHeading()))*length;
    this.pen.addMove(old_x,old_y,x,y);
    this.xPos = (int) x;
    this.yPos = (int) y;
    this.updateDisplay();
  }

  public static void main(String[] args)
  {
    World earth = new World();
    Turtle t1 = new Turtle(earth);
    t1.forward();
  }

} // this } is the end of class Turtle, put all new methods before this