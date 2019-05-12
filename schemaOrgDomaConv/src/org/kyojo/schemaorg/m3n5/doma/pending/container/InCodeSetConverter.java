package org.kyojo.schemaorg.m3n5.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.IN_CODE_SET;
import org.kyojo.schemaorg.m3n5.pending.Container.InCodeSet;

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