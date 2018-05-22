package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.DRIVE_WHEEL_CONFIGURATION_VALUE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.DriveWheelConfigurationValue;

@ExternalDomain
public class DriveWheelConfigurationValueConverter implements DomainConverter<DriveWheelConfigurationValue, String> {

	@Override
	public String fromDomainToValue(DriveWheelConfigurationValue domain) {
		return domain.getNativeValue();
	}

	@Override
	public DriveWheelConfigurationValue fromValueToDomain(String value) {
		return new DRIVE_WHEEL_CONFIGURATION_VALUE(value);
	}

}
