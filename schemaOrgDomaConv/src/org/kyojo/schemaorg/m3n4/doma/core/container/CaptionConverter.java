package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.CAPTION;
import org.kyojo.schemaorg.m3n4.core.Container.Caption;

@ExternalDomain
public class CaptionConverter implements DomainConverter<Caption, String> {

	@Override
	public String fromDomainToValue(Caption domain) {
		return domain.getNativeValue();
	}

	@Override
	public Caption fromValueToDomain(String value) {
		return new CAPTION(value);
	}

}
