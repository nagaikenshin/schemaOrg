package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.TYPE_OF_GOOD;
import org.kyojo.schemaOrg.m3n3.core.Container.TypeOfGood;

@ExternalDomain
public class TypeOfGoodConverter implements DomainConverter<TypeOfGood, String> {

	@Override
	public String fromDomainToValue(TypeOfGood domain) {
		return domain.getNativeValue();
	}

	@Override
	public TypeOfGood fromValueToDomain(String value) {
		return new TYPE_OF_GOOD(value);
	}

}
