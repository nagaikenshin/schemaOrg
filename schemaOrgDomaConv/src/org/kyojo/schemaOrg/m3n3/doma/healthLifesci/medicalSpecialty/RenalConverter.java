package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.medicalSpecialty;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.medicalSpecialty.RENAL;
import org.kyojo.schemaOrg.m3n3.healthLifesci.MedicalSpecialty.Renal;

@ExternalDomain
public class RenalConverter implements DomainConverter<Renal, String> {

	@Override
	public String fromDomainToValue(Renal domain) {
		return domain.getNativeValue();
	}

	@Override
	public Renal fromValueToDomain(String value) {
		return new RENAL(value);
	}

}
