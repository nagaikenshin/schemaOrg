package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ARTICLE_SECTION;
import org.kyojo.schemaOrg.m3n3.core.Container.ArticleSection;

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
