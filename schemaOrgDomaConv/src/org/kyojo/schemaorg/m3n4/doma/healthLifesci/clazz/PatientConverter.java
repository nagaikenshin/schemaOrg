package org.kyojo.schemaorg.m3n4.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.PATIENT;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.Patient;

@ExternalDomain
public class PatientConverter implements DomainConverter<Patient, String> {

	@Override
	public String fromDomainToValue(Patient domain) {
		return domain.getNativeValue();
	}

	@Override
	public Patient fromValueToDomain(String value) {
		return new PATIENT(value);
	}

}
