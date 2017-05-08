package io.zetaphase.nfctester;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xeliot on 4/30/17.
 */

public class DeviceAdapter extends ArrayAdapter<Device>{
    private Context context;
    private List<Device> deviceList;

    public DeviceAdapter(Context context, int resource, ArrayList<Device> devices){
        super(context, resource, devices);
        this.context = context;
        this.deviceList = devices;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        Device device = deviceList.get(position);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(MainActivity.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.device_row, null);

        TextView name = (TextView) view.findViewById(R.id.device_row_name);

        name.setText(device.getName());

        return view;
    }

    public List<Device> getDeviceList(){
        return deviceList;
    }

    public void setDeviceList(ArrayList<Device> deviceList){
        this.deviceList = deviceList;
    }
}
