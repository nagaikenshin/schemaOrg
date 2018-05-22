package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.medicalSpecialty;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.medicalSpecialty.ANESTHESIA;
import org.kyojo.schemaOrg.m3n3.healthLifesci.MedicalSpecialty.Anesthesia;

@ExternalDomain
public class AnesthesiaConverter implements DomainConverter<Anesthesia, String> {

	@Override
	public String fromDomainToValue(Anesthesia domain) {
		return domain.getNativeValue();
	}

	@Override
	public Anesthesia fromValueToDomain(String value) {
		return new ANESTHESIA(value);
	}

}
