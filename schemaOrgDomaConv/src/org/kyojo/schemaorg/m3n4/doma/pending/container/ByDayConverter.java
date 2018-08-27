package org.kyojo.schemaorg.m3n4.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.BY_DAY;
import org.kyojo.schemaorg.m3n4.pending.Container.ByDay;

@ExternalDomain
public class ByDayConverter implements DomainConverter<ByDay, String> {

	@Override
	public String fromDomainToValue(ByDay domain) {
		return domain.getNativeValue();
	}

	@Override
	public ByDay fromValueToDomain(String value) {
		return new BY_DAY(value);
	}

}
