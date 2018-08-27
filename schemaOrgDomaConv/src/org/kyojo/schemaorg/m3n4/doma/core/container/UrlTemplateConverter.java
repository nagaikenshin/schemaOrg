package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.URL_TEMPLATE;
import org.kyojo.schemaorg.m3n4.core.Container.UrlTemplate;

@ExternalDomain
public class UrlTemplateConverter implements DomainConverter<UrlTemplate, String> {

	@Override
	public String fromDomainToValue(UrlTemplate domain) {
		return domain.getNativeValue();
	}

	@Override
	public UrlTemplate fromValueToDomain(String value) {
		return new URL_TEMPLATE(value);
	}

}
