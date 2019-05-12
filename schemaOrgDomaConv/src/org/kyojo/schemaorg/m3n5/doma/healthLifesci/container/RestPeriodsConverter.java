package org.kyojo.schemaorg.m3n5.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.REST_PERIODS;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.RestPeriods;

@ExternalDomain
public class RestPeriodsConverter implements DomainConverter<RestPeriods, String> {

	@Override
	public String fromDomainToValue(RestPeriods domain) {
		return domain.getNativeValue();
	}

	@Override
	public RestPeriods fromValueToDomain(String value) {
		return new REST_PERIODS(value);
	}

}
