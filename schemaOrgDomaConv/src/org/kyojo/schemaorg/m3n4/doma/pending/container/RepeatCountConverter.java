package org.kyojo.schemaorg.m3n4.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.REPEAT_COUNT;
import org.kyojo.schemaorg.m3n4.pending.Container.RepeatCount;

@ExternalDomain
public class RepeatCountConverter implements DomainConverter<RepeatCount, Long> {

	@Override
	public Long fromDomainToValue(RepeatCount domain) {
		return domain.getNativeValue();
	}

	@Override
	public RepeatCount fromValueToDomain(Long value) {
		return new REPEAT_COUNT(value);
	}

}
