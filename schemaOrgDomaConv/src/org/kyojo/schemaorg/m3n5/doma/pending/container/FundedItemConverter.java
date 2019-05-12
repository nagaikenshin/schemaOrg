package org.kyojo.schemaorg.m3n5.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.FUNDED_ITEM;
import org.kyojo.schemaorg.m3n5.pending.Container.FundedItem;

@ExternalDomain
public class FundedItemConverter implements DomainConverter<FundedItem, String> {

	@Override
	public String fromDomainToValue(FundedItem domain) {
		return domain.getNativeValue();
	}

	@Override
	public FundedItem fromValueToDomain(String value) {
		return new FUNDED_ITEM(value);
	}

}
