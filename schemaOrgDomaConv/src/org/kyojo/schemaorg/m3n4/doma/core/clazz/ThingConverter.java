package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.THING;
import org.kyojo.schemaorg.m3n4.core.Clazz.Thing;

@ExternalDomain
public class ThingConverter implements DomainConverter<Thing, String> {

	@Override
	public String fromDomainToValue(Thing domain) {
		return domain.getNativeValue();
	}

	@Override
	public Thing fromValueToDomain(String value) {
		return new THING(value);
	}

}
