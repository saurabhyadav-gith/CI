package saurabh.digipodium.ci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private EditText editprincipal;
    private EditText edittime;
    private EditText editrate;
    private EditText editperiod;
    private TextView edita;
    private double p;
    private double r;
    private double t;
    private double n;
    private double c;
    private TextView texta;
    private Button btncal;
    private EditText editamount;
    private TextView textaa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        TextView textp = findViewById(R.id.textpr);
//        TextView textr = findViewById(R.id.textr);
//        TextView textpr = findViewById(R.id.textpr);
        TextView textt = findViewById(R.id.textt);
//        textaa = findViewById(R.id.textaa);
        texta = findViewById(R.id.edita);

        editprincipal = findViewById(R.id.editprincipal);
        edittime = findViewById(R.id.edittime);
        editrate = findViewById(R.id.editrate);
//        editperiod = findViewById(R.id.editperiod);
//        editamount = findViewById(R.id.editamount);

        btncal = findViewById(R.id.btncal);




    }

    public void C(View view){
        p = Double.parseDouble(editprincipal.getText().toString());
        r = Double.parseDouble(editrate.getText().toString());
        t = Double.parseDouble(edittime.getText().toString());
//        n = Double.parseDouble(editperiod.getText().toString());
        c = (p*r*t)/100;

        btncal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texta.setText(""+c);
            }
        });



    }
}