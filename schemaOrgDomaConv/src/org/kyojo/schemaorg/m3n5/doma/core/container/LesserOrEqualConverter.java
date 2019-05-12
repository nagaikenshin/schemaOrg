package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.LESSER_OR_EQUAL;
import org.kyojo.schemaorg.m3n5.core.Container.LesserOrEqual;

@ExternalDomain
public class LesserOrEqualConverter implements DomainConverter<LesserOrEqual, String> {

	@Override
	public String fromDomainToValue(LesserOrEqual domain) {
		return domain.getNativeValue();
	}

	@Override
	public LesserOrEqual fromValueToDomain(String value) {
		return new LESSER_OR_EQUAL(value);
	}

}
