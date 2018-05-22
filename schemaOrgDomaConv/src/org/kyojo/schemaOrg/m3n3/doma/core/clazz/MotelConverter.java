package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.MOTEL;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Motel;

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
