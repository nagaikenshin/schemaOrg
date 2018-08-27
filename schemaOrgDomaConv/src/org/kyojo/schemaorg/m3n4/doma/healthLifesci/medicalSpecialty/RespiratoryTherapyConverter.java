package org.kyojo.schemaorg.m3n4.doma.healthLifesci.medicalSpecialty;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.medicalSpecialty.RESPIRATORY_THERAPY;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalSpecialty.RespiratoryTherapy;

@ExternalDomain
public class RespiratoryTherapyConverter implements DomainConverter<RespiratoryTherapy, String> {

	@Override
	public String fromDomainToValue(RespiratoryTherapy domain) {
		return domain.getNativeValue();
	}

	@Override
	public RespiratoryTherapy fromValueToDomain(String value) {
		return new RESPIRATORY_THERAPY(value);
	}

}
