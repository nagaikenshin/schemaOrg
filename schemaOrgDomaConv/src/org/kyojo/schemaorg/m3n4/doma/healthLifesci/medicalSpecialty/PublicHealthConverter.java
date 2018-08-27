package org.kyojo.schemaorg.m3n4.doma.healthLifesci.medicalSpecialty;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.medicalSpecialty.PUBLIC_HEALTH;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalSpecialty.PublicHealth;

@ExternalDomain
public class PublicHealthConverter implements DomainConverter<PublicHealth, String> {

	@Override
	public String fromDomainToValue(PublicHealth domain) {
		return domain.getNativeValue();
	}

	@Override
	public PublicHealth fromValueToDomain(String value) {
		return new PUBLIC_HEALTH(value);
	}

}