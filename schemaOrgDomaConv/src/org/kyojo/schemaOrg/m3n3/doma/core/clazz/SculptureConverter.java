package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SCULPTURE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Sculpture;

@ExternalDomain
public class SculptureConverter implements DomainConverter<Sculpture, String> {

	@Override
	public String fromDomainToValue(Sculpture domain) {
		return domain.getNativeValue();
	}

	@Override
	public Sculpture fromValueToDomain(String value) {
		return new SCULPTURE(value);
	}

}
