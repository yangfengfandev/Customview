package dev.yangfengfan.study.customview.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class Practice10HistogramView extends View {

    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        canvas.drawColor(Color.BLACK);
        paint.setColor(Color.WHITE);
        paint.setStrokeWidth(4);
        canvas.drawLine(30,30,30,700,paint);
        canvas.drawLine(30,700,1000,700,paint);

        // Froyo
        paint.setColor(Color.GREEN);
        canvas.drawRect(70,680,140,700, paint);
        paint.setColor(Color.WHITE);
        paint.setTextSize(40);
        canvas.drawText("Froyo", 70, 750,paint);

        // GB
        paint.setColor(Color.GREEN);
        canvas.drawRect(210,650,280,700, paint);
        paint.setColor(Color.WHITE);
        paint.setTextSize(40);
        canvas.drawText("GB", 210, 750,paint);

        //ICS
        paint.setColor(Color.GREEN);
        canvas.drawRect(350,630,420,700, paint);
        paint.setColor(Color.WHITE);
        paint.setTextSize(40);
        canvas.drawText("ICS", 350, 750,paint);

        //JB
        paint.setColor(Color.GREEN);
        canvas.drawRect(490,500,560,700, paint);
        paint.setColor(Color.WHITE);
        paint.setTextSize(40);
        canvas.drawText("JB", 490, 750,paint);

        //Kitkat
        paint.setColor(Color.GREEN);
        canvas.drawRect(630,300,700,700, paint);
        paint.setColor(Color.WHITE);
        paint.setTextSize(40);
        canvas.drawText("Kitkat", 630, 750,paint);

        // L
        paint.setColor(Color.GREEN);
        canvas.drawRect(770,100,840,700, paint);
        paint.setColor(Color.WHITE);
        paint.setTextSize(40);
        canvas.drawText("L", 770, 750,paint);

        // M
        paint.setColor(Color.GREEN);
        canvas.drawRect(910,550,980,700, paint);
        paint.setColor(Color.WHITE);
        paint.setTextSize(40);
        canvas.drawText("M", 910, 750,paint);
    }
}
