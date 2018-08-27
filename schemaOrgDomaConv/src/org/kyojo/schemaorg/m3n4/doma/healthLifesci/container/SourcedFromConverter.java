package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.SOURCED_FROM;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.SourcedFrom;

@ExternalDomain
public class SourcedFromConverter implements DomainConverter<SourcedFrom, String> {

	@Override
	public String fromDomainToValue(SourcedFrom domain) {
		return domain.getNativeValue();
	}

	@Override
	public SourcedFrom fromValueToDomain(String value) {
		return new SOURCED_FROM(value);
	}

}
