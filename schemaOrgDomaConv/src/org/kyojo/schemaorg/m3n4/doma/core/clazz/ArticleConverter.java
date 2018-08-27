package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.ARTICLE;
import org.kyojo.schemaorg.m3n4.core.Clazz.Article;

@ExternalDomain
public class ArticleConverter implements DomainConverter<Article, String> {

	@Override
	public String fromDomainToValue(Article domain) {
		return domain.getNativeValue();
	}

	@Override
	public Article fromValueToDomain(String value) {
		return new ARTICLE(value);
	}

}
