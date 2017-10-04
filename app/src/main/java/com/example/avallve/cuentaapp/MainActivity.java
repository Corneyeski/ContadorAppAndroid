package com.example.avallve.cuentaapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    int cuenta = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* TextView miTexto = new TextView(this);

        miTexto.setText("WAZAAAAAh");

        setContentView(miTexto);*/

        //TextView contador = (TextView) R.id.contador;


        Button boton = (Button) findViewById(R.id.reset);
        final TextView contador = (TextView) findViewById(R.id.contador);

        boton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                if(contador.getText().toString().contains("Contador")){
                    contador.setText("Has jakeado el system");
                }else{
                    contador.setText("Contador: ");
                }

                return true;
            }
        });
    }

    protected void setValue(){

        TextView contador = (TextView) findViewById(R.id.contador);

        contador.setText("Contador: " + cuenta);
    }

    protected void increment(View vista){
        cuenta++;
        setValue();
    }

    protected void decrease(View vista){
        cuenta--;
        setValue();
    }

    protected void reset(View vista){
        cuenta = 0;
        setValue();
    }


}
