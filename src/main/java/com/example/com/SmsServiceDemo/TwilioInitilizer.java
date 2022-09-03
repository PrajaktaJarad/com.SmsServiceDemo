package com.example.com.SmsServiceDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import com.twilio.Twilio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Configuration
public class TwilioInitilizer {
	
	
	private final static Logger LOGGER = LoggerFactory.getLogger(TwilioInitilizer.class);

	
	 private final TwilioConfig twilioConfig;
	 
	 @Autowired
	    public TwilioInitilizer(TwilioConfig twilioConfig) {
	        this.twilioConfig = twilioConfig;
	        Twilio.init(                               //initilize connection to twilio api
	        		twilioConfig.getAccountSid(),
	        		twilioConfig.getAuthToken()
	        );
	        LOGGER.info("Twilio initialized ... with account sid {} ", twilioConfig.getAccountSid());
	    }

}
