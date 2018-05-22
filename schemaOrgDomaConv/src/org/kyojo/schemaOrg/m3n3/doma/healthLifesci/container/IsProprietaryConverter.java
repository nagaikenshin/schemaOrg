package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.IS_PROPRIETARY;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.IsProprietary;

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
