package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.medicalSpecialty;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.medicalSpecialty.OTOLARYNGOLOGIC;
import org.kyojo.schemaOrg.m3n3.healthLifesci.MedicalSpecialty.Otolaryngologic;

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
