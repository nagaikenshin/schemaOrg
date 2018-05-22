package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.medicalSpecialty;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.medicalSpecialty.OBSTETRIC;
import org.kyojo.schemaOrg.m3n3.healthLifesci.MedicalSpecialty.Obstetric;

@ExternalDomain
public class ObstetricConverter implements DomainConverter<Obstetric, String> {

	@Override
	public String fromDomainToValue(Obstetric domain) {
		return domain.getNativeValue();
	}

	@Override
	public Obstetric fromValueToDomain(String value) {
		return new OBSTETRIC(value);
	}

}
