package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.CAPTION;
import org.kyojo.schemaOrg.m3n3.core.Container.Caption;

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
