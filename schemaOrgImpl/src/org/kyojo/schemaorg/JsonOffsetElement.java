package org.kyojo.schemaorg;

import java.util.LinkedList;
import java.util.List;

public class JsonOffsetElement {

	public JsonElementType type;
	public Integer start;
	public List<JsonOffsetElement> children = new LinkedList<>();
	public Integer firstValueIndex;
	public Integer lastValueIndex;
	public Integer end;
	public JsonObjectPhase objectPhase;
	public JsonArrayPhase arrayPhase;
	public String jsonLdId;
	public String jsonLdType;
	public boolean onlyString;

	public enum JsonElementType {
		MARGIN,
		V_FALSE,
		V_NULL,
		V_TRUE,
		V_OBJECT,
		V_ARRAY,
		V_NUMBER,
		V_STRING,
		COLON,
		COMMA
	}

	public enum JsonObjectPhase {
		LEFT,
		KEY,
		COLON,
		VALUE,
		COMMA,
		RIGHT
	}

	public enum JsonArrayPhase {
		LEFT,
		VALUE,
		COMMA,
		RIGHT
	}

}
