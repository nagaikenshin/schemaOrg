package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SCHOLARLY_ARTICLE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.ScholarlyArticle;

@ExternalDomain
public class ScholarlyArticleConverter implements DomainConverter<ScholarlyArticle, String> {

	@Override
	public String fromDomainToValue(ScholarlyArticle domain) {
		return domain.getNativeValue();
	}

	@Override
	public ScholarlyArticle fromValueToDomain(String value) {
		return new SCHOLARLY_ARTICLE(value);
	}

}
