package recyclerapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.recyclerapplication.R;

public class MainActivity extends AppCompatActivity {

    Button makepoints,shopping,coins,gifts,support;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        makepoints=(Button)findViewById(R.id.makepoints);
        shopping=(Button)findViewById(R.id.shopping);
        coins=(Button)findViewById(R.id.createcoins);
        gifts=(Button)findViewById(R.id.gifts);
        support=(Button)findViewById(R.id.support);

        makepoints.setOnClickListener(new View.OnClickListener(){

         public void onClick(View v)
            {
                Intent intent=new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });

        shopping.setOnClickListener(new Button.OnClickListener(){

            public void onClick(View v)
            {
                Intent intent=new Intent(MainActivity.this, Main3Activity.class);
                startActivity(intent);
            }
        });
        coins.setOnClickListener(new Button.OnClickListener(){

            public void onClick(View v)
            {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });
        gifts.setOnClickListener(new Button.OnClickListener(){

            public void onClick(View v)
            {
                Intent intent=new Intent(MainActivity.this, Main4Activity.class);
                startActivity(intent);
            }
        });
        support.setOnClickListener(new Button.OnClickListener(){

            public void onClick(View v)
            {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });


    }
}