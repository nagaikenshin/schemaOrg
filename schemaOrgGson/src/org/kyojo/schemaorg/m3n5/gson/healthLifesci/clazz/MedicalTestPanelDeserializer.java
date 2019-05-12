package org.kyojo.schemaorg.m3n5.gson.healthLifesci.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.kyojo.gson.JsonDeserializationContext;
import org.kyojo.gson.JsonDeserializer;
import org.kyojo.gson.JsonElement;
import org.kyojo.gson.JsonParseException;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.MEDICAL_TEST_PANEL;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.MedicalTestPanel;
import org.kyojo.schemaorg.m3n5.gson.DeserializerTemplate;

public class MedicalTestPanelDeserializer implements JsonDeserializer<MedicalTestPanel> {

	public static Map<String, Field> fldMap = new HashMap<>();

	@Override
	public MedicalTestPanel deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		if(jsonElement.isJsonPrimitive()) {
			return new MEDICAL_TEST_PANEL(jsonElement.getAsString());
		}

		return DeserializerTemplate.deserializeSub(jsonElement, type, context,
			new MEDICAL_TEST_PANEL(), MedicalTestPanel.class, MEDICAL_TEST_PANEL.class, fldMap);
	}

}
