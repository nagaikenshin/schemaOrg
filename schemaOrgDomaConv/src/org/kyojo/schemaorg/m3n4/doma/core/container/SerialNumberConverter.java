package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.SERIAL_NUMBER;
import org.kyojo.schemaorg.m3n4.core.Container.SerialNumber;

@ExternalDomain
public class SerialNumberConverter implements DomainConverter<SerialNumber, String> {

	@Override
	public String fromDomainToValue(SerialNumber domain) {
		return domain.getNativeValue();
	}

	@Override
	public SerialNumber fromValueToDomain(String value) {
		return new SERIAL_NUMBER(value);
	}

}
