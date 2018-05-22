package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.AUTOMOTIVE_BUSINESS;
import org.kyojo.schemaOrg.m3n3.core.Clazz.AutomotiveBusiness;

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
