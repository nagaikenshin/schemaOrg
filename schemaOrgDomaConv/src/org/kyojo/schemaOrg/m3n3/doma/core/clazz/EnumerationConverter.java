package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ENUMERATION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Enumeration;

@ExternalDomain
public class EnumerationConverter implements DomainConverter<Enumeration, String> {

	@Override
	public String fromDomainToValue(Enumeration domain) {
		return domain.getNativeValue();
	}

	@Override
	public Enumeration fromValueToDomain(String value) {
		return new ENUMERATION(value);
	}

}
