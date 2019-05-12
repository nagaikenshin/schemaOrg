package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.PARENT_ITEM;
import org.kyojo.schemaorg.m3n5.core.Container.ParentItem;

@ExternalDomain
public class ParentItemConverter implements DomainConverter<ParentItem, String> {

	@Override
	public String fromDomainToValue(ParentItem domain) {
		return domain.getNativeValue();
	}

	@Override
	public ParentItem fromValueToDomain(String value) {
		return new PARENT_ITEM(value);
	}

}
