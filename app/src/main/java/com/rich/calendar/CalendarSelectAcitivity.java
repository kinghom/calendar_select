package com.rich.calendar;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.rich.library.CalendarSelectView;
import com.rich.library.DayTimeEntity;

import java.util.ArrayList;

public class CalendarSelectAcitivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String flag = getIntent().getStringExtra("flag");
        if(TextUtils.equals(flag, "single")) {
            setContentView(R.layout.select_date_single);
        } else {
            setContentView(R.layout.select_date_mult);
        }

        final CalendarSelectView calendar_select = findViewById(R.id.calendar_select);

        Button bt = findViewById(R.id.bt_test);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<DayTimeEntity> list = calendar_select.getDate();
                for (int i=0;i<list.size();i++){
                    Log.e("kinghom", "时间: "+ list.get(i).day);
                }
            }
        });
    }
}
