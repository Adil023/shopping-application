package com.adilgadirov;

import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
public class DiscoveryServiceApplication
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
