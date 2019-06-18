package cn.gdptc.xxgcx.androidprosiot16lwj061;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends Activity {
EditText edtTxtAccount,edtTxtRPSW,edtTxtName,edtTxtGrade,edtTxtSNum,edtTxtPhoneNum,edtTxtPSW;
    Button btnRegister,btnReset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        intUI();
        btnRegister.setOnClickListener(new View.OnClickListener(){
           @Override
            public void onClick(View view){
               //将输入的内容 保存到数据库（1.从控件读取内容2.进行逻辑判断（账号是否存在 密码是否一致，手机号码规范否3.保存到数据库））
           String account=edtTxtAccount.getText().toString().trim();
             String psw=edtTxtPSW.getText().toString().trim();
               String rpsw=edtTxtRPSW.getText().toString().trim();
               String name=edtTxtName.getText().toString().trim();
               String grade=edtTxtGrade.getText().toString().trim();
               String sNum=edtTxtSNum.getText().toString().trim();
               String phoneNum=edtTxtPhoneNum.getText().toString().trim();
               //逻辑判断
               if(!psw.equals(rpsw)){
                   Toast.makeText(getApplicationContext(), "密码不一致", Toast.LENGTH_SHORT).show();
               }else{
                   try {
                       long phone = Long.valueOf(phoneNum);
                   }catch (NumberFormatException e){
                       Toast.makeText(getApplicationContext(),"电话号码不正常",Toast.LENGTH_LONG).show();
                   }
                   if(sNum.length()!=11){
                       Toast.makeText(getApplicationContext(),"学号长度不对",Toast.LENGTH_LONG).show();
                   }
                   //
               }
               //3.保存数据



           }
        });
        btnReset.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                edtTxtAccount.setText(null);
                edtTxtPSW.setText(null);
                edtTxtRPSW.setText(null);
                edtTxtName.setText(null);
                edtTxtGrade.setText(null);
                edtTxtSNum.setText(null);
                edtTxtPhoneNum.setText(null);

            }
        });
    }
    protected void intUI(){
        edtTxtAccount=findViewById(R.id.edtTXT_register_account);
        edtTxtPSW=findViewById(R.id.edtTXT_register_password);
                edtTxtRPSW=findViewById(R.id.edtTXT_register_rePassword);
        edtTxtName=findViewById(R.id.edtTXT_register_name);
        edtTxtGrade=findViewById(R.id.edtTXT_register_grade);
        edtTxtSNum=findViewById(R.id.edtTXT_register_sNum);
        edtTxtPhoneNum=findViewById(R.id.edtTXT_register_phoneNum);
        btnRegister=findViewById(R.id.btn_main_register);
        btnReset=findViewById(R.id.btn_register_reset);

    }
}
