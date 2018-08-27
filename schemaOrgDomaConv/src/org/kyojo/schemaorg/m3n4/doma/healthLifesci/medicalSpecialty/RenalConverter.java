package org.kyojo.schemaorg.m3n4.doma.healthLifesci.medicalSpecialty;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.medicalSpecialty.RENAL;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalSpecialty.Renal;

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
