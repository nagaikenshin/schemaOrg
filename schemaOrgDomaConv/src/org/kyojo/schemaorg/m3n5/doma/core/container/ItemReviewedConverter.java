package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.ITEM_REVIEWED;
import org.kyojo.schemaorg.m3n5.core.Container.ItemReviewed;

@ExternalDomain
public class ItemReviewedConverter implements DomainConverter<ItemReviewed, String> {

	@Override
	public String fromDomainToValue(ItemReviewed domain) {
		return domain.getNativeValue();
	}

	@Override
	public ItemReviewed fromValueToDomain(String value) {
		return new ITEM_REVIEWED(value);
	}

}
