package org.kyojo.schemaorg.m3n3.core.b00lean;

import org.kyojo.schemaorg.SampleValue;
import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n3.core.B00lean;

public class FALSE implements B00lean.False {

	private static final long serialVersionUID = 1L;

	public FALSE() {
	}

	@Override
	public String value() {
		return B00lean.False.class.getAnnotation(SampleValue.class).value();
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
