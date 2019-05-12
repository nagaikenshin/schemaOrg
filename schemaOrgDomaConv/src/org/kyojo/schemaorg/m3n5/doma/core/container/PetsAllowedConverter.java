package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.PETS_ALLOWED;
import org.kyojo.schemaorg.m3n5.core.Container.PetsAllowed;

@ExternalDomain
public class PetsAllowedConverter implements DomainConverter<PetsAllowed, String> {

	@Override
	public String fromDomainToValue(PetsAllowed domain) {
		return domain.getNativeValue();
	}

	@Override
	public PetsAllowed fromValueToDomain(String value) {
		return new PETS_ALLOWED(value);
	}

}
