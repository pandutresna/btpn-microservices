package com.btpn.util.json;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

public class JsonUtil {

	public static ObjectMapper generateDefaultJsonMapper() {
		ObjectMapper om = new ObjectMapper();
		
		om.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		om.setSerializationInclusion(Include.NON_EMPTY);

		SimpleFilterProvider simpleFilter = new SimpleFilterProvider();
		simpleFilter.setFailOnUnknownId(false);
		
		om.setFilterProvider(simpleFilter);
		
		return om;
	}
	

	public static ObjectWriter generateDefaultJsonWriter() {
		return generateDefaultJsonMapper().writer();
	}
	
	public static String generateJson(Object obj) throws JsonProcessingException {
		ObjectWriter writer = generateDefaultJsonWriter();
		return writer.writeValueAsString(obj);
	}
	
	public static <T> T parseJson(String json, Class<T> cls) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper om = generateDefaultJsonMapper();
		return om.readValue(json, cls);
	}
	
	public static ObjectWriter generateJsonWriterWithFilter(JsonFilter... filters) {
		ObjectWriter writer = generateDefaultJsonWriter(); 
				
		SimpleFilterProvider simpleFilter = new SimpleFilterProvider();
		for (JsonFilter filter : filters) {
			if (filter.getFieldsException() == null || filter.getFieldsException().length == 0) {
				simpleFilter = simpleFilter.addFilter(filter.getEntity(), SimpleBeanPropertyFilter.serializeAll());
			} else {
				simpleFilter = simpleFilter.addFilter(filter.getEntity(), SimpleBeanPropertyFilter.serializeAllExcept(filter.getFieldsException()));
			}
		}
		return writer.with(simpleFilter);
	}
}
