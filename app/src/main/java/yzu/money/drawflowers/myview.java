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

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        x = event.getX();
        y = event.getY();
        invalidate();
        return super.onTouchEvent(event);
    }

    public myview(Context context) {
        super(context);
        Paint p = new Paint();
        p.setColor(Color.RED);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }
}
