package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.IS_AVAILABLE_GENERICALLY;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.IsAvailableGenerically;

@ExternalDomain
public class IsAvailableGenericallyConverter implements DomainConverter<IsAvailableGenerically, Boolean> {

	@Override
	public Boolean fromDomainToValue(IsAvailableGenerically domain) {
		return domain.getNativeValue();
	}

	@Override
	public IsAvailableGenerically fromValueToDomain(Boolean value) {
		return new IS_AVAILABLE_GENERICALLY(value);
	}

}
