package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.EXHIBITION_EVENT;
import org.kyojo.schemaorg.m3n4.core.Clazz.ExhibitionEvent;

@ExternalDomain
public class ExhibitionEventConverter implements DomainConverter<ExhibitionEvent, String> {

	@Override
	public String fromDomainToValue(ExhibitionEvent domain) {
		return domain.getNativeValue();
	}

	@Override
	public ExhibitionEvent fromValueToDomain(String value) {
		return new EXHIBITION_EVENT(value);
	}

}
