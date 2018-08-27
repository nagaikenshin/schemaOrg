package org.kyojo.schemaorg.m3n4.doma.core.driveWheelConfigurationValue;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.driveWheelConfigurationValue.REAR_WHEEL_DRIVE_CONFIGURATION;
import org.kyojo.schemaorg.m3n4.core.DriveWheelConfigurationValue.RearWheelDriveConfiguration;

@ExternalDomain
public class RearWheelDriveConfigurationConverter implements DomainConverter<RearWheelDriveConfiguration, String> {

	@Override
	public String fromDomainToValue(RearWheelDriveConfiguration domain) {
		return domain.getNativeValue();
	}

	@Override
	public RearWheelDriveConfiguration fromValueToDomain(String value) {
		return new REAR_WHEEL_DRIVE_CONFIGURATION(value);
	}

}
