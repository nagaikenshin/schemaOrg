package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.LIST_ITEM;
import org.kyojo.schemaorg.m3n4.core.Clazz.ListItem;

@ExternalDomain
public class ListItemConverter implements DomainConverter<ListItem, String> {

	@Override
	public String fromDomainToValue(ListItem domain) {
		return domain.getNativeValue();
	}

	@Override
	public ListItem fromValueToDomain(String value) {
		return new LIST_ITEM(value);
	}

}
