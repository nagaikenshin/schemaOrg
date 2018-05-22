package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.HOW_TO_TOOL;
import org.kyojo.schemaOrg.m3n3.core.Clazz.HowToTool;

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
