package cn.licoy.demo2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;

import com.tandong.swichlayout.BaseEffects;
import com.tandong.swichlayout.SwichLayoutInterFace;
import com.tandong.swichlayout.SwitchLayout;

public class RelativeActivity extends AppCompatActivity implements SwichLayoutInterFace {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);
        //加载动画
        setEnterSwichLayout();
    }

    @Override
    public void setEnterSwichLayout() { //进入时动画
        SwitchLayout.getFadingIn(this);
    }

    @Override
    public void setExitSwichLayout() { //退出时动画
       //
    }
}
