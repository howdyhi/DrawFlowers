package yzu.money.drawflowers;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by money on 2016/10/23.
 */

public class myview extends View{
    float x = 0, y = 0;
    float petalR;//petal's radius

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        x = event.getX();
        y = event.getY();
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

        //draw petals
        p.setColor(Color.parseColor("#f1b1f9"));//set paint's color
        canvas.drawCircle(x+35, y, petalR, p); //r
        canvas.drawCircle(x+25, y+25, petalR, p); //r b
        canvas.drawCircle(x, y+35, petalR, p); //b
        canvas.drawCircle(x-25, y+25, petalR, p); //b l
        canvas.drawCircle(x-35, y, petalR, p); //l
        canvas.drawCircle(x-25, y-25, petalR, p); //t l
        canvas.drawCircle(x, y-35, petalR, p);//t
        canvas.drawCircle(x+25, y-25, petalR, p);// t r
        //draw mid circle
        p.setColor(Color.YELLOW);
        canvas.drawCircle(x, y, 25, p);

    }
}
