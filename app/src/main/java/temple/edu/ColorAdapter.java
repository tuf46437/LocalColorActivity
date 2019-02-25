package temple.edu;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ColorAdapter extends BaseAdapter {
    Context context;
    String colors[];
    String engColors[];


    public ColorAdapter (Context context, String colors[], String engColors[]){
        this.context = context;
        this.colors = colors;
        this.engColors = engColors;
    }

    @Override
    public int getCount() {
        return colors.length;
    }

    @Override
    public Object getItem(int position) {
        return colors[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView textView = new TextView(context);

        String color = colors[position];
        String engColor = engColors[position];

        textView.setText(color);
        if(position == 0){
            textView.setTextColor(Color.parseColor("Black"));
            textView.setBackgroundColor(Color.parseColor("White"));
            textView.setTextSize(22);
        }
        else{
            if(engColors[position].equals("White") || engColors[position].equals("Cyan") || engColors[position].equals("Lightgray") || engColors[position].equals("Yellow")) {
                textView.setTextColor(Color.parseColor("Black"));
            }
            else {
                textView.setTextColor(Color.parseColor("White"));
            }
            textView.setBackgroundColor(Color.parseColor(engColor));
            textView.setTextSize(22);
        }


        return textView;
    }





}