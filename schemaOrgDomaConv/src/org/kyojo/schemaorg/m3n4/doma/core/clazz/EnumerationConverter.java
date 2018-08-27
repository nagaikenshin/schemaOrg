package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.ENUMERATION;
import org.kyojo.schemaorg.m3n4.core.Clazz.Enumeration;

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
