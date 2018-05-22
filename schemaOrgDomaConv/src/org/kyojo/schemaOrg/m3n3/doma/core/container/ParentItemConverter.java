package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PARENT_ITEM;
import org.kyojo.schemaOrg.m3n3.core.Container.ParentItem;

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
