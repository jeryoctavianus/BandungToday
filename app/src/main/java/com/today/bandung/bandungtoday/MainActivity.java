package com.today.bandung.bandungtoday;

import android.os.Bundle;
import android.renderscript.Sampler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Spinner spinner;
    private TextView temp, humid, uv, wind, rain;
    private static final String[] paths = {"Batununggual", "Bojong Koneng Atas", "Cigadung", "Arjuna", "Husen Sastranegara", "Pamoyanan", "Pajajaran", "Pasirkaliki", "Sukaraja", "ITB", "Burangrang", "Cikawao", "Malabar", "Paledang", "Pasirluyu"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner)findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_spinner_item,paths);

        temp = (TextView) findViewById(R.id.textView2);
        humid = (TextView) findViewById(R.id.textView5);
        uv = (TextView) findViewById(R.id.textView7);
        wind = (TextView) findViewById(R.id.textView9);
        rain = (TextView) findViewById(R.id.textView11);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {
        switch (position) {
            case 0:
                temp.setText("80");
                //http://45.126.133.197:9200/cuaca-elk/_search?q=sensor_id:IBANDUNG10&size=1&sort=@timestamp:desc&_source=tempf
                humid.setText("");
                uv.setText("");
                wind.setText("");
                rain.setText("");
                break;
            case 1:
                temp.setText("90");
                humid.setText("");
                uv.setText("");
                wind.setText("");
                rain.setText("");
                break;
            case 2:
                temp.setText("73");
                humid.setText("");
                uv.setText("");
                wind.setText("");
                rain.setText("");
                break;
            case 3:
                temp.setText("");
                humid.setText("");
                uv.setText("");
                wind.setText("");
                rain.setText("");
                break;
            case 4:
                temp.setText("");
                humid.setText("");
                uv.setText("");
                wind.setText("");
                rain.setText("");
                break;
            case 5:
                temp.setText("");
                humid.setText("");
                uv.setText("");
                wind.setText("");
                rain.setText("");
                break;
            case 6:
                temp.setText("");
                humid.setText("");
                uv.setText("");
                wind.setText("");
                rain.setText("");
                break;
            case 7:
                temp.setText("");
                humid.setText("");
                uv.setText("");
                wind.setText("");
                rain.setText("");
                break;
            case 8:
                temp.setText("");
                humid.setText("");
                uv.setText("");
                wind.setText("");
                rain.setText("");
                break;
            case 9:
                temp.setText("");
                humid.setText("");
                uv.setText("");
                wind.setText("");
                rain.setText("");
                break;
            case 10:
                temp.setText("");
                humid.setText("");
                uv.setText("");
                wind.setText("");
                rain.setText("");
                break;
            case 11:
                temp.setText("");
                humid.setText("");
                uv.setText("");
                wind.setText("");
                rain.setText("");
                break;
            case 12:
                temp.setText("");
                humid.setText("");
                uv.setText("");
                wind.setText("");
                rain.setText("");
                break;
            case 13:
                temp.setText("");
                humid.setText("");
                uv.setText("");
                wind.setText("");
                rain.setText("");
                break;
            case 14:
                temp.setText("");
                humid.setText("");
                uv.setText("");
                wind.setText("");
                rain.setText("");
                break;
            case 15:
                temp.setText("");
                humid.setText("");
                uv.setText("");
                wind.setText("");
                rain.setText("");
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
