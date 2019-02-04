package temple.edu;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.text.Layout;
import android.view.View;
import android.widget.AdapterView;

import android.widget.Spinner;



public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Spinner colorSpinner =  findViewById (R.id.spinner);
        //ListView colorSpinner = findViewById(R.id.MyList);


        final String colorList[] = {"Red", "Yellow", "Green", "Cyan", "Blue", "Gray", "Magenta", "Black"};//I had pink orange and another color here but When I ran it crashed

        ColorAdapter spinnerColorsDropdown = new ColorAdapter(MainActivity.this, colorList);

        colorSpinner.setAdapter(spinnerColorsDropdown);

        colorSpinner.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                        getWindow().getDecorView().setBackgroundColor(Color.parseColor(colorList[position]));//again if I use color.parse here is does not work.
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> arg0) {

                    }
                    //add some code here
                }
        );

    }
}
