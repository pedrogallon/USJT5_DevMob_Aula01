package com.pedrogallon.usjt5_devmob_aula02;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import static com.pedrogallon.usjt5_devmob_aula02.MainActivity.TEXTO;

public class DialogActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);

        Bundle extras = getIntent().getExtras();

        TextView textView = findViewById(R.id.mostrar_texto);
        textView.setText(extras.getString(TEXTO));
    }
}
