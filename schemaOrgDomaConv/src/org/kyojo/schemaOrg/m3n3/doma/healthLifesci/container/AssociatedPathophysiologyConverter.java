package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.ASSOCIATED_PATHOPHYSIOLOGY;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.AssociatedPathophysiology;

@ExternalDomain
public class AssociatedPathophysiologyConverter implements DomainConverter<AssociatedPathophysiology, String> {

	@Override
	public String fromDomainToValue(AssociatedPathophysiology domain) {
		return domain.getNativeValue();
	}

	@Override
	public AssociatedPathophysiology fromValueToDomain(String value) {
		return new ASSOCIATED_PATHOPHYSIOLOGY(value);
	}

}
