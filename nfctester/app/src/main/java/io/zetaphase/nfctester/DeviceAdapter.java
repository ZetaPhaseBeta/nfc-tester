package io.zetaphase.nfctester;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xeliot on 4/30/17.
 */

public class DeviceAdapter extends ArrayAdapter<Device>{
    private Context context;
    private List<Device> deviceList;

    public DeviceAdapter(Context context, int resource, ArrayList<Device> dishes){
        super(context, resource, dishes);
        this.context = context;
        this.deviceList = dishes;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        Device dish = deviceList.get(position);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(MainActivity.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.device_row, null);

        /*
        TextView title = (TextView) view.findViewById(R.id.dishRowName);
        TextView description = (TextView) view.findViewById(R.id.dishRowDescription);
        ImageView image = (ImageView) view.findViewById(R.id.dishRowImage);
        RatingBar rating = (RatingBar) view.findViewById(R.id.dishRowRating);


        title.setText(dish.getTitle());
        description.setText(dish.getDescription());
        image.setImageBitmap(dish.getBitmap());
        rating.setRating(dish.getRating());
        */

        return view;
    }
}
