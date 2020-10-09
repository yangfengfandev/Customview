package dev.yangfengfan.study.customview.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class Practice2DrawCircleView extends View {
    Paint paint = new Paint();

    public Practice2DrawCircleView(Context context) {
        super(context);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆


        paint.setAntiAlias(true); // 抗锯齿

        // 画实心圆
        canvas.drawCircle(200, 200, 160, paint);

        // 画空心圆
        paint.setStyle(Paint.Style.STROKE); // 设置为画线模式
        canvas.drawCircle(600, 200, 160, paint);

        // 画蓝色实心圆
        paint.setStyle(Paint.Style.FILL); // 恢复为画圆模式
        paint.setColor(Color.BLUE); // 设置画笔颜色
        canvas.drawCircle(200, 600, 160, paint);

        // 画线宽为 20 的空心圆
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(20); // 设置线宽为20px
        canvas.drawCircle(600, 600, 160, paint);

    }
}
