package org.kyojo.schemaorg.m3n4.doma.healthLifesci.medicalSpecialty;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.medicalSpecialty.UROLOGIC;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalSpecialty.Urologic;

@ExternalDomain
public class UrologicConverter implements DomainConverter<Urologic, String> {

	@Override
	public String fromDomainToValue(Urologic domain) {
		return domain.getNativeValue();
	}

	@Override
	public Urologic fromValueToDomain(String value) {
		return new UROLOGIC(value);
	}

}
