package org.kyojo.schemaorg.m3n4.doma.core.container;

import java.sql.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.VEHICLE_MODEL_DATE;
import org.kyojo.schemaorg.m3n4.core.Container.VehicleModelDate;

@ExternalDomain
public class VehicleModelDateConverter implements DomainConverter<VehicleModelDate, Date> {

	@Override
	public Date fromDomainToValue(VehicleModelDate domain) {
		if(domain != null && domain.getDateList() != null && domain.getDateList().size() > 0) {
			return Date.valueOf(domain.getDateList().get(0).getDate());
		} else {
			return null;
		}
	}

	@Override
	public VehicleModelDate fromValueToDomain(Date value) {
		return new VEHICLE_MODEL_DATE(value);
	}

}
