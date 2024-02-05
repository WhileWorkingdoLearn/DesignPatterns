package org.example.StructuralPattern.Proxy;

import java.util.ArrayList;
import java.util.List;

public class Proxy implements OriginalObject {

    private final OriginalObject originalObject;

    private final List<String> blacklist;

    public Proxy(){
        this.originalObject = new Original();
        this.blacklist = new ArrayList<>();
        this.blacklist.add("adultsxxx.com");
        this.blacklist.add("ntsfw.com");
        this.blacklist.add("abc.com");
    }

    @Override
    public void connectTo(String serverHost) {
            if(blacklist.contains(serverHost.toLowerCase())){
                System.out.println("Connection Denied");
                return;
            }
            originalObject.connectTo(serverHost);
    }
}
