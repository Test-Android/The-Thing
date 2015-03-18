package com.nicodangelo.thething;

/**
 * Created by Dad on 3/17/2015.
 */
import android.graphics.Color;
import android.widget.RelativeLayout;

public class Jett
{
    public static void changeColor(RelativeLayout layout)
    {
        if(MainActivity.color == 0)
        {
            layout.setBackgroundColor(Color.BLACK);
            MainActivity.color++;
        }
        else if(MainActivity.color == 1)
        {
            layout.setBackgroundColor(Color.RED);
            MainActivity.color++;
        }
        else if( MainActivity.color == 2)
        {
            layout.setBackgroundColor(Color.BLUE);
            MainActivity.color = 0;
        }

    }
}
