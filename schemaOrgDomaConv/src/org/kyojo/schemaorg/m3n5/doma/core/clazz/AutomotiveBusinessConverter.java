package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.AUTOMOTIVE_BUSINESS;
import org.kyojo.schemaorg.m3n5.core.Clazz.AutomotiveBusiness;

@ExternalDomain
public class AutomotiveBusinessConverter implements DomainConverter<AutomotiveBusiness, String> {

	@Override
	public String fromDomainToValue(AutomotiveBusiness domain) {
		return domain.getNativeValue();
	}

	@Override
	public AutomotiveBusiness fromValueToDomain(String value) {
		return new AUTOMOTIVE_BUSINESS(value);
	}

}
