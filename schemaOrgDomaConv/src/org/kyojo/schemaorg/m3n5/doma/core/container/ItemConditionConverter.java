package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.ITEM_CONDITION;
import org.kyojo.schemaorg.m3n5.core.Container.ItemCondition;

@ExternalDomain
public class ItemConditionConverter implements DomainConverter<ItemCondition, String> {

	@Override
	public String fromDomainToValue(ItemCondition domain) {
		return domain.getNativeValue();
	}

	@Override
	public ItemCondition fromValueToDomain(String value) {
		return new ITEM_CONDITION(value);
	}

}
