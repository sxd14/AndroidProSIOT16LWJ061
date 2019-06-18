package cn.gdptc.xxgcx.androidprosiot16lwj061;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class ExerciseActivity extends Activity {
CheckBox ckkBoxtop20ptionA,ckkBoxtop20ptionB,ckkBoxtop20ptionC,ckkBoxtop20ptionD;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);
        initUI();
    }
    public void initUI(){
        ckkBoxtop20ptionA=findViewById(R.id.chk_exercise_top2OptionA);
        ckkBoxtop20ptionB=findViewById(R.id.chk_exercise_top2OptionB);
        ckkBoxtop20ptionC=findViewById(R.id.chk_exercise_top2OptionC);
        ckkBoxtop20ptionD=findViewById(R.id.chk_exercise_top2OptionD);

    }
    public void checkBoxOnClicked(View view){
        Toast makeText;(getApplicationContext();"点击了CheckBox",Toast.LENGTH_SHORT)show();

    }
    public void checkedonClick(View view){
        //wanshangaifangfa
        CheckBox chkOption=(CheckBox)view;
        //String msg=chkOption.getText().toString().trim();
        //Toast.makeText(getApplicationContext().msg.Toast)
                boolean[] answers={false,false,false,false};
        int id=view.getId();
        switch (id){
            case R.id.chk_exercise_top2OptionA:
                if(chkOption.isChecked()){
                    answers[0]=true;
                }else{
                    answers[0]=false;
                }
                break;
            case R.id.chk_exercise_top2OptionB:
                if(chkOption.isChecked()){
                    answers[1]=true;
                }else{
                    answers[1]=false;
                }
                break;
            case R.id.chk_exercise_top2OptionC:
                if(chkOption.isChecked()){
                    answers[2]=true;
                }else{
                    answers[2]=false;
                }
                break;
            case R.id.chk_exercise_top2OptionD:
                if(chkOption.isChecked()){
                    answers[3]=true;
                }else{
                    answers[3]=false;
                }
                break;


        }
        String msg ="A:"+String.valueOf(answers[0]+"B:"+String.valueOf(answers[1]+"C:"+String.valueOf(answers[2])+"D:"+String.valueOf(answers[3])));
                Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_LONG).show();



    }

}
