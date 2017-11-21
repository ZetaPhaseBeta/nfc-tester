package io.zetaphase.nfctester;

/**
 * Created by xeliot on 4/30/17.
 */

public class Device {
    private String name;
    private String tag;

    public Device(String name){
        this.name = name;
        this.tag = tag;
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