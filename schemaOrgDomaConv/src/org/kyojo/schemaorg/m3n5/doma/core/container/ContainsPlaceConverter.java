package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.CONTAINS_PLACE;
import org.kyojo.schemaorg.m3n5.core.Container.ContainsPlace;

@ExternalDomain
public class ContainsPlaceConverter implements DomainConverter<ContainsPlace, String> {

	@Override
	public String fromDomainToValue(ContainsPlace domain) {
		return domain.getNativeValue();
	}

	@Override
	public ContainsPlace fromValueToDomain(String value) {
		return new CONTAINS_PLACE(value);
	}

}
