package org.kyojo.schemaorg.m3n5.doma.core.driveWheelConfigurationValue;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.driveWheelConfigurationValue.FOUR_WHEEL_DRIVE_CONFIGURATION;
import org.kyojo.schemaorg.m3n5.core.DriveWheelConfigurationValue.FourWheelDriveConfiguration;

@ExternalDomain
public class FourWheelDriveConfigurationConverter implements DomainConverter<FourWheelDriveConfiguration, String> {

	@Override
	public String fromDomainToValue(FourWheelDriveConfiguration domain) {
		return domain.getNativeValue();
	}

	@Override
	public FourWheelDriveConfiguration fromValueToDomain(String value) {
		return new FOUR_WHEEL_DRIVE_CONFIGURATION(value);
	}

}
