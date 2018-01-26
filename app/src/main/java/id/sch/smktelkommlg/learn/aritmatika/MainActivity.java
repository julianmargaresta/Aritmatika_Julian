package id.sch.smktelkommlg.learn.aritmatika;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editRupiah;
    RadioButton radioDolar, radioEuro;
    Button btnokKonversi;
    TextView txHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editRupiah = findViewById(R.id.editRP);
        radioDolar = findViewById(R.id.Dolar);
        radioEuro = findViewById(R.id.Euro);
        btnokKonversi = findViewById(R.id.BtnOK);
        txHasil = findViewById(R.id.TxHasil);

        btnokKonversi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nilairupiah = editRupiah.getText().toString();
                if (radioDolar.isChecked()) {
                    double hasil = Double.parseDouble(nilairupiah) / 13000;
                    String result = Double.toString(hasil);
                    txHasil.setText(result);
                }
                if (radioEuro.isChecked()) {
                    double hasil = Double.parseDouble(nilairupiah) / 15000;
                    String result = Double.toString(hasil);
                    txHasil.setText(result);

                }
            }
        });
    }
}
