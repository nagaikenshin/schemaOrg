package org.kyojo.schemaorg.m3n4.doma.healthLifesci.medicalSpecialty;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.medicalSpecialty.PATHOLOGY;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalSpecialty.Pathology;

@ExternalDomain
public class PathologyConverter implements DomainConverter<Pathology, String> {

	@Override
	public String fromDomainToValue(Pathology domain) {
		return domain.getNativeValue();
	}

	@Override
	public Pathology fromValueToDomain(String value) {
		return new PATHOLOGY(value);
	}

}
