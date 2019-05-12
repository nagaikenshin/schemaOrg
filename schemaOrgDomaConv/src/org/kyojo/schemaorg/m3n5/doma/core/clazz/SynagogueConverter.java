package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.SYNAGOGUE;
import org.kyojo.schemaorg.m3n5.core.Clazz.Synagogue;

@ExternalDomain
public class SynagogueConverter implements DomainConverter<Synagogue, String> {

	@Override
	public String fromDomainToValue(Synagogue domain) {
		return domain.getNativeValue();
	}

	@Override
	public Synagogue fromValueToDomain(String value) {
		return new SYNAGOGUE(value);
	}

}