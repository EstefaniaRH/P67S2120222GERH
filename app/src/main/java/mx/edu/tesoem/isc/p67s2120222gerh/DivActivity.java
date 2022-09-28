package mx.edu.tesoem.isc.p67s2120222gerh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DivActivity extends AppCompatActivity {
    EditText txtnum7, txtnum8;
    TextView lblresultado4;
    Button btnregresa4, btncalcula4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_div);

        txtnum7 = findViewById(R.id.txtnum7);
        txtnum8 = findViewById(R.id.txtnum8);

        lblresultado4 = findViewById(R.id.lblresultado4);

        btncalcula4 = findViewById(R.id.btncalcula4);
        btncalcula4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num7 = Integer.parseInt(txtnum7.getText().toString());
                int num8 = Integer.parseInt(txtnum8.getText().toString());

                lblresultado4.setText("El resultado es: "+String.valueOf(num7/num8));
            }
        });

        btnregresa4 = findViewById(R.id.btnregresa4);
        btnregresa4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { onBackPressed();

            }
        });
    }
}