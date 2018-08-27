package org.kyojo.schemaorg.m3n4.doma.healthLifesci.medicalSpecialty;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.medicalSpecialty.PSYCHIATRIC;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalSpecialty.Psychiatric;

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
