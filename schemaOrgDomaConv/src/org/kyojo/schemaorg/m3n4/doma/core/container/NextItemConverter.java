package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.NEXT_ITEM;
import org.kyojo.schemaorg.m3n4.core.Container.NextItem;

@ExternalDomain
public class NextItemConverter implements DomainConverter<NextItem, String> {

	@Override
	public String fromDomainToValue(NextItem domain) {
		return domain.getNativeValue();
	}

	@Override
	public NextItem fromValueToDomain(String value) {
		return new NEXT_ITEM(value);
	}

}
