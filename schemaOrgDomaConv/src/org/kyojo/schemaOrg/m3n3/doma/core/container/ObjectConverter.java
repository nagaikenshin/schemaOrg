package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.OBJECT;
import org.kyojo.schemaOrg.m3n3.core.Container.Object;

@ExternalDomain
public class ObjectConverter implements DomainConverter<Object, String> {

	@Override
	public String fromDomainToValue(Object domain) {
		return domain.getNativeValue();
	}

	@Override
	public Object fromValueToDomain(String value) {
		return new OBJECT(value);
	}

}
