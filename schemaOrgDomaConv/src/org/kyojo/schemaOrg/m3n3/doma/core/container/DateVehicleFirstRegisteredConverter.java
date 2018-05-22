package org.kyojo.schemaOrg.m3n3.doma.core.container;

import java.sql.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.DATE_VEHICLE_FIRST_REGISTERED;
import org.kyojo.schemaOrg.m3n3.core.Container.DateVehicleFirstRegistered;

@ExternalDomain
public class DateVehicleFirstRegisteredConverter implements DomainConverter<DateVehicleFirstRegistered, Date> {

	@Override
	public Date fromDomainToValue(DateVehicleFirstRegistered domain) {
		if(domain != null && domain.getDateList() != null && domain.getDateList().size() > 0) {
			return Date.valueOf(domain.getDateList().get(0).getDate());
		} else {
			return null;
		}
	}

	@Override
	public DateVehicleFirstRegistered fromValueToDomain(Date value) {
		return new DATE_VEHICLE_FIRST_REGISTERED(value);
	}

}
