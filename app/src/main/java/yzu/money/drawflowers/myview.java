package yzu.money.drawflowers;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

import java.util.ArrayList;

/**
 * Created by money on 2016/10/23.
 */
class Flower{
    float x;
    float y;

    public Flower(float x, float y) {
        this.x = x;
        this.y = y;
    }
}

public class myview extends View{
    float x = 0, y = 0;
    float petalR;//petal's radius

    ArrayList<Flower> flowers = new ArrayList<Flower>();

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        x = event.getX();
        y = event.getY();

        Flower flower=new Flower(x,y);

        flowers.add(flower);

        invalidate();
        return super.onTouchEvent(event);
    }

    public myview(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //create paint
        Paint p = new Paint();
        //set petal's radius
        petalR = 15;

            for(int i=0; i<flowers.size(); i++)//redraw
            {
                //draw petals
                p.setColor(Color.parseColor("#f1b1f9"));//set paint's color
                canvas.drawCircle(flowers.get(i).x+35, flowers.get(i).y,petalR,p);
                canvas.drawCircle(flowers.get(i).x+25, flowers.get(i).y+25, petalR, p); //r b
                canvas.drawCircle(flowers.get(i).x, flowers.get(i).y+35, petalR, p); //b
                canvas.drawCircle(flowers.get(i).x-25, flowers.get(i).y+25, petalR, p); //b l
                canvas.drawCircle(flowers.get(i).x-35, flowers.get(i).y, petalR, p); //l
                canvas.drawCircle(flowers.get(i).x-25, flowers.get(i).y-25, petalR, p); //t l
                canvas.drawCircle(flowers.get(i).x, flowers.get(i).y-35, petalR, p);//t
                canvas.drawCircle(flowers.get(i).x+25, flowers.get(i).y-25, petalR, p);// t r
                //draw mid circle
                p.setColor(Color.parseColor("#feff97"));
                canvas.drawCircle(flowers.get(i).x, flowers.get(i).y, 25, p);
            }

    }
}
