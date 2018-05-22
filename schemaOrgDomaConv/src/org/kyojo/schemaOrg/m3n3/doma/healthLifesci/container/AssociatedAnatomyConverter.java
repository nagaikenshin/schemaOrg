package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.ASSOCIATED_ANATOMY;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.AssociatedAnatomy;

@ExternalDomain
public class AssociatedAnatomyConverter implements DomainConverter<AssociatedAnatomy, String> {

	@Override
	public String fromDomainToValue(AssociatedAnatomy domain) {
		return domain.getNativeValue();
	}

	@Override
	public AssociatedAnatomy fromValueToDomain(String value) {
		return new ASSOCIATED_ANATOMY(value);
	}

}
