package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.medicalSpecialty;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.medicalSpecialty.PUBLIC_HEALTH;
import org.kyojo.schemaOrg.m3n3.healthLifesci.MedicalSpecialty.PublicHealth;

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
