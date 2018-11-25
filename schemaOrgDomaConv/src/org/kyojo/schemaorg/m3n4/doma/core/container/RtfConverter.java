package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.RTF;
import org.kyojo.schemaorg.m3n4.core.Container.Rtf;

@ExternalDomain
public class RtfConverter implements DomainConverter<Rtf, String> {

	@Override
	public String fromDomainToValue(Rtf domain) {
		return domain.getNativeValue();
	}

	@Override
	public Rtf fromValueToDomain(String value) {
		return new RTF(value);
	}

}
