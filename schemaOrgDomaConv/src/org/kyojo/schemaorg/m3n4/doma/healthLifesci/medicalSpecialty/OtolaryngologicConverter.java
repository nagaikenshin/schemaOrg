package org.kyojo.schemaorg.m3n4.doma.healthLifesci.medicalSpecialty;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.medicalSpecialty.OTOLARYNGOLOGIC;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalSpecialty.Otolaryngologic;

@ExternalDomain
public class OtolaryngologicConverter implements DomainConverter<Otolaryngologic, String> {

	@Override
	public String fromDomainToValue(Otolaryngologic domain) {
		return domain.getNativeValue();
	}

	@Override
	public Otolaryngologic fromValueToDomain(String value) {
		return new OTOLARYNGOLOGIC(value);
	}

}