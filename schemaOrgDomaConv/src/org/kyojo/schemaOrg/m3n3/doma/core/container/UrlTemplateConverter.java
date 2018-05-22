package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.URL_TEMPLATE;
import org.kyojo.schemaOrg.m3n3.core.Container.UrlTemplate;

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
