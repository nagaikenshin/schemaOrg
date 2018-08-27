package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.MOTEL;
import org.kyojo.schemaorg.m3n4.core.Clazz.Motel;

@ExternalDomain
public class MotelConverter implements DomainConverter<Motel, String> {

	@Override
	public String fromDomainToValue(Motel domain) {
		return domain.getNativeValue();
	}

	@Override
	public Motel fromValueToDomain(String value) {
		return new MOTEL(value);
	}

}
