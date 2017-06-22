package cn.licoy.demo2.util;

import android.widget.EditText;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by administrator on 2017/6/18.
 */

public class GetNowSimpleDate implements Serializable,Runnable {
    private SimpleDateFormat simpleDateFormat;
    private EditText text;

    public GetNowSimpleDate(EditText text,SimpleDateFormat simpleDateFormat) {
        this.simpleDateFormat = simpleDateFormat;
        this.text = text;
    }

    @Override
    public void run() {
        text.setText(simpleDateFormat.format(new Date()));
    }
}
