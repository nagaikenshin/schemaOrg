package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.INTERACTING_DRUG;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.InteractingDrug;

@ExternalDomain
public class InteractingDrugConverter implements DomainConverter<InteractingDrug, String> {

	@Override
	public String fromDomainToValue(InteractingDrug domain) {
		return domain.getNativeValue();
	}

	@Override
	public InteractingDrug fromValueToDomain(String value) {
		return new INTERACTING_DRUG(value);
	}

}
