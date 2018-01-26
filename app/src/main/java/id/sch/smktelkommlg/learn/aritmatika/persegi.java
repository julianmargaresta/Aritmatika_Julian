package id.sch.smktelkommlg.learn.aritmatika;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class persegi extends AppCompatActivity {
    private EditText editSisi, editLuas, editKeliling;
    private Button OK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);

        initUI();
        initEvent();
    }

    private void initEvent() {
        OK.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                hitungLuas();
                hitungKeliling();
            }

            private void hitungKeliling() {
                int sisi = Integer.parseInt(editSisi.getText().toString());
                int keliling = 4 * sisi;
                editKeliling.setText(keliling + "");
            }

            private void hitungLuas() {
                int sisi = Integer.parseInt(editSisi.getText().toString());
                int Luas = sisi * sisi;
                editLuas.setText(Luas + "");
            }
        });
    }

    private void initUI() {
        editSisi = findViewById(R.id.SisiPersegi);
        editLuas = findViewById(R.id.LuasPersegi);
        editKeliling = findViewById(R.id.KelilingPersegi);
        OK = findViewById(R.id.BtnOK);

    }
}
