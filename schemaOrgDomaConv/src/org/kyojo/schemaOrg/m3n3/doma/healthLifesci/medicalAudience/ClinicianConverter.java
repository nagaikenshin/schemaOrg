package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.medicalAudience;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.medicalAudience.CLINICIAN;
import org.kyojo.schemaOrg.m3n3.healthLifesci.MedicalAudience.Clinician;

@ExternalDomain
public class ClinicianConverter implements DomainConverter<Clinician, String> {

	@Override
	public String fromDomainToValue(Clinician domain) {
		return domain.getNativeValue();
	}

	@Override
	public Clinician fromValueToDomain(String value) {
		return new CLINICIAN(value);
	}

}
