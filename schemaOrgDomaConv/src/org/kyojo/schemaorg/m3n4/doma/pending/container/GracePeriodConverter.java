package org.kyojo.schemaorg.m3n4.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.GRACE_PERIOD;
import org.kyojo.schemaorg.m3n4.pending.Container.GracePeriod;

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