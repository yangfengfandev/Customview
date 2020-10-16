package dev.yangfengfan.study.customview.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;


public class Practice11PieChartView extends View {

    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    RectF rectF = new RectF(200, 200, 800, 800);
    RectF rectF2 = new RectF(180, 180, 780, 780);

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // 综合练习
        // 练习内容：使用各种 Canvas.drawXXX() 方法画饼图

        // 背景
        canvas.drawColor(Color.parseColor("#506e7a"));

        paint.setColor(Color.parseColor("#ffc201"));
        canvas.drawArc(rectF, -2, -50, true, paint);

        paint.setColor(Color.parseColor("#9d22b1"));
        canvas.drawArc(rectF, 2, 5, true, paint);

        paint.setColor(Color.parseColor("#9f9f9f"));
        canvas.drawArc(rectF, 9, 6, true, paint);

        paint.setColor(Color.parseColor("#009789"));
        canvas.drawArc(rectF, 18, 50, true, paint);

        paint.setColor(Color.parseColor("#1b97f3"));
        canvas.drawArc(rectF, 71, 107, true, paint);

        paint.setColor(Color.parseColor("#f44133"));
        canvas.drawArc(rectF2, 180, 125, true, paint);
    }
}
