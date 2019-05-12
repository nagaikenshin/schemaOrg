package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.PREVIOUS_ITEM;
import org.kyojo.schemaorg.m3n5.core.Container.PreviousItem;

@ExternalDomain
public class PreviousItemConverter implements DomainConverter<PreviousItem, String> {

	@Override
	public String fromDomainToValue(PreviousItem domain) {
		return domain.getNativeValue();
	}

	@Override
	public PreviousItem fromValueToDomain(String value) {
		return new PREVIOUS_ITEM(value);
	}

}