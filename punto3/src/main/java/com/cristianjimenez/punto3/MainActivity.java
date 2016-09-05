package com.cristianjimenez.punto3;

import android.support.annotation.FloatRange;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioGroup grupo;
    RadioButton radio, radio2, radio3, radio4;
    Button boton;
    TextView texto, texto2;
    EditText text, text2;
    float par1 = 0, par2 = 0, resultado = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grupo = (RadioGroup) findViewById(R.id.radioGroup);
        radio = (RadioButton) findViewById(R.id.radioButton);
        radio2 = (RadioButton) findViewById(R.id.radioButton2);
        radio3 = (RadioButton) findViewById(R.id.radioButton3);
        radio4 = (RadioButton) findViewById(R.id.radioButton4);
        boton = (Button) findViewById(R.id.button);
        texto = (TextView) findViewById(R.id.textView2);
        texto2 = (TextView) findViewById(R.id.textView3);
        text = (EditText) findViewById(R.id.editText);
        text2 = (EditText) findViewById(R.id.editText2);


        grupo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                texto2.setText("");
                texto2.setHint("RESULTADO");

                if (radio.isChecked()){
                    texto.setText("Ingrese los parametros del cuadro:");
                    text.setHint("LADO");
                    text.setVisibility(View.VISIBLE);
                }

                else if (radio2.isChecked()){
                    texto.setText("Ingrese los parametros del triángulo: ");
                    text.setHint("BASE");
                    text2.setHint("ALTURA");
                    text.setVisibility(View.VISIBLE);
                    text2.setVisibility(View.VISIBLE);
                }

                else if (radio3.isChecked()){
                    texto.setText("Ingrese los parametros del rectángulo: ");
                    text.setHint("BASE");
                    text2.setHint("ALTURA");
                    text.setVisibility(View.VISIBLE);
                    text2.setVisibility(View.VISIBLE);
                }

                else if (radio4.isChecked()){
                    texto.setText("Ingrese los parametros del círculo: ");
                    text.setHint("RADIO");
                    text.setVisibility(View.VISIBLE);
                }

            }
        });

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (radio.isChecked()){
                    par1 = Float.parseFloat(text.getText().toString());
                    resultado = par1 * par1;
                    text.setVisibility(View.INVISIBLE);
                    text.setText("");
                    texto.setText("Area de cuadrado: ");
                }

                if (radio2.isChecked()){
                    par1 = Float.parseFloat(text.getText().toString());
                    par2 = Float.parseFloat(text2.getText().toString());
                    resultado = (par1 * par2)/2;
                    text.setVisibility(View.INVISIBLE);
                    text2.setVisibility(View.INVISIBLE);
                    text.setText("");
                    text2.setText("");
                    texto.setText("Area del triángulo: ");
                }

                if (radio3.isChecked()){
                    par1 = Float.parseFloat(text.getText().toString());
                    par2 = Float.parseFloat(text2.getText().toString());
                    resultado = par1 * par2;
                    text.setVisibility(View.INVISIBLE);
                    text2.setVisibility(View.INVISIBLE);
                    text.setText("");
                    text2.setText("");
                    texto.setText("Area del rectángunlo: ");
                }

                if (radio4.isChecked()){
                    par1 = Float.parseFloat(text.getText().toString());
                    resultado = (float) (Math.PI * (par1 * par1));
                    text.setVisibility(View.INVISIBLE);
                    text.setText("");
                    texto.setText("Area del círculo: ");
                }

                texto2.setText(Double.toString(resultado) + " unidades cuadradas");

            }
        });

    }
}
