package mx.edu.tesoem.isc.p67s2120222gerh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RestaActivity extends AppCompatActivity {
    EditText txtnum3,txtnum4;
    TextView lblresultado2;
    Button btncalcula2, btnregresa2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resta);

        txtnum3 = findViewById(R.id.txtnum3);
        txtnum4 = findViewById(R.id.txtnum4);
        lblresultado2 = findViewById(R.id.lblresultado2);

        btncalcula2 = findViewById(R.id.btncalcula2);
        btncalcula2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num3 = Integer.parseInt(txtnum3.getText().toString());
                int num4 = Integer.parseInt(txtnum4.getText().toString());

                lblresultado2.setText("La resta es: "+String.valueOf(num3-num4));
            }
        });

        btnregresa2 = findViewById(R.id.btnregresa2);
        btnregresa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { onBackPressed();

            }
        });


    }
}