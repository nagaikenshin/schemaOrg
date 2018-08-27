package org.kyojo.schemaorg.m3n4.doma.healthLifesci.medicalSpecialty;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.medicalSpecialty.SURGICAL;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalSpecialty.Surgical;

@ExternalDomain
public class SurgicalConverter implements DomainConverter<Surgical, String> {

	@Override
	public String fromDomainToValue(Surgical domain) {
		return domain.getNativeValue();
	}

	@Override
	public Surgical fromValueToDomain(String value) {
		return new SURGICAL(value);
	}

}
