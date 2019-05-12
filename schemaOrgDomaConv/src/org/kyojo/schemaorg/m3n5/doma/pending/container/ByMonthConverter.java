package org.kyojo.schemaorg.m3n5.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.BY_MONTH;
import org.kyojo.schemaorg.m3n5.pending.Container.ByMonth;

@ExternalDomain
public class ByMonthConverter implements DomainConverter<ByMonth, Long> {

	@Override
	public Long fromDomainToValue(ByMonth domain) {
		return domain.getNativeValue();
	}

	@Override
	public ByMonth fromValueToDomain(Long value) {
		return new BY_MONTH(value);
	}

}
