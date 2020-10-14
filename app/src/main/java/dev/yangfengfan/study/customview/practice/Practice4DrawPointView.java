package dev.yangfengfan.study.customview.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class Practice4DrawPointView extends View {

    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public Practice4DrawPointView(Context context) {
        super(context);
    }

    public Practice4DrawPointView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice4DrawPointView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPoint() 方法画点
//        一个圆点，一个方点
//        圆点和方点的切换使用 paint.setStrokeCap(cap)：`ROUND` 是圆点，`BUTT` 或 `SQUARE` 是方点

        paint.setStrokeCap(Paint.Cap.ROUND); //ROUND 画出来是圆形的点
        paint.setStrokeWidth(200); //点的大小
        canvas.drawPoint(200,200,paint);

        paint.setStrokeCap(Paint.Cap.SQUARE); //SQUARE 或 BUTT 画出来是方形的点
        paint.setStrokeWidth(200); //点的大小
        canvas.drawPoint(600,200,paint);

        paint.setStrokeCap(Paint.Cap.SQUARE); //SQUARE 或 BUTT 画出来是方形的点
        paint.setStrokeWidth(200); //点的大小
        canvas.drawPoint(200,600,paint);
    }
}
