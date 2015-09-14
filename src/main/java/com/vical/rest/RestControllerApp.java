package com.vical.rest;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;

public class RestControllerApp extends ResourceConfig {
	
	public RestControllerApp() {
//		register(PodcastResource.class);
//		register(PodcastLegacyResource.class);
		
		register(RequestContextFilter.class);
//		register(LoggingResponseFilter.class);
//		register(CORSResponseFilter.class);
 
		// register exception mappers
//		register(GenericExceptionMapper.class);
//		register(AppExceptionMapper.class);
//		register(NotFoundExceptionMapper.class);
 
		// register features
		register(JacksonFeature.class);
		register(MultiPartFeature.class);
		
	}
}
