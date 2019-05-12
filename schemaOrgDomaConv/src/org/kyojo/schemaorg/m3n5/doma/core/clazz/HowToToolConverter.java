package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.HOW_TO_TOOL;
import org.kyojo.schemaorg.m3n5.core.Clazz.HowToTool;

@ExternalDomain
public class HowToToolConverter implements DomainConverter<HowToTool, String> {

	@Override
	public String fromDomainToValue(HowToTool domain) {
		return domain.getNativeValue();
	}

	@Override
	public HowToTool fromValueToDomain(String value) {
		return new HOW_TO_TOOL(value);
	}

}
