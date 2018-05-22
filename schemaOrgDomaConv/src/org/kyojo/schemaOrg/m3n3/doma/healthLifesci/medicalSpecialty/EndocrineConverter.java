package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.medicalSpecialty;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.medicalSpecialty.ENDOCRINE;
import org.kyojo.schemaOrg.m3n3.healthLifesci.MedicalSpecialty.Endocrine;

@ExternalDomain
public class EndocrineConverter implements DomainConverter<Endocrine, String> {

	@Override
	public String fromDomainToValue(Endocrine domain) {
		return domain.getNativeValue();
	}

	@Override
	public Endocrine fromValueToDomain(String value) {
		return new ENDOCRINE(value);
	}

}
