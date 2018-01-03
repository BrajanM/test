package com.example.student.kawiarnia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button wybierz;
    private EditText edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit = (EditText)findViewById(R.id.Edit);
        wybierz = (Button)findViewById(R.id.Pobierz);

        wybierz=(Button)findViewById(R.id.Pobierz);

        wybierz.setOnClickListener(onClick2);
    }
    private View.OnClickListener onClick2=new View.OnClickListener()
    {
        @Override
        public void onClick(View view)
        {
            Intent intent = new Intent(MainActivity.this,Main2Activity.class);
            MainActivity.this.startActivity(intent);
            Bundle bundle=new Bundle();
            intent.putExtras(bundle);
        }
    };
}
