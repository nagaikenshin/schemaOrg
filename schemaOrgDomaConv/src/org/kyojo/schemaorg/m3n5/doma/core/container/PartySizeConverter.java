package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.PARTY_SIZE;
import org.kyojo.schemaorg.m3n5.core.Container.PartySize;

@ExternalDomain
public class PartySizeConverter implements DomainConverter<PartySize, Long> {

	@Override
	public Long fromDomainToValue(PartySize domain) {
		return domain.getNativeValue();
	}

	@Override
	public PartySize fromValueToDomain(Long value) {
		return new PARTY_SIZE(value);
	}

}
