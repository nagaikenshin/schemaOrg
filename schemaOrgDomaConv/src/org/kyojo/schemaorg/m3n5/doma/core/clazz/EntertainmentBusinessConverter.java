package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.ENTERTAINMENT_BUSINESS;
import org.kyojo.schemaorg.m3n5.core.Clazz.EntertainmentBusiness;

@ExternalDomain
public class EntertainmentBusinessConverter implements DomainConverter<EntertainmentBusiness, String> {

	@Override
	public String fromDomainToValue(EntertainmentBusiness domain) {
		return domain.getNativeValue();
	}

	@Override
	public EntertainmentBusiness fromValueToDomain(String value) {
		return new ENTERTAINMENT_BUSINESS(value);
	}

}
