package org.kyojo.schemaorg.m3n5.doma.healthLifesci.medicalSpecialty;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.medicalSpecialty.LABORATORY_SCIENCE;
import org.kyojo.schemaorg.m3n5.healthLifesci.MedicalSpecialty.LaboratoryScience;

@ExternalDomain
public class LaboratoryScienceConverter implements DomainConverter<LaboratoryScience, String> {

	@Override
	public String fromDomainToValue(LaboratoryScience domain) {
		return domain.getNativeValue();
	}

	@Override
	public LaboratoryScience fromValueToDomain(String value) {
		return new LABORATORY_SCIENCE(value);
	}

}
