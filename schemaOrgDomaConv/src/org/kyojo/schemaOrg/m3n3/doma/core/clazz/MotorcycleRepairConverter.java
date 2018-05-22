package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.MOTORCYCLE_REPAIR;
import org.kyojo.schemaOrg.m3n3.core.Clazz.MotorcycleRepair;

@ExternalDomain
public class MotorcycleRepairConverter implements DomainConverter<MotorcycleRepair, String> {

	@Override
	public String fromDomainToValue(MotorcycleRepair domain) {
		return domain.getNativeValue();
	}

	@Override
	public MotorcycleRepair fromValueToDomain(String value) {
		return new MOTORCYCLE_REPAIR(value);
	}

}
