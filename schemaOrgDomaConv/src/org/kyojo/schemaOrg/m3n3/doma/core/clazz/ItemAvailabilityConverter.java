package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ITEM_AVAILABILITY;
import org.kyojo.schemaOrg.m3n3.core.Clazz.ItemAvailability;

@ExternalDomain
public class ItemAvailabilityConverter implements DomainConverter<ItemAvailability, String> {

	@Override
	public String fromDomainToValue(ItemAvailability domain) {
		return domain.getNativeValue();
	}

	@Override
	public ItemAvailability fromValueToDomain(String value) {
		return new ITEM_AVAILABILITY(value);
	}

}
