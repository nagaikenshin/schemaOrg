package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.FAQ_PAGE;
import org.kyojo.schemaorg.m3n5.core.Clazz.FAQPage;

@ExternalDomain
public class FAQPageConverter implements DomainConverter<FAQPage, String> {

	@Override
	public String fromDomainToValue(FAQPage domain) {
		return domain.getNativeValue();
	}

	@Override
	public FAQPage fromValueToDomain(String value) {
		return new FAQ_PAGE(value);
	}

}
