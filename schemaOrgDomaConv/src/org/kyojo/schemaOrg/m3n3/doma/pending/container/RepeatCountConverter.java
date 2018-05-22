package org.kyojo.schemaOrg.m3n3.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.REPEAT_COUNT;
import org.kyojo.schemaOrg.m3n3.pending.Container.RepeatCount;

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
