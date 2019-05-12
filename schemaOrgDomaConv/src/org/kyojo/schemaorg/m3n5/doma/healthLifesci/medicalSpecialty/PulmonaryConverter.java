package org.kyojo.schemaorg.m3n5.doma.healthLifesci.medicalSpecialty;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.medicalSpecialty.PULMONARY;
import org.kyojo.schemaorg.m3n5.healthLifesci.MedicalSpecialty.Pulmonary;

@ExternalDomain
public class PulmonaryConverter implements DomainConverter<Pulmonary, String> {

	@Override
	public String fromDomainToValue(Pulmonary domain) {
		return domain.getNativeValue();
	}

	@Override
	public Pulmonary fromValueToDomain(String value) {
		return new PULMONARY(value);
	}

}
