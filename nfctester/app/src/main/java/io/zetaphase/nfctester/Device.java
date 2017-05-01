package io.zetaphase.nfctester;

/**
 * Created by xeliot on 4/30/17.
 */

public class Device {
    private String name;

    public Device(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public String toString(){
        return this.name;
    }
}