package com.bkdn.nqminh.problem_6_event;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText edita;
    EditText editb;
    TextView txtkq1;
    TextView txtkq2;
    TextView txtkq3;
    Button btn_hieu;
    Button btn_tich;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edita = (EditText) findViewById(R.id.editsoa);
        editb = (EditText) findViewById(R.id.editsob);
        txtkq1 = (TextView) findViewById(R.id.txtkq1);
        txtkq2 = (TextView) findViewById(R.id.txtkq2);
        txtkq3 = (TextView) findViewById(R.id.txtkq3);
        btn_hieu = (Button) findViewById(R.id.btn_hieu);
        btn_tich = (Button) findViewById(R.id.btn_tich);

        btn_hieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtkq2.setText(Integer.parseInt(edita.getText().toString())
                        - Integer.parseInt(editb.getText().toString())+"");
            }
        });

        btn_tich.setOnClickListener(this);
    }

    public void btn_tong2so(View v) {
        txtkq1.setText(Integer.parseInt(edita.getText().toString())
                + Integer.parseInt(editb.getText().toString())+"");
    }

    @Override
    public void onClick(View v) {
        txtkq3.setText(Integer.parseInt(edita.getText().toString())
                * Integer.parseInt(editb.getText().toString())+"");
    }
}
