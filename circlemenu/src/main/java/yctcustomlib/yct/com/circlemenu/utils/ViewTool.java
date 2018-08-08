package yctcustomlib.yct.com.circlemenu.utils;

import android.app.Activity;
import android.view.View;

public class ViewTool {

    public static <T extends View> T findViewById(Activity activity, int resId) {
        return activity.findViewById(resId);
    }

    public static <T extends View> T findViewById(View view, int resId) {
        return view.findViewById(resId);
    }
}
