package org.example.StructuralPattern.Proxy;

public class Original implements OriginalObject {
    @Override
    public void connectTo(String serverHost) {
            System.out.println("Server address received");
            System.out.println("Address is valid");
            System.out.println("Establishing connection to server of " + serverHost);
            System.out.println("Connecting...");
            System.out.println("Connected");
            System.out.println("Loading Page");

    }
}
