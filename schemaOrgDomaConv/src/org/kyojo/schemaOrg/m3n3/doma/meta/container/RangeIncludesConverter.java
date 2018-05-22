package org.kyojo.schemaOrg.m3n3.doma.meta.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.meta.impl.RANGE_INCLUDES;
import org.kyojo.schemaOrg.m3n3.meta.Container.RangeIncludes;

@ExternalDomain
public class RangeIncludesConverter implements DomainConverter<RangeIncludes, String> {

	@Override
	public String fromDomainToValue(RangeIncludes domain) {
		return domain.getNativeValue();
	}

	@Override
	public RangeIncludes fromValueToDomain(String value) {
		return new RANGE_INCLUDES(value);
	}

}
