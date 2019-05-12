package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.MOTORCYCLE_REPAIR;
import org.kyojo.schemaorg.m3n5.core.Clazz.MotorcycleRepair;

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