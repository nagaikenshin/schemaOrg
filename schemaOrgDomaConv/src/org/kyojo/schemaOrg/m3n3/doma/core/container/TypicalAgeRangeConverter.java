package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.TYPICAL_AGE_RANGE;
import org.kyojo.schemaOrg.m3n3.core.Container.TypicalAgeRange;

@ExternalDomain
public class TypicalAgeRangeConverter implements DomainConverter<TypicalAgeRange, String> {

	@Override
	public String fromDomainToValue(TypicalAgeRange domain) {
		return domain.getNativeValue();
	}

	@Override
	public TypicalAgeRange fromValueToDomain(String value) {
		return new TYPICAL_AGE_RANGE(value);
	}

}
