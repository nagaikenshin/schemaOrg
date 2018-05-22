package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ANIMAL_SHELTER;
import org.kyojo.schemaOrg.m3n3.core.Clazz.AnimalShelter;

@ExternalDomain
public class AnimalShelterConverter implements DomainConverter<AnimalShelter, String> {

	@Override
	public String fromDomainToValue(AnimalShelter domain) {
		return domain.getNativeValue();
	}

	@Override
	public AnimalShelter fromValueToDomain(String value) {
		return new ANIMAL_SHELTER(value);
	}

}
