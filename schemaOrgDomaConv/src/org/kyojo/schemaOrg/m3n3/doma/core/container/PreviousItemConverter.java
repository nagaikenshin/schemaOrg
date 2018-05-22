package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PREVIOUS_ITEM;
import org.kyojo.schemaOrg.m3n3.core.Container.PreviousItem;

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
