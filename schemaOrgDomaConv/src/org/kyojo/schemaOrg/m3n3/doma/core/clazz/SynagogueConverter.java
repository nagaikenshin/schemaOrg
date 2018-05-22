package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SYNAGOGUE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Synagogue;

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
