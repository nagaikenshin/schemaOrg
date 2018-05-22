package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.NEXT_ITEM;
import org.kyojo.schemaOrg.m3n3.core.Container.NextItem;

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
