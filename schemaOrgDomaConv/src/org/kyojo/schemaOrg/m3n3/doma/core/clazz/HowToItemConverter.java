package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.HOW_TO_ITEM;
import org.kyojo.schemaOrg.m3n3.core.Clazz.HowToItem;

@ExternalDomain
public class HowToItemConverter implements DomainConverter<HowToItem, String> {

	@Override
	public String fromDomainToValue(HowToItem domain) {
		return domain.getNativeValue();
	}

	@Override
	public HowToItem fromValueToDomain(String value) {
		return new HOW_TO_ITEM(value);
	}

}
