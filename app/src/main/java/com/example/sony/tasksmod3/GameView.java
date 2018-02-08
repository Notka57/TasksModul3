package com.example.sony.tasksmod3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.CountDownTimer;
import android.view.View;

/**
 * Created by sony on 04.02.2018.
 */

public class GameView extends View {

    private int viewWidth;
    private int viewHeight;
    private Sprite playerT;
    private final int timerInterval = 120;

    public GameView(Context context) {
        super(context);
        Bitmap b = BitmapFactory.decodeResource(getResources(), R.drawable.player);

        int w = b.getWidth() / 6;
        int h = b.getHeight() / 1;
        Rect firstFrame = new Rect(0, 0, w, h);
        playerT = new Sprite(10, 0, 0, 100, firstFrame, b);
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == 0 && j == 0) {
                    continue;
                }
                             playerT.addFrame(new Rect(j * w, i * h, j * w + w, i * w + w));
            }
        }
        Timer t = new Timer();
        t.start();
    }

    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);

        viewWidth = w;
        viewHeight = h;
    }

    @Override
    protected void onDraw(Canvas canvas) {

        super.onDraw(canvas);

        canvas.drawARGB(255, 255, 255, 255);
        playerT.draw(canvas);

    }

    protected void update() {
        playerT.update(timerInterval);
        invalidate();
    }

    class Timer extends CountDownTimer {
        public Timer() {
            super(Integer.MAX_VALUE, timerInterval);
        }

        @Override
        public void onTick(long millisUntilFinished) {
            update();
        }

        @Override
        public void onFinish() {
        }

    }
}