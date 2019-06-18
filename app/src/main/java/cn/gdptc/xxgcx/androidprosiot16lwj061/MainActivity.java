package cn.gdptc.xxgcx.androidprosiot16lwj061;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
    //定义一个成员变量
    EditText edtTXTAccount,edtTXTPSW;
    Button btnLogin,btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //分析登录的步骤：1获取输入框；2.读取输入的账号和密码3.作匹配

        initUI();
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String account = edtTXTAccount.getText().toString().trim();
                String password = edtTXTPSW.getText().toString().trim();
                if (account.equals("admin") & password.equals("123456")) {
                    Toast.makeText(MainActivity.this, "登陆成功", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, "登陆失败", Toast.LENGTH_LONG).show();
                }
            }
        });
        btnExit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                finish();

            }
        });

    }
    public void initUI(){btnLogin=findViewById(R.id.btn_main_login);
        btnExit=findViewById(R.id.btn_main_logout);
        edtTXTAccount=findViewById(R.id.edtTXT_main_inputAccount);
        edtTXTPSW=findViewById(R.id.edtTXT_main_password);

    };
    @Override
    protected void onStart() {
        super.onStart();
        // The activity is about to become visible.
    }
    @Override
    protected void onResume() {
        super.onResume();
        // The activity has become visible (it is now "resumed").
    }
    @Override
    protected void onPause() {
        super.onPause();
        // Another activity is taking focus (this activity is about to be "paused").
    }
    @Override
    protected void onStop() {
        super.onStop();
        // The activity is no longer visible (it is now "stopped")
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        // The activity is about to be destroyed.
    }

}
