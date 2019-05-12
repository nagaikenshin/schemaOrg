package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.MILEAGE_FROM_ODOMETER;
import org.kyojo.schemaorg.m3n5.core.Container.MileageFromOdometer;

@ExternalDomain
public class MileageFromOdometerConverter implements DomainConverter<MileageFromOdometer, String> {

	@Override
	public String fromDomainToValue(MileageFromOdometer domain) {
		return domain.getNativeValue();
	}

	@Override
	public MileageFromOdometer fromValueToDomain(String value) {
		return new MILEAGE_FROM_ODOMETER(value);
	}

}
