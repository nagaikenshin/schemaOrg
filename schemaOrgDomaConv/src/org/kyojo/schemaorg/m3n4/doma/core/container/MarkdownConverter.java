package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.MARKDOWN;
import org.kyojo.schemaorg.m3n4.core.Container.Markdown;

@ExternalDomain
public class MarkdownConverter implements DomainConverter<Markdown, String> {

	@Override
	public String fromDomainToValue(Markdown domain) {
		return domain.getNativeValue();
	}

	@Override
	public Markdown fromValueToDomain(String value) {
		return new MARKDOWN(value);
	}

}
