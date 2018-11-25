package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.SIMPLE;
import org.kyojo.schemaorg.m3n4.core.Clazz.Simple;

@ExternalDomain
public class SimpleConverter implements DomainConverter<Simple, String> {

	@Override
	public String fromDomainToValue(Simple domain) {
		return domain.getNativeValue();
	}

	@Override
	public Simple fromValueToDomain(String value) {
		return new SIMPLE(value);
	}

}
