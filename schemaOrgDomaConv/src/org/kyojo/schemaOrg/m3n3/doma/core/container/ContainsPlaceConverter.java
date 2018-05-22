package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.CONTAINS_PLACE;
import org.kyojo.schemaOrg.m3n3.core.Container.ContainsPlace;

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
