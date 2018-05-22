package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.TECH_ARTICLE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.TechArticle;

@ExternalDomain
public class TechArticleConverter implements DomainConverter<TechArticle, String> {

	@Override
	public String fromDomainToValue(TechArticle domain) {
		return domain.getNativeValue();
	}

	@Override
	public TechArticle fromValueToDomain(String value) {
		return new TECH_ARTICLE(value);
	}

}
