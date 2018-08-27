package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.BIRTH_PLACE;
import org.kyojo.schemaorg.m3n4.core.Container.BirthPlace;

@ExternalDomain
public class BirthPlaceConverter implements DomainConverter<BirthPlace, String> {

	@Override
	public String fromDomainToValue(BirthPlace domain) {
		return domain.getNativeValue();
	}

	@Override
	public BirthPlace fromValueToDomain(String value) {
		return new BIRTH_PLACE(value);
	}

}
