package org.kyojo.schemaorg.m3n4.doma.healthLifesci.medicalSpecialty;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.medicalSpecialty.NEUROLOGIC;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalSpecialty.Neurologic;

@ExternalDomain
public class NeurologicConverter implements DomainConverter<Neurologic, String> {

	@Override
	public String fromDomainToValue(Neurologic domain) {
		return domain.getNativeValue();
	}

	@Override
	public Neurologic fromValueToDomain(String value) {
		return new NEUROLOGIC(value);
	}

}
