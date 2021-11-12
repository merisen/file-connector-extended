package com.softserve;

import static org.mule.runtime.extension.api.annotation.param.MediaType.ANY;

import java.net.URL;
import java.net.URLConnection;

import org.mule.runtime.extension.api.annotation.Alias;
import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.MediaType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomOperations {

	private static final Logger LOGGER = LoggerFactory.getLogger(CustomOperations.class);
	
	@MediaType(value = ANY, strict = false)
	@Alias("GET")
	public String getCall(@Config CustomConfiguration c) {
		String response = null;
		String protocol = c.getProtocol().equals("HTTPS") ? "https://" : "http://";
		
		try {
			URL url = new URL(protocol + c.getHost() + c.getBasepath());
			URLConnection con = url.openConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return response;
	}
}
