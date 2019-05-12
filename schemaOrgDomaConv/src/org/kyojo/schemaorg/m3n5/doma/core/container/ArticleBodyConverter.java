package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.ARTICLE_BODY;
import org.kyojo.schemaorg.m3n5.core.Container.ArticleBody;

@ExternalDomain
public class ArticleBodyConverter implements DomainConverter<ArticleBody, String> {

	@Override
	public String fromDomainToValue(ArticleBody domain) {
		return domain.getNativeValue();
	}

	@Override
	public ArticleBody fromValueToDomain(String value) {
		return new ARTICLE_BODY(value);
	}

}
