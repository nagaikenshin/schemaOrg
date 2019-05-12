package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.ASSOCIATED_ARTICLE;
import org.kyojo.schemaorg.m3n5.core.Container.AssociatedArticle;

@ExternalDomain
public class AssociatedArticleConverter implements DomainConverter<AssociatedArticle, String> {

	@Override
	public String fromDomainToValue(AssociatedArticle domain) {
		return domain.getNativeValue();
	}

	@Override
	public AssociatedArticle fromValueToDomain(String value) {
		return new ASSOCIATED_ARTICLE(value);
	}

}
