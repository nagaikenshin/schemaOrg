package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.LITERARY_EVENT;
import org.kyojo.schemaorg.m3n5.core.Clazz.LiteraryEvent;

@ExternalDomain
public class LiteraryEventConverter implements DomainConverter<LiteraryEvent, String> {

	@Override
	public String fromDomainToValue(LiteraryEvent domain) {
		return domain.getNativeValue();
	}

	@Override
	public LiteraryEvent fromValueToDomain(String value) {
		return new LITERARY_EVENT(value);
	}

}
