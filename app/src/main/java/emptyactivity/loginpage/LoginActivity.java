package emptyactivity.loginpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;

public class LoginActivity extends AppCompatActivity {

    Button button;
    TextView textview;
    EditText edittext2, edittext1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        button = (Button) findViewById(R.id.button);
        textview = (TextView) findViewById(R.id.textView);
        edittext1 = (EditText) findViewById(R.id.editText);
        edittext2 = (EditText) findViewById(R.id.editText2);

        setListeners();
    }
    void setListeners(){
        button.setOnClickListener(listener);
    }

     View.OnClickListener listener = new View.OnClickListener() {

         @Override
         public void onClick(View view) {

             if(edittext1.equals("")){
                 Toast.makeText(LoginActivity.this,"欄位不可空白",Toast.LENGTH_SHORT).show();

             }else {
                 Intent intent = new Intent();
                 intent.setClass(LoginActivity.this, UserHomePage.class);
                 Bundle bundle = new Bundle();
                 bundle.putString("etUserName", edittext1.getText().toString());
                 bundle.putString("etPassWord", edittext2.getText().toString());
                 intent.putExtras(bundle);
                 startActivity(intent);
             }
         }
     };

}



