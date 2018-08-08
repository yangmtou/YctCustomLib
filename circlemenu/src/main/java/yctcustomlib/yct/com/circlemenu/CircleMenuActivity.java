package yctcustomlib.yct.com.circlemenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import yctcustomlib.yct.com.circlemenu.utils.ViewTool;

public class CircleMenuActivity extends AppCompatActivity {

    private RelativeLayout level1;
    private RelativeLayout level2;
    private RelativeLayout level3;

    private ImageView icon_home;
    private ImageView icon_menu;

    private boolean isshowLevel1 = true;
    private boolean isShowLevel2 = true;
    private boolean isShowLevel3 = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle_menu);

        level1 = ViewTool.findViewById(this,R.id.level1);
        level2 = ViewTool.findViewById(this,R.id.level2);
        level3 = ViewTool.findViewById(this,R.id.level3);

        icon_home = ViewTool.findViewById(this,R.id.icon_home);
        icon_home.setOnClickListener(onClickListener);
        icon_menu = ViewTool.findViewById(this,R.id.icon_menu);
        icon_menu.setOnClickListener(onClickListener);

    }

    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.icon_home:

                    break;
                case R.id.icon_menu:
                    if (isShowLevel3) {
                        Tool.hideView(level3, 0);
                        isShowLevel3 = false;
                    }else{
                        Tool.showView(level3,0);
                        isShowLevel3 = true;
                    }
                    break;

            }
        }
    };
}
