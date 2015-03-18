package com.nicodangelo.thething;

/**
 * Created by Dad on 3/17/2015.
 */
public class Jett
{
    public void changeColor()
    {
        if(MainActivity.color == 0)
        {
            Screen.setBackgroundColor(Color.black);
            MainActivity.color++;
        }
        else if(MainActivity.color == 1)
        {
            Screen.setBackgroundColor(Color.red);
            MainActivity.color++;
        }
        else if( MainActivity.color == 2)
        {
            Screen.setBackgroundColor(Color.blue);
            MainActivity.color = 0;
        }

    }
}
