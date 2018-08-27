package org.kyojo.schemaorg.m3n4.doma.core.driveWheelConfigurationValue;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.driveWheelConfigurationValue.ALL_WHEEL_DRIVE_CONFIGURATION;
import org.kyojo.schemaorg.m3n4.core.DriveWheelConfigurationValue.AllWheelDriveConfiguration;

@ExternalDomain
public class AllWheelDriveConfigurationConverter implements DomainConverter<AllWheelDriveConfiguration, String> {

	@Override
	public String fromDomainToValue(AllWheelDriveConfiguration domain) {
		return domain.getNativeValue();
	}

	@Override
	public AllWheelDriveConfiguration fromValueToDomain(String value) {
		return new ALL_WHEEL_DRIVE_CONFIGURATION(value);
	}

}
