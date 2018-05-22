package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ELIGIBLE_DURATION;
import org.kyojo.schemaOrg.m3n3.core.Container.EligibleDuration;

@ExternalDomain
public class EligibleDurationConverter implements DomainConverter<EligibleDuration, String> {

	@Override
	public String fromDomainToValue(EligibleDuration domain) {
		return domain.getNativeValue();
	}

	@Override
	public EligibleDuration fromValueToDomain(String value) {
		return new ELIGIBLE_DURATION(value);
	}

}
