package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.medicalSpecialty;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.medicalSpecialty.PSYCHIATRIC;
import org.kyojo.schemaOrg.m3n3.healthLifesci.MedicalSpecialty.Psychiatric;

@ExternalDomain
public class PsychiatricConverter implements DomainConverter<Psychiatric, String> {

	@Override
	public String fromDomainToValue(Psychiatric domain) {
		return domain.getNativeValue();
	}

	@Override
	public Psychiatric fromValueToDomain(String value) {
		return new PSYCHIATRIC(value);
	}

}
