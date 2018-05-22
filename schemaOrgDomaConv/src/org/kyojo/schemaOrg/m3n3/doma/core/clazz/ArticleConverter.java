package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ARTICLE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Article;

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
