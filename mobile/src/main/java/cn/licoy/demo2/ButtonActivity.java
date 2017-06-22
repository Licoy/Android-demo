package cn.licoy.demo2;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ButtonActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    private Button btn1;
    private Button btn2;
    private ToggleButton toggleBtn;
    private TextView textView;
    private RadioGroup gender;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

        //
        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);
        toggleBtn = (ToggleButton) findViewById(R.id.toggleBtn);
        textView = (TextView) findViewById(R.id.textView1);
        gender = (RadioGroup) findViewById(R.id.gender);

        //
        btn1.setOnClickListener(new MyOnclickLister(){
            @Override
            public void onClick(View v) {
                SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
                super.onClick(v);
                Intent intent = new Intent();
                intent.putExtra("time",sm.format(new Date()));
                setResult(2,intent);
                finish();
            }
        });

        btn2.setOnClickListener(new MyOnclickLister(){
            @Override
            public void onClick(View v) {
                super.onClick(v);
                Toast.makeText(ButtonActivity.this,"按钮二被点击",Toast.LENGTH_LONG).show();
            }
        });

        toggleBtn.setOnCheckedChangeListener(this);

        gender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                switch (checkedId){
                    case R.id.rg_man : textView.setText("性别：男");break;
                    case R.id.rg_woman : textView.setText("性别：女");break;
                    default: textView.setText("性别：未知");
                }
            }
        });



    }

    /**
     * Called when the checked state of a compound button has changed.
     *
     * @param buttonView The compound button view whose state has changed.
     * @param isChecked  The new checked state of buttonView.
     */
    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        String s = isChecked ? "当前按钮为开启状态" : "当前按钮为关闭状态";
        this.textView.setText(s);
    }
}


class MyOnclickLister implements View.OnClickListener{

    @Override
    public void onClick(View v) {
        v.setAlpha(0.7f);
//        Toast.makeText(ButtonActivity.this,"",Toast.LENGTH_LONG).show();
    }
}