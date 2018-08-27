package org.kyojo.schemaorg.m3n4.doma.healthLifesci.medicalSpecialty;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.medicalSpecialty.ENDOCRINE;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalSpecialty.Endocrine;

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
