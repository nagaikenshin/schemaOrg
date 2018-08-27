package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.ENTERTAINMENT_BUSINESS;
import org.kyojo.schemaorg.m3n4.core.Container.EntertainmentBusiness;

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
