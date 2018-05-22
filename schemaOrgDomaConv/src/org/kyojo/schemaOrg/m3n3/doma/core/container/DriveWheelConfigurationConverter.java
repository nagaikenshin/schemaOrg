package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.DRIVE_WHEEL_CONFIGURATION;
import org.kyojo.schemaOrg.m3n3.core.Container.DriveWheelConfiguration;

@ExternalDomain
public class DriveWheelConfigurationConverter implements DomainConverter<DriveWheelConfiguration, String> {

	@Override
	public String fromDomainToValue(DriveWheelConfiguration domain) {
		return domain.getNativeValue();
	}

	@Override
	public DriveWheelConfiguration fromValueToDomain(String value) {
		return new DRIVE_WHEEL_CONFIGURATION(value);
	}

}
