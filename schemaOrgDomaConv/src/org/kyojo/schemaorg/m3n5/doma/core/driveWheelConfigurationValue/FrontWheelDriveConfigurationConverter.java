package org.kyojo.schemaorg.m3n5.doma.core.driveWheelConfigurationValue;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.driveWheelConfigurationValue.FRONT_WHEEL_DRIVE_CONFIGURATION;
import org.kyojo.schemaorg.m3n5.core.DriveWheelConfigurationValue.FrontWheelDriveConfiguration;

@ExternalDomain
public class FrontWheelDriveConfigurationConverter implements DomainConverter<FrontWheelDriveConfiguration, String> {

	@Override
	public String fromDomainToValue(FrontWheelDriveConfiguration domain) {
		return domain.getNativeValue();
	}

	@Override
	public FrontWheelDriveConfiguration fromValueToDomain(String value) {
		return new FRONT_WHEEL_DRIVE_CONFIGURATION(value);
	}

}
