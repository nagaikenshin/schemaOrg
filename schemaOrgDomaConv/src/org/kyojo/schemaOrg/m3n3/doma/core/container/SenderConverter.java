package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SENDER;
import org.kyojo.schemaOrg.m3n3.core.Container.Sender;

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
