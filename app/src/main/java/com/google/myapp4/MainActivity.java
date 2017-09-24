package com.google.myapp4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static android.R.attr.onClick;

public class MainActivity extends AppCompatActivity {

    /*private ImageView img1;
    private EditText etext1, etext2, etext3, etext4, etext5;
    private Button boton1;*/

    //paso 2
    @BindView(R.id.etext1) EditText etext1;
    @BindView(R.id.etext2) EditText etext2;
    @BindView(R.id.etext3) EditText etext3;
    @BindView(R.id.etext4) EditText etext4;
    @BindView(R.id.etext5) EditText etext5;
    @BindView(R.id.boton1) Button boton1;
    @BindView(R.id.img1) ImageView img1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //paso1
        ButterKnife.bind(this);

        /*img1 = (ImageView) findViewById(R.id.img1);
        etext1 = (EditText) findViewById(R.id.etext1);
        etext2 = (EditText) findViewById(R.id.etext2);
        etext3 = (EditText) findViewById(R.id.etext3);
        etext4 = (EditText) findViewById(R.id.etext4);
        etext5 = (EditText) findViewById(R.id.etext5);
        boton1 = (Button) findViewById(R.id.boton1);

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast toast = Toast.makeText(getApplicationContext(),"Datos guardados",Toast.LENGTH_LONG).show();

                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });*/


        }


    @OnClick(R.id.boton1) public void onButtonClick(){
        Toast.makeText(this,"Hola", Toast.LENGTH_LONG).show();


    }
}
