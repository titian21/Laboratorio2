package com.cristianjimenez.lab2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText texto, texto2;
    Button boton;
    RadioButton radio, radio2, radio3, radio4;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Se relacionan las variables con los objetos fisicos

        texto = (EditText) findViewById(R.id.editText);
        texto2 = (EditText) findViewById(R.id.editText2);
        boton = (Button) findViewById(R.id.button);
        radio = (RadioButton) findViewById(R.id.radioButton);
        radio2 = (RadioButton) findViewById(R.id.radioButton2);
        radio3 = (RadioButton) findViewById(R.id.radioButton3);
        radio4 = (RadioButton) findViewById(R.id.radioButton4);
        text = (TextView) findViewById(R.id.textView);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float resultado = 0, primero, segundo;

                primero = Float.parseFloat(texto.getText().toString());
                segundo = Float.parseFloat(texto2.getText().toString());

                //Se le asigna a las variables checked el valor de falso o verdadero dependiendo si los radiobuttons se encuentran "checkeados"

                boolean checked1 = radio.isChecked();
                boolean checked2 = radio2.isChecked();
                boolean checked3 = radio3.isChecked();
                boolean checked4 = radio4.isChecked();

                //Se verifica cual radiobutton se encuentra activo y se realiza la operación correspondiente

                if (checked1)
                    resultado = primero + segundo;

                if (checked2)
                    resultado = primero - segundo;

                if (checked3)
                    resultado = primero * segundo;

                if (checked4)
                    resultado = primero / segundo;

                    //Se quita el check de todos lo RadioButton

                    radio.setChecked(false);
                    radio2.setChecked(false);
                    radio3.setChecked(false);
                    radio4.setChecked(false);

                text.setText(Float.toString(resultado));

            }
        });

    }
}
