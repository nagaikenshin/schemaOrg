package org.kyojo.schemaOrg.m3n3.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.IN_CODE_SET;
import org.kyojo.schemaOrg.m3n3.pending.Container.InCodeSet;

@ExternalDomain
public class InCodeSetConverter implements DomainConverter<InCodeSet, String> {

	@Override
	public String fromDomainToValue(InCodeSet domain) {
		return domain.getNativeValue();
	}

	@Override
	public InCodeSet fromValueToDomain(String value) {
		return new IN_CODE_SET(value);
	}

}
