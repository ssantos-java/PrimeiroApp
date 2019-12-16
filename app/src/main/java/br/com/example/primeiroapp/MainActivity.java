package br.com.example.primeiroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private Button buttonLimpar;
    private Button buttonConformar;
    private EditText editText;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonLimpar = findViewById(R.id.buttonLimpar);
        buttonConformar = findViewById(R.id.buttonConfirmar);
        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);

        buttonLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
                textView.setText(getText(R.string.text_padrao));
            }
        });
    }
    public void confirmar(View view){
       textView.setText("Você digitou = "+editText.getText());
    }
}
