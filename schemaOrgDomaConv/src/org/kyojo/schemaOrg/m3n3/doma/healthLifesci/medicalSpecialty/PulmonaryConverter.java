package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.medicalSpecialty;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.medicalSpecialty.PULMONARY;
import org.kyojo.schemaOrg.m3n3.healthLifesci.MedicalSpecialty.Pulmonary;

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
