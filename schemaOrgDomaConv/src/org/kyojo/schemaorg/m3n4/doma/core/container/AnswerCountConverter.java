package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.ANSWER_COUNT;
import org.kyojo.schemaorg.m3n4.core.Container.AnswerCount;

@ExternalDomain
public class AnswerCountConverter implements DomainConverter<AnswerCount, Long> {

	@Override
	public Long fromDomainToValue(AnswerCount domain) {
		return domain.getNativeValue();
	}

	@Override
	public AnswerCount fromValueToDomain(Long value) {
		return new ANSWER_COUNT(value);
	}

}