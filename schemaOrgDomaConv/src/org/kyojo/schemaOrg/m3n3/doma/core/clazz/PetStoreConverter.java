package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PET_STORE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.PetStore;

@ExternalDomain
public class PetStoreConverter implements DomainConverter<PetStore, String> {

	@Override
	public String fromDomainToValue(PetStore domain) {
		return domain.getNativeValue();
	}

	@Override
	public PetStore fromValueToDomain(String value) {
		return new PET_STORE(value);
	}

}
