package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PLAYGROUND;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Playground;

@ExternalDomain
public class PlaygroundConverter implements DomainConverter<Playground, String> {

	@Override
	public String fromDomainToValue(Playground domain) {
		return domain.getNativeValue();
	}

	@Override
	public Playground fromValueToDomain(String value) {
		return new PLAYGROUND(value);
	}

}
