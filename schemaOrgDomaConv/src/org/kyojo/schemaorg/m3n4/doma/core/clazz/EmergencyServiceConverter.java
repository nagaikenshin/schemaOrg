package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.EMERGENCY_SERVICE;
import org.kyojo.schemaorg.m3n4.core.Clazz.EmergencyService;

@ExternalDomain
public class EmergencyServiceConverter implements DomainConverter<EmergencyService, String> {

	@Override
	public String fromDomainToValue(EmergencyService domain) {
		return domain.getNativeValue();
	}

	@Override
	public EmergencyService fromValueToDomain(String value) {
		return new EMERGENCY_SERVICE(value);
	}

}
