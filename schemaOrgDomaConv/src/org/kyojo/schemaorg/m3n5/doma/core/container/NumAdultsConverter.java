package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.NUM_ADULTS;
import org.kyojo.schemaorg.m3n5.core.Container.NumAdults;

@ExternalDomain
public class NumAdultsConverter implements DomainConverter<NumAdults, Long> {

	@Override
	public Long fromDomainToValue(NumAdults domain) {
		return domain.getNativeValue();
	}

	@Override
	public NumAdults fromValueToDomain(Long value) {
		return new NUM_ADULTS(value);
	}

}
