package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.SENDER;
import org.kyojo.schemaorg.m3n4.core.Container.Sender;

@ExternalDomain
public class SenderConverter implements DomainConverter<Sender, String> {

	@Override
	public String fromDomainToValue(Sender domain) {
		return domain.getNativeValue();
	}

	@Override
	public Sender fromValueToDomain(String value) {
		return new SENDER(value);
	}

}
