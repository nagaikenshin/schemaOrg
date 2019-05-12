package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.ENTRY_POINT;
import org.kyojo.schemaorg.m3n5.core.Clazz.EntryPoint;

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
