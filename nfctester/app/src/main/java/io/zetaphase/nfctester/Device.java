package io.zetaphase.nfctester;

/**
 * Created by xeliot on 4/30/17.
 */

public class Device {
    private String name;
    private String tag;
    private float timeConnected;

    public Device(String name, String tag, String timeStamp){
        this.name = name;
        this.tag = tag;
        //this.timeConnected = parse timestamp string to get float time;
    }

    public void setTimeConnected(float timeConnected) {
        this.timeConnected = timeConnected;
    }

    public float getTimeConnected(){
        return this.timeConnected;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getTag() {
        return this.tag;
    }

    public String toString(){
        return this.name;
    }
}