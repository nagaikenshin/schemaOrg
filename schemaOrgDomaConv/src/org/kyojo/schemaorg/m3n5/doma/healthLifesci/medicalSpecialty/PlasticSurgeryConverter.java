package org.kyojo.schemaorg.m3n5.doma.healthLifesci.medicalSpecialty;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.medicalSpecialty.PLASTIC_SURGERY;
import org.kyojo.schemaorg.m3n5.healthLifesci.MedicalSpecialty.PlasticSurgery;

@ExternalDomain
public class PlasticSurgeryConverter implements DomainConverter<PlasticSurgery, String> {

	@Override
	public String fromDomainToValue(PlasticSurgery domain) {
		return domain.getNativeValue();
	}

	@Override
	public PlasticSurgery fromValueToDomain(String value) {
		return new PLASTIC_SURGERY(value);
	}

}