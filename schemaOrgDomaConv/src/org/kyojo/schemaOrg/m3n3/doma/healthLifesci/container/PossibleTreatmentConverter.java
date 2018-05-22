package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.POSSIBLE_TREATMENT;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.PossibleTreatment;

@ExternalDomain
public class PossibleTreatmentConverter implements DomainConverter<PossibleTreatment, String> {

	@Override
	public String fromDomainToValue(PossibleTreatment domain) {
		return domain.getNativeValue();
	}

	@Override
	public PossibleTreatment fromValueToDomain(String value) {
		return new POSSIBLE_TREATMENT(value);
	}

}
