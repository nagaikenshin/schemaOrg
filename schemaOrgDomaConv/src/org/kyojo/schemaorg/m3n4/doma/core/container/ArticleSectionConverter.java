package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.ARTICLE_SECTION;
import org.kyojo.schemaorg.m3n4.core.Container.ArticleSection;

@ExternalDomain
public class ArticleSectionConverter implements DomainConverter<ArticleSection, String> {

	@Override
	public String fromDomainToValue(ArticleSection domain) {
		return domain.getNativeValue();
	}

	@Override
	public ArticleSection fromValueToDomain(String value) {
		return new ARTICLE_SECTION(value);
	}

}
