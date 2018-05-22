package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.HOW_TO;
import org.kyojo.schemaOrg.m3n3.core.Clazz.HowTo;

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
