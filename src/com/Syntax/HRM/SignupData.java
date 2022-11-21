package com.Syntax.HRM;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class SignupData {
    public static void Data() throws IOException {
    String path="HRMData/properties.properties";
    FileInputStream fis=new FileInputStream(path);
    Properties properties=new Properties();
        properties.load(fis);
    }
}
