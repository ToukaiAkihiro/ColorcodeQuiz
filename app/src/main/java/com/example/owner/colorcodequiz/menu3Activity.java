package com.example.owner.colorcodequiz;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class menu3Activity extends AppCompatActivity {
    private int this_ull_CodetoColor;
    private int this_ull_ColortoCode;
    private int maxlimit;
    private int minlimit;
    private int number;
    private int level;
    private int this_nowPoint;
    private int colormode;

    private int this_nocomp_CodetoColor6;
    private int this_nocomp_CodetoColor7;
    private int this_nocomp_CodetoColor8;
    private int this_nocomp_CodetoColor9;
    private int this_nocomp_CodetoColor10;

    private int this_nocomp_ColortoCode6;
    private int this_nocomp_ColortoCode7;
    private int this_nocomp_ColortoCode8;
    private int this_nocomp_ColortoCode9;
    private int this_nocomp_ColortoCode10;

    private int req_nocomp;
    private int req_Point;
    private int req_level;

    private int now_nocomp;

    private String plus;

    private EditText setnum;

    private TextView nowPointview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu3);
        setnum = (EditText) findViewById(R.id.setnum);
        setnum.setKeyListener(null);
        nowPointview = (TextView) findViewById(R.id.nowPointview);

        Intent intent = getIntent();
        colormode = intent.getIntExtra("getcolormode", 1);

        //getData (Parse)
       /* getData checkData = new getData();
        ull_CodetoColor = checkData.getull_CodetoColor();
        ull_ColortoCode = checkData.getull_CodetoColor();
        nowPoint = checkData.getnowPoint();   */

        //getData（SharedPreference)
        if (colormode == 1) {
            SharedPreferences getData = getSharedPreferences("DataSave", Context.MODE_PRIVATE);
            this_ull_CodetoColor = getData.getInt("RGB_ull_CodetoColor", 0);
            this_ull_ColortoCode = getData.getInt("RGB_ull_ColortoCode", 0);
            this_nowPoint = getData.getInt("RGB_nowPoint", 0);

            this_nocomp_CodetoColor6 = getData.getInt("RGB_nocomp_CodetoColor6", 0);
            this_nocomp_CodetoColor7 = getData.getInt("RGB_nocomp_CodetoColor7", 0);
            this_nocomp_CodetoColor8 = getData.getInt("RGB_nocomp_CodetoColor8", 0);
            this_nocomp_CodetoColor9 = getData.getInt("RGB_nocomp_CodetoColor9", 0);
            this_nocomp_CodetoColor10 = getData.getInt("RGB_nocomp_CodetoColor10", 0);

            this_nocomp_ColortoCode6 = getData.getInt("RGB_nocomp_ColortoCode6", 0);
            this_nocomp_ColortoCode7 = getData.getInt("RGB_nocomp_ColortoCode7", 0);
            this_nocomp_ColortoCode8 = getData.getInt("RGB_nocomp_ColortoCode8", 0);
            this_nocomp_ColortoCode9 = getData.getInt("RGB_nocomp_ColortoCode9", 0);
            this_nocomp_ColortoCode10 = getData.getInt("RGB_nocomp_ColortoCode10", 0);

            nowPointview.setText("RGBPoint:" + this_nowPoint);
        } else if (colormode == 2) {
            SharedPreferences getData = getSharedPreferences("DataSave", Context.MODE_PRIVATE);
            this_ull_CodetoColor = getData.getInt("HSB_ull_CodetoColor", 0);
            this_ull_ColortoCode = getData.getInt("HSB_ull_ColortoCode", 0);
            this_nowPoint = getData.getInt("HSB_nowPoint", 0);

            this_nocomp_CodetoColor6 = getData.getInt("HSB_nocomp_CodetoColor6", 0);
            this_nocomp_CodetoColor7 = getData.getInt("HSB_nocomp_CodetoColor7", 0);
            this_nocomp_CodetoColor8 = getData.getInt("HSB_nocomp_CodetoColor8", 0);
            this_nocomp_CodetoColor9 = getData.getInt("HSB_nocomp_CodetoColor9", 0);
            this_nocomp_CodetoColor10 = getData.getInt("HSB_nocomp_CodetoColor10", 0);

            this_nocomp_ColortoCode6 = getData.getInt("HSB_nocomp_ColortoCode6", 0);
            this_nocomp_ColortoCode7 = getData.getInt("HSB_nocomp_ColortoCode7", 0);
            this_nocomp_ColortoCode8 = getData.getInt("HSB_nocomp_ColortoCode8", 0);
            this_nocomp_ColortoCode9 = getData.getInt("HSB_nocomp_ColortoCode9", 0);
            this_nocomp_ColortoCode10 = getData.getInt("HSB_nocomp_ColortoCode10", 0);

            nowPointview.setText("HSBPoint:" + this_nowPoint);
        }
        //IconChange
        if (this_ull_CodetoColor >= 6) {
            com.beardedhen.androidbootstrap.BootstrapButton CodetoColor6 = (com.beardedhen.androidbootstrap.BootstrapButton) findViewById(R.id.CodetoColor6);
            CodetoColor6.setLeftIcon("fa-unlock");
        }
        if (this_ull_CodetoColor >= 7) {
            com.beardedhen.androidbootstrap.BootstrapButton CodetoColor7 = (com.beardedhen.androidbootstrap.BootstrapButton) findViewById(R.id.CodetoColor7);
            CodetoColor7.setLeftIcon("fa-unlock");
        }
        if (this_ull_CodetoColor >= 8) {
            com.beardedhen.androidbootstrap.BootstrapButton CodetoColor8 = (com.beardedhen.androidbootstrap.BootstrapButton) findViewById(R.id.CodetoColor8);
            CodetoColor8.setLeftIcon("fa-unlock");
        }
        if (this_ull_CodetoColor >= 9) {
            com.beardedhen.androidbootstrap.BootstrapButton CodetoColor9 = (com.beardedhen.androidbootstrap.BootstrapButton) findViewById(R.id.CodetoColor9);
            CodetoColor9.setLeftIcon("fa-unlock");
        }
        if (this_ull_CodetoColor >= 10) {
            com.beardedhen.androidbootstrap.BootstrapButton CodetoColor10 = (com.beardedhen.androidbootstrap.BootstrapButton) findViewById(R.id.CodetoColor10);
            CodetoColor10.setLeftIcon("fa-unlock");
        }
        if (this_ull_ColortoCode >= 6) {
            com.beardedhen.androidbootstrap.BootstrapButton ColortoCode6 = (com.beardedhen.androidbootstrap.BootstrapButton) findViewById(R.id.ColortoCode6);
            ColortoCode6.setLeftIcon("fa-unlock");
        }
        if (this_ull_ColortoCode >= 7) {
            com.beardedhen.androidbootstrap.BootstrapButton ColortoCode7 = (com.beardedhen.androidbootstrap.BootstrapButton) findViewById(R.id.ColortoCode7);
            ColortoCode7.setLeftIcon("fa-unlock");
        }
        if (this_ull_ColortoCode >= 8) {
            com.beardedhen.androidbootstrap.BootstrapButton ColortoCode8 = (com.beardedhen.androidbootstrap.BootstrapButton) findViewById(R.id.ColortoCode8);
            ColortoCode8.setLeftIcon("fa-unlock");
        }
        if (this_ull_ColortoCode >= 9) {
            com.beardedhen.androidbootstrap.BootstrapButton ColortoCode9 = (com.beardedhen.androidbootstrap.BootstrapButton) findViewById(R.id.ColortoCode9);
            ColortoCode9.setLeftIcon("fa-unlock");
        }
        if (this_ull_ColortoCode >= 10) {
            com.beardedhen.androidbootstrap.BootstrapButton ColortoCode10 = (com.beardedhen.androidbootstrap.BootstrapButton) findViewById(R.id.ColortoCode10);
            ColortoCode10.setLeftIcon("fa-unlock");
        }

        //-----------------↓TestData↓-----------------.
        this_ull_ColortoCode = 8;
        this_ull_CodetoColor = 7;
        //------------------↑TestData↑--------------ー
    }

    public void ColortoCode6(View v) {
        level = 6;
        if (this_ull_ColortoCode >= 6) {
            maxlimit = 105;
            minlimit = 85;
            intent_ColortoCode();
        } else {
            req_level = level - 1;
            req_nocomp = 4;
            req_Point = 240;
            plus = "";
            lockedmessage();
        }
    }

    public void ColortoCode7(View v) {
        level = 7;
        if (this_ull_ColortoCode >= 7) {
            maxlimit = 85;
            minlimit = 65;
            intent_ColortoCode();
        } else {
            req_level = level - 1;
            req_nocomp = 5;
            req_Point = 320;
            plus = "CodetoColorのLevel5をUnlockしてください。";
            lockedmessage();
        }
    }

    public void ColortoCode8(View v) {
        level = 8;
        if (this_ull_ColortoCode >= 8) {
            maxlimit = 65;
            minlimit = 45;
            intent_ColortoCode();
        } else {
            req_level = level - 1;
            req_nocomp = 6;
            req_Point = 425;
            plus = "";
            lockedmessage();
        }
    }

    public void ColortoCode9(View v) {
        level = 9;
        if (this_ull_ColortoCode >= 9) {
            maxlimit = 45;
            minlimit = 30;
            intent_ColortoCode();
        } else {
            req_level = level - 1;
            req_nocomp = 7;
            req_Point = 560;
            plus = "CodetoColorのLevel7をUnlockしてください。";
            lockedmessage();
        }
    }

    public void ColortoCode10(View v) {
        level = 10;
        if (this_ull_ColortoCode >= 10) {
            maxlimit = 30;
            minlimit = 20;
            intent_ColortoCode();
        } else {
            req_level = level - 1;
            req_nocomp = 8;
            req_Point = 750;
            plus = "";
            lockedmessage();
        }
    }

    public void CodetoColor6(View v) {
        level = 6;
        if (this_ull_CodetoColor >= 6) {
            maxlimit = 105;
            minlimit = 85;
            intent_CodetoColor();
        } else {
            req_level = level - 1;
            req_nocomp = 4;
            req_Point = 240;
            plus = "";
            lockedmessage();
        }
    }

    public void CodetoColor7(View v) {
        level = 7;
        if (this_ull_CodetoColor >= 7) {
            maxlimit = 85;
            minlimit = 65;
            intent_CodetoColor();
        } else {
            req_level = level - 1;
            req_nocomp = 5;
            req_Point = 320;
            plus = "ColortoCodeのLevel5をUnlockしてください。";
            lockedmessage();
        }
    }

    public void CodetoColor8(View v) {
        level = 8;
        if (this_ull_CodetoColor >= 8) {
            maxlimit = 65;
            minlimit = 45;
            intent_CodetoColor();
        } else {
            req_level = level - 1;
            req_nocomp = 6;
            req_Point = 425;
            plus = "";
            lockedmessage();
        }
    }

    public void CodetoColor9(View v) {
        level = 9;
        if (this_ull_CodetoColor >= 9) {
            maxlimit = 45;
            minlimit = 30;
            intent_CodetoColor();
        } else {
            req_level = level - 1;
            req_nocomp = 7;
            req_Point = 560;
            plus = "ColortoCodeのLevel7をUnlockしてください。";
            lockedmessage();
        }
    }

    public void CodetoColor10(View v) {
        level = 10;
        if (this_ull_CodetoColor >= 10) {
            maxlimit = 30;
            minlimit = 20;
            intent_CodetoColor();
        } else {
            req_level = level - 1;
            req_nocomp = 8;
            req_Point = 750;
            plus = "";
            lockedmessage();
        }
    }

    public void lockedmessage() {
        new AlertDialog.Builder(menu3Activity.this)
                .setTitle("Lockされています。")
                .setMessage("Level" + req_level + "を" + req_nocomp + "回以上クリアし、" + req_Point + "以上獲得してください。" + plus)
                .setPositiveButton("OK", null)
                .show();
    }

    public void intent_ColortoCode() {
        setnum.selectAll();
        String num = setnum.getText().toString();
        if (num.equals("")) {
            number = 0;
        } else {
            number = Integer.parseInt(num);
        }
        if (number > 0) {
            new AlertDialog.Builder(menu3Activity.this)
                    .setTitle("ColortoCodeをStartしますか？")
                    .setMessage("問題は" + number + "問です。" + now_nocomp + "回クリアしています。")
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            // OK button pressed
                            Intent intent = new Intent(menu3Activity.this, ColortoCodeActivity.class);
                            intent.putExtra("getnumber", number);
                            intent.putExtra("getmaxlimit", maxlimit);
                            intent.putExtra("getminlimit", minlimit);
                            intent.putExtra("getlevel", level);
                            intent.putExtra("getcolormode", colormode);
                            startActivity(intent);
                        }
                    })
                    .setNegativeButton("Cancel", null)
                    .show();

        } else {
            new AlertDialog.Builder(menu3Activity.this)
                    .setTitle("ColortoCodeをStartできません。")
                    .setMessage("入力した内容を確認してください。")
                    .setPositiveButton("OK", null)
                    .show();
        }
    }

    public void intent_CodetoColor() {
        setnum.selectAll();
        String num = setnum.getText().toString();
        if (num.equals("")) {
            number = 0;
        } else {
            number = Integer.parseInt(num);
        }
        if (number > 0) {

            new AlertDialog.Builder(menu3Activity.this)
                    .setTitle("CodetoColorをStartしますか？")
                    .setMessage("問題は" + number + "問です。" + now_nocomp + "回クリアしています。")
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            // OK button pressed
                            Intent intent = new Intent(menu3Activity.this, CodetoColorActivity.class);
                            intent.putExtra("getnumber", number);
                            intent.putExtra("getmaxlimit", maxlimit);
                            intent.putExtra("getminlimit", minlimit);
                            intent.putExtra("getlevel", level);
                            intent.putExtra("getcolormode", colormode);
                            startActivity(intent);
                        }
                    })
                    .setNegativeButton("Cancel", null)
                    .show();

        } else {
            new AlertDialog.Builder(menu3Activity.this)
                    .setTitle("CodetoColorをStartできません。")
                    .setMessage("入力した内容を確認してください。")
                    .setPositiveButton("OK", null)
                    .show();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menu3, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
