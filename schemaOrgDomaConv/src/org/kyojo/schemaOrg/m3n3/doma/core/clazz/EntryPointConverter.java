package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ENTRY_POINT;
import org.kyojo.schemaOrg.m3n3.core.Clazz.EntryPoint;

@ExternalDomain
public class EntryPointConverter implements DomainConverter<EntryPoint, String> {

	@Override
	public String fromDomainToValue(EntryPoint domain) {
		return domain.getNativeValue();
	}

	@Override
	public EntryPoint fromValueToDomain(String value) {
		return new ENTRY_POINT(value);
	}

}
