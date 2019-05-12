package org.kyojo.schemaorg.m3n5.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.BY_MONTH_DAY;
import org.kyojo.schemaorg.m3n5.pending.Container.ByMonthDay;

@ExternalDomain
public class ByMonthDayConverter implements DomainConverter<ByMonthDay, Long> {

	@Override
	public Long fromDomainToValue(ByMonthDay domain) {
		return domain.getNativeValue();
	}

	@Override
	public ByMonthDay fromValueToDomain(Long value) {
		return new BY_MONTH_DAY(value);
	}

}
