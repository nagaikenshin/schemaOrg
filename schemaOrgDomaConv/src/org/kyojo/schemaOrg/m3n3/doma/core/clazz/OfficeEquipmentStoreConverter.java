package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.OFFICE_EQUIPMENT_STORE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.OfficeEquipmentStore;

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
