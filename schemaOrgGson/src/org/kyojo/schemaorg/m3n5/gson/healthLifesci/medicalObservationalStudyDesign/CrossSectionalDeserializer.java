package org.kyojo.schemaorg.m3n5.gson.healthLifesci.medicalObservationalStudyDesign;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.medicalObservationalStudyDesign.CROSS_SECTIONAL;
import org.kyojo.schemaorg.m3n5.healthLifesci.MedicalObservationalStudyDesign.CrossSectional;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class CrossSectionalDeserializer implements JsonDeserializer<CrossSectional> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public CrossSectional deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new CROSS_SECTIONAL(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new CROSS_SECTIONAL(), CrossSectional.class, CROSS_SECTIONAL.class, fldMap);
	}

}
