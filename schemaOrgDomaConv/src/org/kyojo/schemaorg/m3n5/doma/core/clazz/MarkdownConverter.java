package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.MARKDOWN;
import org.kyojo.schemaorg.m3n5.core.Clazz.Markdown;

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
