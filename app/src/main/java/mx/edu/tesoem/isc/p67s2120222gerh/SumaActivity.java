package mx.edu.tesoem.isc.p67s2120222gerh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SumaActivity extends AppCompatActivity {

    EditText txtnum1, txtnum2;
    Button btncalcula, btnregresa;
    TextView lblresultado1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma);

        txtnum1 = findViewById(R.id.txtnum1);
        txtnum2 = findViewById(R.id.txtnum2);
        lblresultado1 = findViewById(R.id.lblresultado1);

        btncalcula = findViewById(R.id.btncalcula);
        btncalcula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(txtnum1.getText().toString());
                int num2 = Integer.parseInt(txtnum2.getText().toString());

                lblresultado1.setText("La suma es: "+String.valueOf(num1 + num2));
            }
        });


        btnregresa = findViewById(R.id.btnregresa);
        btnregresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { onBackPressed();

            }
        });

    }
}