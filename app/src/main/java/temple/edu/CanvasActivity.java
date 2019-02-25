package temple.edu;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CanvasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);

        Bundle main = getIntent().getExtras();
        String color = main.getString("usernameInput");
        Button close = findViewById(R.id.closeActivityButton);
        close.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 CanvasActivity.this.finish();
             }
         });

        getWindow().getDecorView().setBackgroundColor(Color.parseColor(color));

        if(color.equals("White") || color.equals("Cyan") || color.equals("Lightgray") || color.equals("Yellow")) {
            close.setTextColor(Color.parseColor("Black"));
        }
        else {
            close.setTextColor(Color.parseColor("White"));
        }
        close.setTextSize(24);
    }
}
