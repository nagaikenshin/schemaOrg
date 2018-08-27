package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.ITEM_AVAILABILITY;
import org.kyojo.schemaorg.m3n4.core.Clazz.ItemAvailability;

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
