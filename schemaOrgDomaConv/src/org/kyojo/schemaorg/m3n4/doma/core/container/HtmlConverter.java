package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.HTML;
import org.kyojo.schemaorg.m3n4.core.Container.Html;

@ExternalDomain
public class HtmlConverter implements DomainConverter<Html, String> {

	@Override
	public String fromDomainToValue(Html domain) {
		return domain.getNativeValue();
	}

	@Override
	public Html fromValueToDomain(String value) {
		return new HTML(value);
	}

}
