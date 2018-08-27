package org.kyojo.schemaorg.m3n4.doma.healthLifesci.medicalSpecialty;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.medicalSpecialty.OBSTETRIC;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalSpecialty.Obstetric;

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
