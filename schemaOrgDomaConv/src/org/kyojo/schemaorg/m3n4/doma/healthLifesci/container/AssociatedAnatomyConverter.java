package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.ASSOCIATED_ANATOMY;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.AssociatedAnatomy;

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
