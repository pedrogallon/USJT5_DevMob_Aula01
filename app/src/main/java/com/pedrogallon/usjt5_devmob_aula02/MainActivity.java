package com.pedrogallon.usjt5_devmob_aula02;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
    public static final String TEXTO = "com.pedrogallon.usjt5_devmob_aula02.texto";
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enviarTexto(View view) {
        editText = findViewById(R.id.texto_inserido);
        String texto = editText.getText().toString();
        Intent intent = new Intent(this, DialogActivity.class);
        intent.putExtra(TEXTO, texto);
        startActivity(intent);
    }
}
