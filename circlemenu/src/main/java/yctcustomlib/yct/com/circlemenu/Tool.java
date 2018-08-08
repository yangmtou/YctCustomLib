package yctcustomlib.yct.com.circlemenu;

import android.view.View;
import android.view.animation.RotateAnimation;

/**
 *
 */
class Tool {
    public static void showView(View view,int offSetTime){
        RotateAnimation rotateAnimation = new RotateAnimation(180,360,view.getWidth()/2,view.getHeight());
        rotateAnimation.setDuration(500);
        rotateAnimation.setStartOffset(offSetTime);
        rotateAnimation.setFillAfter(true);
        view.startAnimation(rotateAnimation);
    }
    public static void hideView(View view,int offSetTime){
        RotateAnimation rotateAnimation = new RotateAnimation(0,180,view.getWidth()/2,view.getHeight());
        rotateAnimation.setDuration(500);
        rotateAnimation.setStartOffset(offSetTime);
        rotateAnimation.setFillAfter(true);
        view.startAnimation(rotateAnimation);
    }
}
