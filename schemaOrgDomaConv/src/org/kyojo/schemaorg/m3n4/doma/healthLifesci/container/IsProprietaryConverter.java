package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.IS_PROPRIETARY;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.IsProprietary;

@ExternalDomain
public class IsProprietaryConverter implements DomainConverter<IsProprietary, Boolean> {

	@Override
	public Boolean fromDomainToValue(IsProprietary domain) {
		return domain.getNativeValue();
	}

	@Override
	public IsProprietary fromValueToDomain(Boolean value) {
		return new IS_PROPRIETARY(value);
	}

}
