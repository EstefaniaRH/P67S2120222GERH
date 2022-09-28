package mx.edu.tesoem.isc.p67s2120222gerh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MultiActivity extends AppCompatActivity {

    TextView lblresultado3;
    EditText txtnum5, txtnum6;
    Button btnregresa3, btncalcula3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi);

        txtnum5 = findViewById(R.id.txtnum5);
        txtnum6 = findViewById(R.id.txtnum6);

        lblresultado3 = findViewById(R.id.lblresultado3);

        btncalcula3 = findViewById(R.id.btncalcula3);
        btncalcula3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num5 = Integer.parseInt(txtnum5.getText().toString());
                int num6 = Integer.parseInt(txtnum6.getText().toString());

                lblresultado3.setText("El resultado es: "+String.valueOf(num5 * num6));
            }
        });

        btnregresa3 = findViewById(R.id.btnregresa3);
        btnregresa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { onBackPressed();

            }
        });
    }
}