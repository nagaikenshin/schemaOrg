package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.WORD_COUNT;
import org.kyojo.schemaorg.m3n4.core.Container.WordCount;

@ExternalDomain
public class WordCountConverter implements DomainConverter<WordCount, Long> {

	@Override
	public Long fromDomainToValue(WordCount domain) {
		return domain.getNativeValue();
	}

	@Override
	public WordCount fromValueToDomain(Long value) {
		return new WORD_COUNT(value);
	}

}
