package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.FIRST_PERFORMANCE;
import org.kyojo.schemaOrg.m3n3.core.Container.FirstPerformance;

@ExternalDomain
public class FirstPerformanceConverter implements DomainConverter<FirstPerformance, String> {

	@Override
	public String fromDomainToValue(FirstPerformance domain) {
		return domain.getNativeValue();
	}

	@Override
	public FirstPerformance fromValueToDomain(String value) {
		return new FIRST_PERFORMANCE(value);
	}

}
