package com.model.sprbootDemo;

import java.io.BufferedInputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LicenseController {
	
	private Logger logger = Logger.getLogger(LicenseController.class);
	
    @RequestMapping(value = "/devopstest", method = RequestMethod.GET)
    public String demo() throws NoSuchMethodException, SecurityException, ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {	
    	logger.info("DevOpsDemoController is begin:-----------------");	

        return "DevOpsDemoController test";        
        
    }
    
}





