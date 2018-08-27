package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.POSSIBLE_TREATMENT;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.PossibleTreatment;

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
