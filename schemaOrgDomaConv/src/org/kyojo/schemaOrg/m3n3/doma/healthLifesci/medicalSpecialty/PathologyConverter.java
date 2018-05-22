package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.medicalSpecialty;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.medicalSpecialty.PATHOLOGY;
import org.kyojo.schemaOrg.m3n3.healthLifesci.MedicalSpecialty.Pathology;

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
