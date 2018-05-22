package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.LESSER_OR_EQUAL;
import org.kyojo.schemaOrg.m3n3.core.Container.LesserOrEqual;

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
