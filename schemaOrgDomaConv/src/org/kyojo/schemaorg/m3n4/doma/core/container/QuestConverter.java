package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.QUEST;
import org.kyojo.schemaorg.m3n4.core.Container.Quest;

@ExternalDomain
public class QuestConverter implements DomainConverter<Quest, String> {

	@Override
	public String fromDomainToValue(Quest domain) {
		return domain.getNativeValue();
	}

	@Override
	public Quest fromValueToDomain(String value) {
		return new QUEST(value);
	}

}
