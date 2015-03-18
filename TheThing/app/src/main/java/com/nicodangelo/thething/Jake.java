package com.nicodangelo.thething;

import android.graphics.Color;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.view.View;

public class Jake
{
    public static void changeText(TextView text)
    {
        if(MainActivity.color == 0)
        {
            text.setTextColor(Color.WHITE);
            text.setText("BLACK");
        }
        else if(MainActivity.color == 1)
        {
            text.setTextColor(Color.BLACK);
            text.setText("RED");
        }
        else if( MainActivity.color == 2)
        {
            text.setTextColor(Color.BLACK);
            text.setText("BLUE");
        }
    }
}
