package org.kyojo.schemaorg.m3n5.doma.meta.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.meta.impl.CLASS;
import org.kyojo.schemaorg.m3n5.meta.Clazz.Class;

@ExternalDomain
public class ClassConverter implements DomainConverter<Class, String> {

	@Override
	public String fromDomainToValue(Class domain) {
		return domain.getNativeValue();
	}

	@Override
	public Class fromValueToDomain(String value) {
		return new CLASS(value);
	}

}
