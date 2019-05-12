package org.kyojo.schemaorg.m3n5.doma.healthLifesci.medicalSpecialty;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.medicalSpecialty.TOXICOLOGIC;
import org.kyojo.schemaorg.m3n5.healthLifesci.MedicalSpecialty.Toxicologic;

@ExternalDomain
public class ToxicologicConverter implements DomainConverter<Toxicologic, String> {

	@Override
	public String fromDomainToValue(Toxicologic domain) {
		return domain.getNativeValue();
	}

	@Override
	public Toxicologic fromValueToDomain(String value) {
		return new TOXICOLOGIC(value);
	}

}
