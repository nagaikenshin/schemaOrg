package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.medicalSpecialty;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.medicalSpecialty.RHEUMATOLOGIC;
import org.kyojo.schemaOrg.m3n3.healthLifesci.MedicalSpecialty.Rheumatologic;

@ExternalDomain
public class RheumatologicConverter implements DomainConverter<Rheumatologic, String> {

	@Override
	public String fromDomainToValue(Rheumatologic domain) {
		return domain.getNativeValue();
	}

	@Override
	public Rheumatologic fromValueToDomain(String value) {
		return new RHEUMATOLOGIC(value);
	}

}
