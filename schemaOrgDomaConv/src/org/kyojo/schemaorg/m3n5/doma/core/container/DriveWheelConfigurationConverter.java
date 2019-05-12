package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.DRIVE_WHEEL_CONFIGURATION;
import org.kyojo.schemaorg.m3n5.core.Container.DriveWheelConfiguration;

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
