package fauzi.hilmy.quizinvestasi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etInvestasi;
    Button btnCek;
    TextView inves1thn, inves2thn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etInvestasi = (EditText)findViewById(R.id.editText);
        btnCek = (Button) findViewById(R.id.button);
        inves1thn = (TextView) findViewById(R.id.textView);
        inves2thn = (TextView)findViewById(R.id.textView2);

        String satu = etInvestasi.getText().toString();

        Double satU = Double.parseDouble(satu);

        Double SATU = satU * 0.027;
        Double DUA = satU * 2 * 0.027;

        inves1thn.setText("Your Bunga for 1 Tahun Rp." + SATU);
        inves1thn.setText("Your Bunga for 2 Tahun Rp." + DUA);


    }
}
