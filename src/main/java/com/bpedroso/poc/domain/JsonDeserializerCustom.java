package com.bpedroso.poc.domain;

import static com.bpedroso.poc.domain.constants.CustomSerializationAttributes.PREFIX_ATTRIBUTES_FIRST;
import static com.bpedroso.poc.domain.constants.CustomSerializationAttributes.PREFIX_ATTRIBUTES_SECOND;
import static org.apache.commons.lang3.StringUtils.remove;
import static org.apache.commons.lang3.StringUtils.startsWith;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonDeserializerCustom extends JsonDeserializer<JsonOutput> {

	@Override
	public JsonOutput deserialize(JsonParser jp, DeserializationContext arg1)
			throws IOException, JsonProcessingException {

		final ObjectCodec oc = jp.getCodec();
		final JsonNode rootNode = oc.readTree(jp);
		final ObjectMapper mapper = new ObjectMapper();
		final JsonOutput output = mapper.readValue(rootNode.toString(), JsonOutput.class);
		final Map<String, String> attributesMapFirst = new HashMap<>();
		final Map<String, String> attributesMapSecond = new HashMap<>();
		mapAttributes(rootNode, attributesMapFirst, attributesMapSecond);

		output.setAttributesFirst(attributesMapFirst);
		output.setAttributesSecond(attributesMapSecond);
		return output;
	}

	private void mapAttributes(final JsonNode rootNode, final Map<String, String> attributesMapFirst,
			final Map<String, String> attributesMapSecond) {
		rootNode.fields().forEachRemaining(action -> {
			if (startsWith(action.getKey(), PREFIX_ATTRIBUTES_FIRST)) {
				attributesMapFirst.put(remove(action.getKey(), PREFIX_ATTRIBUTES_FIRST), action.getValue().asText());
			} else if (startsWith(action.getKey(), PREFIX_ATTRIBUTES_SECOND)) {
				attributesMapSecond.put(remove(action.getKey(), PREFIX_ATTRIBUTES_SECOND), action.getValue().asText());
			}
		});
	}

}
