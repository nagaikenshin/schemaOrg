package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.BIRTH_PLACE;
import org.kyojo.schemaOrg.m3n3.core.Container.BirthPlace;

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
