package com.nicodangelo.thething;

import android.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;



public class MainActivity extends ActionBarActivity
{
    public static int oops = 30;
    public static TextView x;
    public static RelativeLayout layout;
    public static int x1 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        x = (TextView)findViewById(R.id.textView);
        layout = (RelativeLayout)findViewById(R.id.Screen);
    }

    public static void MOVE(View view)
    {
        x.setLeft(x1 + 20);
        float y = x.getX();
        System.out.println(y);
        layout.refreshDrawableState();
        //x.setTop(30);
        x.refreshDrawableState();
    }

}
