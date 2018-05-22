package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.medicalSpecialty;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.medicalSpecialty.OCCUPATIONAL_THERAPY;
import org.kyojo.schemaOrg.m3n3.healthLifesci.MedicalSpecialty.OccupationalTherapy;

@ExternalDomain
public class OccupationalTherapyConverter implements DomainConverter<OccupationalTherapy, String> {

	@Override
	public String fromDomainToValue(OccupationalTherapy domain) {
		return domain.getNativeValue();
	}

	@Override
	public OccupationalTherapy fromValueToDomain(String value) {
		return new OCCUPATIONAL_THERAPY(value);
	}

}
