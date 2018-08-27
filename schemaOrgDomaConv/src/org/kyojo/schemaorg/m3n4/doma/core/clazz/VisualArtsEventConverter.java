package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.VISUAL_ARTS_EVENT;
import org.kyojo.schemaorg.m3n4.core.Clazz.VisualArtsEvent;

@ExternalDomain
public class VisualArtsEventConverter implements DomainConverter<VisualArtsEvent, String> {

	@Override
	public String fromDomainToValue(VisualArtsEvent domain) {
		return domain.getNativeValue();
	}

	@Override
	public VisualArtsEvent fromValueToDomain(String value) {
		return new VISUAL_ARTS_EVENT(value);
	}

}
