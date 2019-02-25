package temple.edu;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Spinner colorSpinner =  findViewById (R.id.spinner);

        Resources res = getResources();
        final String[] colorList = res.getStringArray(R.array.colorsArray);

        //final String colorList[] = {"None", "Red", "Yellow", "Green", "Cyan", "Blue", "Magenta", "Black", "Darkgray", "Gray", "Lightgray", "White"};//I had pink orange and another color here but When I ran it crashed
        final String engColorList[] = {"None", "Red", "Yellow", "Green", "Cyan", "Blue", "Magenta", "Black", "Darkgray", "Gray", "Lightgray", "White"};//I had pink orange and another color here but When I ran it crashed


        ColorAdapter spinnerColorsDropdown = new ColorAdapter(MainActivity.this, colorList, engColorList);
        colorSpinner.setAdapter(spinnerColorsDropdown);
        colorSpinner.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {

                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        if(engColorList[position].equals("None")){
                        }
                        else{
                            Intent launchSecondActivity = new Intent(MainActivity.this, CanvasActivity.class);
                            launchSecondActivity.putExtra("usernameInput",  engColorList[position]);
                            startActivity(launchSecondActivity);
                        }
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> arg0) {

                    }
                }
        );
    }
}
