package com.werewolf.core.publicvariables;

public class SystemInfo {
    private String info;

    public String getInfo(){
       return info==null?null:info;
    }

    public void setInfo(String info){
        this.info = info;
    }
}
