package com.example.tugas6;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
public class MainActivity extends AppCompatActivity {
    TextView tvGanjilGenap, tvPrintGanjil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvGanjilGenap = findViewById(R.id.hasilGanjilGenap);
        tvPrintGanjil = findViewById(R.id.hasilPrintGanjil);
        String bil = getIntent().getExtras().getString("bilangan");
        int bill = Integer.parseInt(bil);
        if(bill%2==0)
            tvGanjilGenap.setText(bill + " Adalah bilangan genap");
        else
            tvGanjilGenap.setText(bill + " Adalah bilangan ganjil");
        String cetak = "";
        if(bill%2==0)
            for(int i = 1; i <= bill; i++){
                if(i%2==0)
                    cetak = cetak + (i-1) + " ";
                tvPrintGanjil.setText(cetak);
            }
        else
            for(int i = 0; i <= bill; i++){
                if(i%2!=0)
                    cetak = cetak + i + " ";
                tvPrintGanjil.setText(cetak);
            }
    }
}
