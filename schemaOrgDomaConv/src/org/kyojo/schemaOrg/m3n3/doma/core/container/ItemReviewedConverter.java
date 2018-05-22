package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ITEM_REVIEWED;
import org.kyojo.schemaOrg.m3n3.core.Container.ItemReviewed;

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
