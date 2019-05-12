package org.kyojo.schemaorg.m3n5.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.INCLUDES_ATTRACTION;
import org.kyojo.schemaorg.m3n5.pending.Container.IncludesAttraction;

@ExternalDomain
public class IncludesAttractionConverter implements DomainConverter<IncludesAttraction, String> {

	@Override
	public String fromDomainToValue(IncludesAttraction domain) {
		return domain.getNativeValue();
	}

	@Override
	public IncludesAttraction fromValueToDomain(String value) {
		return new INCLUDES_ATTRACTION(value);
	}

}
