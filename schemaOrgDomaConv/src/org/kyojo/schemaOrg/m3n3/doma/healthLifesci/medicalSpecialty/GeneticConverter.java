package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.medicalSpecialty;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.medicalSpecialty.GENETIC;
import org.kyojo.schemaOrg.m3n3.healthLifesci.MedicalSpecialty.Genetic;

@ExternalDomain
public class GeneticConverter implements DomainConverter<Genetic, String> {

	@Override
	public String fromDomainToValue(Genetic domain) {
		return domain.getNativeValue();
	}

	@Override
	public Genetic fromValueToDomain(String value) {
		return new GENETIC(value);
	}

}
