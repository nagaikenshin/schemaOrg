package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.OFFICE_EQUIPMENT_STORE;
import org.kyojo.schemaorg.m3n5.core.Clazz.OfficeEquipmentStore;

@ExternalDomain
public class OfficeEquipmentStoreConverter implements DomainConverter<OfficeEquipmentStore, String> {

	@Override
	public String fromDomainToValue(OfficeEquipmentStore domain) {
		return domain.getNativeValue();
	}

	@Override
	public OfficeEquipmentStore fromValueToDomain(String value) {
		return new OFFICE_EQUIPMENT_STORE(value);
	}

}
