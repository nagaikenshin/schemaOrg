package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.HOW_TO_DIRECTION;
import org.kyojo.schemaorg.m3n4.core.Clazz.HowToDirection;

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
