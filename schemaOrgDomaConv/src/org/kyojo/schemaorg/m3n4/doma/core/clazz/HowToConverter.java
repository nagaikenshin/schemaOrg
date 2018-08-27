package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.HOW_TO;
import org.kyojo.schemaorg.m3n4.core.Clazz.HowTo;

@ExternalDomain
public class HowToConverter implements DomainConverter<HowTo, String> {

	@Override
	public String fromDomainToValue(HowTo domain) {
		return domain.getNativeValue();
	}

	@Override
	public HowTo fromValueToDomain(String value) {
		return new HOW_TO(value);
	}

}
