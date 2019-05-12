package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.MUSEUM;
import org.kyojo.schemaorg.m3n5.core.Clazz.Museum;

@ExternalDomain
public class MuseumConverter implements DomainConverter<Museum, String> {

	@Override
	public String fromDomainToValue(Museum domain) {
		return domain.getNativeValue();
	}

	@Override
	public Museum fromValueToDomain(String value) {
		return new MUSEUM(value);
	}

}
