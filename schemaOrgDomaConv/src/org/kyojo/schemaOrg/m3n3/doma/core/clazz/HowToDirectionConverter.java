package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.HOW_TO_DIRECTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.HowToDirection;

@ExternalDomain
public class HowToDirectionConverter implements DomainConverter<HowToDirection, String> {

	@Override
	public String fromDomainToValue(HowToDirection domain) {
		return domain.getNativeValue();
	}

	@Override
	public HowToDirection fromValueToDomain(String value) {
		return new HOW_TO_DIRECTION(value);
	}

}
