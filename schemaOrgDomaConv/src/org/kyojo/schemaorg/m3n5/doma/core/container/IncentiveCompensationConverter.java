package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.INCENTIVE_COMPENSATION;
import org.kyojo.schemaorg.m3n5.core.Container.IncentiveCompensation;

@ExternalDomain
public class IncentiveCompensationConverter implements DomainConverter<IncentiveCompensation, String> {

	@Override
	public String fromDomainToValue(IncentiveCompensation domain) {
		return domain.getNativeValue();
	}

	@Override
	public IncentiveCompensation fromValueToDomain(String value) {
		return new INCENTIVE_COMPENSATION(value);
	}

}
