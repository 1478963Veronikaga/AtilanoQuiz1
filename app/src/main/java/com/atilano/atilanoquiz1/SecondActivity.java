package com.atilano.atilanoquiz1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import static com.atilano.atilanoquiz1.R.layout.activity_main;
import static com.atilano.atilanoquiz1.R.layout.profile_layout;

/**
 * Created by Jeanina on 28 Sep 2017.
 */

public class SecondActivity extends AppCompatActivity {

    Button btn_home_p, btn_1_p, btn_2_p, btn_3_p;
    TextView tv_codename, tv_version, tv_api, tv_date;
    ImageView iv_Logo;

    String[] codename, version, api, date;
    int[] logo;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(profile_layout);

            btn_home_p = (Button) findViewById(R.id.btnHomep);
            btn_1_p = (Button) findViewById(R.id.btn1p);
            btn_2_p = (Button) findViewById(R.id.btn2p);
            btn_3_p = (Button) findViewById(R.id.btn3p);

            btn_1_p.setEnabled(true);
            btn_2_p.setEnabled(true);
            btn_3_p.setEnabled(true);

            tv_codename = (TextView) findViewById(R.id.tvCodeName);
            tv_version = (TextView) findViewById(R.id.tvVersion);
            tv_api = (TextView) findViewById(R.id.tvAPI);
            tv_date = (TextView) findViewById(R.id.tvDate);

            iv_Logo = (ImageView) findViewById(R.id.ivLogo);

            codename = getResources().getStringArray(R.array.codename);
            version = getResources().getStringArray(R.array.version);
            api = getResources().getStringArray(R.array.api);
            date = getResources().getStringArray(R.array.date);
            logo = new int[]{
                    R.drawable.marshmallow,
                    R.drawable.nougat,
                    R.drawable.oreo,
            };

            //int ctr = getIntent().getExtras().getInt("ctr");
            int ctr = getIntent().getIntExtra("ctr", 0);

            iv_Logo.setImageResource(logo[ctr]);
            tv_codename.setText(codename[ctr]);
            tv_version.setText(version[ctr]);
            tv_api.setText(api[ctr]);
            tv_date.setText(date[ctr]);

            if (ctr==1){
                btn_1_p.setEnabled(false);
            } else if (ctr == 2) {
                btn_2_p.setEnabled(false);
            } else if (ctr == 3) {
                btn_3_p.setEnabled(false);
            }

        }
}
