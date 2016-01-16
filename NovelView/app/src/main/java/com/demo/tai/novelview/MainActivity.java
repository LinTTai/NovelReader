package com.demo.tai.novelview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private NovelView novelView;
    private NovelViewAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //不显示系统的标题栏
        getWindow().setFlags( WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN );
        setContentView(R.layout.activity_main);

        novelView = (NovelView)findViewById(R.id.novelView);
        List<String> data = new ArrayList<>();
        for (int i = 0;i<10;i++){
            data.add((i+1)+"");
            adapter = new NovelViewAdapter(this,data);
            novelView.setAdapter(adapter);
        }

    }
}
