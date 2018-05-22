package org.kyojo.schemaOrg.m3n3.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.GRACE_PERIOD;
import org.kyojo.schemaOrg.m3n3.pending.Container.GracePeriod;

@ExternalDomain
public class GracePeriodConverter implements DomainConverter<GracePeriod, String> {

	@Override
	public String fromDomainToValue(GracePeriod domain) {
		return domain.getNativeValue();
	}

	@Override
	public GracePeriod fromValueToDomain(String value) {
		return new GRACE_PERIOD(value);
	}

}
