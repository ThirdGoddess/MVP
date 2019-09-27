package com.brk.mvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View {

    private TextView news;
    private Button add;
    private Button less;

    MainPresenter mainPresenter = new MainPresenter(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        mainPresenter.show();

    }


    @Override
    public void addNum(String string) {
        news.setText(string);
    }

    @Override
    public void lessNum(String string) {
        news.setText(string);
    }

    @Override
    public void showNum(String string) {
        news.setText(string);
    }

    private void initView() {
        news = (TextView) findViewById(R.id.news);
        add = (Button) findViewById(R.id.add);
        less = (Button) findViewById(R.id.less);


        add.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                mainPresenter.addNum();
            }
        });

        less.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                mainPresenter.lessNum();
            }
        });
    }

}
