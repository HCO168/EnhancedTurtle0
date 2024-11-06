package main;

import lib.Turtle;
import lib.World;

import java.awt.*;


public class Main
{
    public static void main(String[] args)
    {
        World world = new World(2000, 2000);
        Turtle yertle = new Turtle(1000,200,world);
        yertle.setPenWidth(0.1f);
        yertle.setColor(Color.blue);
        yertle.turn(-120);
        drawComplex(yertle,10,1000);
        world.show(true);
    }
    public static void drawComplex(Turtle yertle,int layers,double maxLength){
        for(int i=0;i<3;i++) {
            drawSide(yertle,layers-1,maxLength);
            yertle.turn(-120);
        }
    }
    public static void drawSide(Turtle yertle,int restLayers,double sideLength){
        yertle.forward(sideLength);
        if (restLayers > 0) {
            yertle.forward(-sideLength);
            drawSide(yertle,restLayers-1,sideLength/3.0);
            yertle.turn(60);
            drawSide(yertle,restLayers-1,sideLength/3.0);
            yertle.turn(-120);
            drawSide(yertle,restLayers-1,sideLength/3.0);
            yertle.turn(60);
            drawSide(yertle,restLayers-1,sideLength/3.0);
        }
    }

}

