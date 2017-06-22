package cn.licoy.demo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class TextActivity extends AppCompatActivity {

    private AutoCompleteTextView autoC_1;
    private MultiAutoCompleteTextView autoC_2;
    private String[] data = {"我的世界","你的世界","我的天空","蓝天白云"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);

        //
        autoC_1 = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView_1);
        autoC_2 = (MultiAutoCompleteTextView) findViewById(R.id.autoCompleteTextView_2);

        //创建适配器
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,//
                                        R.layout.support_simple_spinner_dropdown_item,this.data);

        //绑定
        autoC_1.setAdapter(adapter);
        autoC_2.setAdapter(adapter);

        //设置分隔符
        autoC_2.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());


    }
}
