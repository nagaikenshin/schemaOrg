package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.KEYWORDS;
import org.kyojo.schemaorg.m3n5.core.Container.Keywords;

@ExternalDomain
public class KeywordsConverter implements DomainConverter<Keywords, String> {

	@Override
	public String fromDomainToValue(Keywords domain) {
		return domain.getNativeValue();
	}

	@Override
	public Keywords fromValueToDomain(String value) {
		return new KEYWORDS(value);
	}

}
