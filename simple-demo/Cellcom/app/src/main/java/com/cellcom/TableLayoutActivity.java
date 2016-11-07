package com.cellcom;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.cellcom.util.SimpleToast;

public class TableLayoutActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.table_layout);
    }

    public void showDate(View view) {
        EditText account = (EditText) findViewById(R.id.username);
        EditText password = (EditText) findViewById(R.id.password);
        SimpleToast.show(TableLayoutActivity.this, String.format("用户名：%s，密码：%s", account.getText(), password.getText()));
    }
}
