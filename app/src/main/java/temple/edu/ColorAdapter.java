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


    public ColorAdapter (Context context, String colors[]){
        this.context = context;
        this.colors = colors;
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

        textView.setText(color);
        textView.setTextColor(Color.parseColor("White"));
        textView.setBackgroundColor(Color.parseColor(color));
        textView.setTextSize(22);


        return textView;
    }



}