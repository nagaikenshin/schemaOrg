package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.OBJECT;
import org.kyojo.schemaorg.m3n4.core.Container.Object;

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
