package org.kyojo.schemaorg.m3n5.doma.healthLifesci.medicalSpecialty;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.medicalSpecialty.ANESTHESIA;
import org.kyojo.schemaorg.m3n5.healthLifesci.MedicalSpecialty.Anesthesia;

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
