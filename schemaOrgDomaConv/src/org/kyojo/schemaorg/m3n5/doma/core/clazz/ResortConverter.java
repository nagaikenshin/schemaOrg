package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.RESORT;
import org.kyojo.schemaorg.m3n5.core.Clazz.Resort;

@ExternalDomain
public class ResortConverter implements DomainConverter<Resort, String> {

	@Override
	public String fromDomainToValue(Resort domain) {
		return domain.getNativeValue();
	}

	@Override
	public Resort fromValueToDomain(String value) {
		return new RESORT(value);
	}

}
