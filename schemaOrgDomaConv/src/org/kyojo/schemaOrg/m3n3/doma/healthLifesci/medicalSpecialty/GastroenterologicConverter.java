package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.medicalSpecialty;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.medicalSpecialty.GASTROENTEROLOGIC;
import org.kyojo.schemaOrg.m3n3.healthLifesci.MedicalSpecialty.Gastroenterologic;

@ExternalDomain
public class GastroenterologicConverter implements DomainConverter<Gastroenterologic, String> {

	@Override
	public String fromDomainToValue(Gastroenterologic domain) {
		return domain.getNativeValue();
	}

	@Override
	public Gastroenterologic fromValueToDomain(String value) {
		return new GASTROENTEROLOGIC(value);
	}

}
