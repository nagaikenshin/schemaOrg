package org.kyojo.schemaOrg.m3n3.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.SATIRICAL_ARTICLE;
import org.kyojo.schemaOrg.m3n3.pending.Clazz.SatiricalArticle;

@ExternalDomain
public class SatiricalArticleConverter implements DomainConverter<SatiricalArticle, String> {

	@Override
	public String fromDomainToValue(SatiricalArticle domain) {
		return domain.getNativeValue();
	}

	@Override
	public SatiricalArticle fromValueToDomain(String value) {
		return new SATIRICAL_ARTICLE(value);
	}

}
