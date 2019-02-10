package temple.edu;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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


        final String colorList[] = {"None", "Red", "Yellow", "Green", "Cyan", "Blue", "Magenta", "Black", "Darkgray", "Gray", "Lightgray", "White"};//I had pink orange and another color here but When I ran it crashed

        ColorAdapter spinnerColorsDropdown = new ColorAdapter(MainActivity.this, colorList);

        colorSpinner.setAdapter(spinnerColorsDropdown);

        colorSpinner.setOnItemSelectedListener(

                new AdapterView.OnItemSelectedListener() {

                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        if(colorList[position].equals("None")){
                        }
                        else{
                            Intent launchSecondActivity = new Intent(MainActivity.this, CanvasActivity.class);
                            launchSecondActivity.putExtra("usernameInput",  colorList[position]);
                            startActivity(launchSecondActivity);
                            //getWindow().getDecorView().setBackgroundColor(Color.parseColor(colorList[position]));//again if I use color.parse here is does not wor
                        }
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> arg0) {

                    }
                }
        );
    }
}
