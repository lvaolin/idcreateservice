package com.dhy.spi;

import java.sql.Driver;
import java.sql.SQLException;
import java.util.ServiceLoader;

public class Test2 {

    public static void main(String[] args) throws SQLException {

        ServiceLoader<MyDriver> serviceLoader = ServiceLoader.load(MyDriver.class);
        for (MyDriver driverService: serviceLoader){
            System.out.println(driverService.getClass().getName());
        }



    }

}
