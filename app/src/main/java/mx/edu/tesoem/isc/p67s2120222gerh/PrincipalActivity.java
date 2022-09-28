package mx.edu.tesoem.isc.p67s2120222gerh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PrincipalActivity extends AppCompatActivity {

    Button btnsuma, btnresta, btnmul, btndiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        btnsuma = findViewById(R.id.btnsuma);
        btnresta = findViewById(R.id.btnresta);
        btnmul = findViewById(R.id.btnmul);
        btndiv = findViewById(R.id.btndiv);

        btnsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PrincipalActivity.this,SumaActivity.class);
                startActivity(intent);
            }

        });

        btnresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PrincipalActivity.this,RestaActivity.class);
                startActivity(intent);
            }
        });

        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PrincipalActivity.this,MultiActivity.class);
                startActivity(intent);
            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PrincipalActivity.this,DivActivity.class);
                startActivity(intent);
            }
        });
    }
}