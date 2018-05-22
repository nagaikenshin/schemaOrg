package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.LOCAL_BUSINESS;
import org.kyojo.schemaOrg.m3n3.core.Clazz.LocalBusiness;

@ExternalDomain
public class LocalBusinessConverter implements DomainConverter<LocalBusiness, String> {

	@Override
	public String fromDomainToValue(LocalBusiness domain) {
		return domain.getNativeValue();
	}

	@Override
	public LocalBusiness fromValueToDomain(String value) {
		return new LOCAL_BUSINESS(value);
	}

}
