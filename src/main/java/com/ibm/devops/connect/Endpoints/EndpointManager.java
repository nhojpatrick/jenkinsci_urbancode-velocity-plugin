package com.ibm.devops.connect.Endpoints;

public class EndpointManager {

    // TODO: Make configurable at build time or otherwise
    private static String profile = "Velocity";
    //private static String profile = "YS1";

    private IEndpoints endpointProvider;

    public EndpointManager() {
        if(profile.equals("YS1")) {
            endpointProvider = new EndpointsYS1();
        } else if(profile.equals("Velocity")) {
            endpointProvider = new EndpointsVelocity();
        } else {
            endpointProvider = new EndpointsYP();
        }
    }

    public String getSyncApiEndpoint() {
        return endpointProvider.getSyncApiEndpoint();
    }

    public String getSyncStoreEndpoint() {
        return endpointProvider.getSyncStoreEndpoint();
    }

    public String getConnectEndpoint() {
        return endpointProvider.getConnectEndpoint();
    }
}
