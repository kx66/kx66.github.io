package com.example.application;
 
import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Toast;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends Activity {
     
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 这里声明↓↓↓↓
	    Button bn = findViewById(R.id.activitymainButton1);
        final TextView tv = findViewById(R.id.activitymainTextView1);
        final EditText et = findViewById(R.id.activitymainEditText1);
        // 这里声明↑↑↑↑
		bn.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v) {
					Toast.makeText(MainActivity.this,"hello",Toast.LENGTH_SHORT).show();
                    
                    String sl = et.getText().toString();
                    
                    tv.setText(sl);
				}
                   
			
		});
        
    }
	                               
}
